package servicos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorArq {

    private Scanner leitor;

    public void abrirArqParaLeitura(){
        try{
            leitor = new Scanner(new File("src/servicos/palavras.txt"));
        } catch (IOException io){
            System.out.println("Erro ao abrir o arquivo");
        }
    }
    
    public ArrayList<String> lerArquivo(){
        ArrayList<String> palavras = new ArrayList<>();
        String linha[] = leitor.nextLine().split(" ");

        for(String palavra: linha){
            palavras.add(palavra);
        }
        leitor.close();
        return palavras;
    }
}
