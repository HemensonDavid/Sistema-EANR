-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 31-Jul-2019 às 03:42
-- Versão do servidor: 5.7.23
-- versão do PHP: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sistemaeanr`
--
CREATE DATABASE IF NOT EXISTS `sistemaeanr` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `sistemaeanr`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `nome_completo` varchar(50) NOT NULL,
  `sexo` char(1) DEFAULT NULL,
  `cpf` char(14) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `cidade` varchar(20) NOT NULL,
  `rua` varchar(100) DEFAULT NULL,
  `numero_casa` mediumint(3) DEFAULT NULL,
  `bairro` varchar(15) NOT NULL,
  `complemento` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cpf`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `empresa`
--

DROP TABLE IF EXISTS `empresa`;
CREATE TABLE IF NOT EXISTS `empresa` (
  `cnpj` char(18) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `empresa_password` mediumtext NOT NULL,
  PRIMARY KEY (`cnpj`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Acionadores `empresa`
--
DROP TRIGGER IF EXISTS `empresa_AFTER_DELETE`;
DELIMITER $$
CREATE TRIGGER `empresa_AFTER_DELETE` AFTER DELETE ON `empresa` FOR EACH ROW BEGIN
	DELETE FROM user WHERE email = OLD.email;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pagamento`
--

DROP TABLE IF EXISTS `pagamento`;
CREATE TABLE IF NOT EXISTS `pagamento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cpf_cliente` varchar(14) NOT NULL,
  `custo_total` decimal(6,2) NOT NULL,
  `valor_recebido` decimal(6,2) DEFAULT NULL,
  `valor_restante` decimal(6,2) DEFAULT '0.00',
  `status_pagamento` varchar(15) DEFAULT 'PENDENTE',
  `tipo_de_pagamento` varchar(50) DEFAULT NULL,
  `numero_servico` int(11) NOT NULL,
  `troco` decimal(6,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cpf_cliente` (`cpf_cliente`),
  KEY `numero_servico` (`numero_servico`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Acionadores `pagamento`
--
DROP TRIGGER IF EXISTS `pagamento_AFTER_UPDATE`;
DELIMITER $$
CREATE TRIGGER `pagamento_AFTER_UPDATE` AFTER UPDATE ON `pagamento` FOR EACH ROW BEGIN
	update servico SET status_servico = NEW.status_pagamento 
    WHERE id = NEW.numero_servico;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `servico`
--

DROP TABLE IF EXISTS `servico`;
CREATE TABLE IF NOT EXISTS `servico` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cpf_cliente_interessado` varchar(16) NOT NULL,
  `equipamento` varchar(50) NOT NULL,
  `data_de_agendamento` date NOT NULL,
  `data_prevista_para_termino` date DEFAULT NULL,
  `status_servico` varchar(15) DEFAULT 'Pendente',
  `valor_do_servico` decimal(6,2) NOT NULL,
  `observacao` varchar(255) DEFAULT NULL,
  `especificacao` varchar(255) DEFAULT NULL,
  `tipo_de_servico` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Acionadores `servico`
--
DROP TRIGGER IF EXISTS `servico_AFTER_DELETE`;
DELIMITER $$
CREATE TRIGGER `servico_AFTER_DELETE` AFTER DELETE ON `servico` FOR EACH ROW BEGIN
	DELETE FROM pagamento
    WHERE numero_servico = OLD.id;
END
$$
DELIMITER ;
DROP TRIGGER IF EXISTS `servico_AFTER_INSERT`;
DELIMITER $$
CREATE TRIGGER `servico_AFTER_INSERT` AFTER INSERT ON `servico` FOR EACH ROW BEGIN
	INSERT INTO pagamento(cpf_cliente, custo_total, numero_servico) 
    values (NEW.cpf_cliente_interessado, NEW.valor_do_servico, NEW.id);
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` tinyint(2) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `user_password` mediumtext NOT NULL,
  `email` varchar(50) NOT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
