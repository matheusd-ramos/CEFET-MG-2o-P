package servicos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;
import negocio.Contato;
import java.nio.file.Paths;

public class ManipulaArquivoTexto {
    public String arquivo;
    public Formatter gravador;
    public Scanner leitor;

    public void abrirArquivoParaGravacao(){
        try {
            gravador = new Formatter("agendaPessoal.txt");
        } catch (SecurityException se) {
            System.err.println("Permissao de escrita negada");
            System.exit(1);
        } catch (FileNotFoundException fe) {
            System.err.println("Arquivo nao encontrado");
            System.exit(1);
        }
    }

    public void gravarContatos(HashMap<String, Contato> contatos) {
        try {
            for (Contato contato : contatos.values()) {
                gravador.format("Nome: %s%nTelefone: %s%nEmail: %s%nEndereço: %s%n%n", contato.getNome(), 
                contato.getTelefone(), contato.getEmail(), contato.getEndereco()); 
            }
        } catch (Exception e) {
            System.err.println("Erro ao gravar contatos");
        } 
    }

    public void fecharArquivoParaGravacao(){
        if(gravador != null){
            gravador.close();
        }
    }

    public void abrirArquivoParaLeitura(){
        try {
            leitor = new Scanner(Paths.get("agendaPessoal.txt"));
        } catch (IOException io){
            System.err.println("Erro ao abrir arquivo");
        }
    }

    public ArrayList<Contato> lerArquivo(){
        ArrayList<Contato> contatos = new ArrayList<>();
        
        try {
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                Contato aux = new Contato();

                if (linha.startsWith("Nome: ")) {
                    aux.setNome(linha.substring(6));
                } else {
                    continue;
                }

                if (leitor.hasNextLine()) {
                    linha = leitor.nextLine();
                    if (linha.startsWith("Telefone: ")) {
                        aux.setTelefone(linha.substring(10));
                    }
                }

                if (leitor.hasNextLine()) {
                    linha = leitor.nextLine();
                    if (linha.startsWith("Email: ")) {
                        aux.setEmail(linha.substring(7));
                    }
                }

                if (leitor.hasNextLine()) {
                    linha = leitor.nextLine();
                    if (linha.startsWith("Endereço: ")) {
                        aux.setEndereco(linha.substring(10));
                    }
                }

                contatos.add(aux);
            } 
        } catch (NoSuchElementException ns) {
            System.err.println("Arquivo formado incorretamente");
        } catch (IllegalStateException is) {
            System.err.println("Erro ao ler o arquivo");
        }

        return contatos;
    }

    public void fecharArquivoParaLeitura(){
        if(leitor != null){
            leitor.close();
        }
    }
}