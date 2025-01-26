package visao;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import negocio.Agenda;
import negocio.Contato;
import negocio.ContatoInexistenteException;
import servicos.ManipulaArquivoTexto;

public class AppAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner input = new Scanner(System.in);
        int op = 0;
        ManipulaArquivoTexto arquivo = new ManipulaArquivoTexto();

        String nome;
        String telefone;
        String endereco;
        String email;

        do{
            System.out.println("Bem vindo(a) à sua Agenda Pessoal!");
            System.out.println();
            System.out.println("O que deseja fazer?");
            System.out.println();
            System.out.println("1 - Incluir um contato");
            System.out.println("2 - Remover um contato");
            System.out.println("3 - Procurar um contato pelo nome");
            System.out.println("4 - Listar todos os contatos");
            System.out.println("5 - Salvar agenda");
            System.out.println("6 - Ler agenda existente");
            System.out.println("0 - Sair do sistema");
            System.out.println();
            System.out.println("Digite um numero valido: ");

            op = input.nextInt();

            switch(op){

                case 1:
                    System.out.println();
                    input.nextLine();
                    System.out.print("Digite o NOME do contato: ");
                    nome = input.nextLine();
                    System.out.print("Digite o TELEFONE do contato: ");
                    telefone = input.nextLine();
                    System.out.print("Digite o ENDERECO do contato: ");
                    endereco = input.nextLine();
                    System.out.print("Digite o EMAIL do contato: ");
                    email = input.nextLine();
                    Contato aux = new Contato(nome, telefone, email, endereco);
                    
                    if(agenda.incluirContato(aux))
                        System.out.println("Contato salvo!");
                    else
                        System.out.println("Erro ao salvar contato");
                    
                    break;

                case 2: 
                    System.out.println();
                    input.nextLine();
                    System.out.print("Digite o nome do contato que deseja remover: ");
                    nome = input.nextLine();
                   
                    try {
                        if(!agenda.removerContato(nome))
                            throw new ContatoInexistenteException();
                        else
                            System.out.println("Contato removido com sucesso!");
                    } catch (ContatoInexistenteException c) {
                        System.out.println(c.getMessage());
                    }
                    break;

                case 3: 
                    System.out.println();
                    input.nextLine();
                    System.out.println("Digite o nome do contato que deseja buscar: ");
                    nome = input.nextLine();

                    try {
                        aux = agenda.consultarContato(nome);
                        System.out.println("Nome: " + aux.getNome());
                        System.out.println("Telefone: " + aux.getTelefone());
                        System.out.println("Email: " + aux.getEmail());
                        System.out.println("Endereco: " + aux.getEndereco());

                    } catch (ContatoInexistenteException c) {
                        System.out.println(c.getMessage());
                    }
                    break;

                case 4: 
                    if (agenda.getContatos().isEmpty()) {
                        System.out.println("Não há contatos salvos na agenda.");
                    } else {
                        for (Map.Entry<String, Contato> entrada : agenda.getContatos().entrySet()) {
                            System.out.println();
                            System.out.println("Nome: " + entrada.getValue().getNome());
                            System.out.println("Telefone: " + entrada.getValue().getTelefone());
                            System.out.println("Email: " + entrada.getValue().getEmail());
                            System.out.println("Endereco: " + entrada.getValue().getEndereco());
                        }
                        System.out.println();
                    }
                    break;

                case 5: 
                    arquivo.abrirArquivoParaGravacao();
                    arquivo.gravarContatos(agenda.getContatos());
                    arquivo.fecharArquivoParaGravacao();
                    break;

                case 6:
                    arquivo.abrirArquivoParaLeitura(); 
                    ArrayList<Contato> contatosLidos = arquivo.lerArquivo(); 
                    for (Contato contato : contatosLidos) {
                        agenda.incluirContato(contato); 
                    }
                    arquivo.fecharArquivoParaLeitura(); 
                    System.out.println("Agenda carregada com sucesso!");
                    break;

                case 0:
                    System.out.println();
                    System.out.println("Obrigado por usar o nosso sistema!");
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Digite um numero valido! (0 a 6)");
                    break;
            }   

        } while(op != 0);

        input.close();
    }
}
