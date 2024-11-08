package callcenter;

import java.util.HashSet;

public class Interpretadora {
    private HashSet<String> palavraChave;

    public Interpretadora(){
        palavraChave = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavraChave.add(palavra);
    }

    public void separaFrase(String frase){
        String[] palavras = frase.split(" "); // Tokeniza a frase em um vetor de strings
        for(String token: palavras){
            adicionarPalavra(token);
        }
    }
}
