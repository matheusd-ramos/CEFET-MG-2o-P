package callcenter;

import java.util.Scanner;
import java.util.HashSet;
import java.util.HashMap;

public class CallCenter {
    public static void main(String[] args){ 
        SuporteTecnico suporte = new SuporteTecnico();
        Interpretadora interpretadora = new Interpretadora();

        HashMap<String, String> bancoSolucoes = suporte.getBancoSolucoes();
        
        String problema = new String();
        Scanner input = new Scanner(System.in);
        String opcao = new String();

        mainLoop:do{
            
            HashSet<String> palavrasChave = interpretadora.getPalavraChave();
            palavrasChave.clear();
            
            System.out.println("");
            System.out.println("Bem-vindo ao sistema de Suporte Tecnico");
            System.err.println("");
            System.out.println("Pressione <enter> para continuar ou digite 'sair' para sair do sistema.");
            opcao = input.nextLine();

            if(opcao.equals("sair")){
                System.out.println("Obrigado por utilizar nossos serviços!");
                break;
            }

            System.out.println("Descreva seu problema de forma sucinta.");
            problema = input.nextLine();

            interpretadora.separaFrase(problema);

            for(String key: palavrasChave){
                if(bancoSolucoes.containsKey(key)){
                    System.out.println("");
                    System.out.println(suporte.buscaSolucao(key));
                    continue mainLoop;
                }
            }

            System.out.println(suporte.buscaRespostaPadrao());

        } while(!opcao.equals("sair"));
        
        input.close();
    }
}
