package modelo;

import java.util.ArrayList;
import java.util.Random;
import servicos.GerenciadorArq;

public class JogoDaForca {
    
    private String palavra;
    private Random gerador;
    private int numTentativas;

    public JogoDaForca(){
        gerador = new Random();
        numTentativas = 15;
    }

    public String sorteiaPalavra(){
        GerenciadorArq gerArq = new GerenciadorArq();
        gerArq.abrirArqParaLeitura();
        ArrayList<String> palavras = gerArq.lerArquivo();

        int numPalavras = palavras.size();
        int regexSorteada = gerador.nextInt(numPalavras); 
        palavra = palavras.get(regexSorteada);

        return palavra;
    }

    public int getNumTentativas() {
        return numTentativas;
    }

    public void setNumTentativas(int numTentativas) {
        this.numTentativas = numTentativas;
    }
}
