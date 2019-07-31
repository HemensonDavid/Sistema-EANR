package br.edu.model.util;

import java.util.Random;

public abstract class GerarPalavraChave {

    private static final String SUFIXO = "EANR";
    private static final int QUANTIDADE_CARACTERES = 7;

    /**
     * Retorna a frase gerada
     *
     * @return
     */
    public static String getFrase() {
        Random random = new Random();

        String frase = gerarFraseLonga();

        return frase + SUFIXO;
    }
    
    /**
     * Retorna uma String aleartoria
     * 
     * @return 
     */
    private static String gerarFraseLonga(){
        // Determia as letras que poderão estar presente nas chaves
        String letras = "ABCDEFGHIJKLMNOPQRSTUVYWXZ1234567890";

        Random random = new Random();

        String armazenaChaves = "";
        int index = -1;
        for (int i = 0; i <= QUANTIDADE_CARACTERES; i++) {
            index = random.nextInt(letras.length());
            armazenaChaves += letras.substring(index, index + 1);
        }
        
        return armazenaChaves;
    }
}
