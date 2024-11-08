package callcenter;

import java.util.Scanner;

public class CallCenter {
    public static void main(String[] args){ // "static" significa que o método não pertence à nenhuma instância
        SuporteTecnico suporte = new SuporteTecnico();
        suporte.buscaSolucao(null);
        Scanner input = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de Suporte Tecnico");
        System.err.println("");
        System.out.println("Pressione <enter> para continuar ou digite 'sair' para sair do sistema.");
        input.nextLine();
        
    }
}
