import java.util.Scanner;

public class Enigma {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        // Criar uma chave com deslocamento 3 (cifra de César clássica)
        Chave chave = new Chave(3);
        CifraDeCesar cifra = new CifraDeCesar(chave);

        // Mensagem original e cifrada
        String mensagemOriginal = "hello";
        String mensagemCifrada = cifra.cifrar(mensagemOriginal);
        
        // Mostrar a mensagem cifrada e o deslocamento
        System.out.println("Mensagem cifrada: " + mensagemCifrada);
        System.out.println("Deslocamento usado: 3");
        
        // Pedir ao usuário para tentar decifrar
        System.out.println("\nTente decifrar a mensagem!");
        System.out.print("Sua resposta: ");
        String tentativa = scanner.nextLine();
        
        try {
            // Verificar se a tentativa pode ser cifrada/decifrada corretamente
            cifra.verificarMensagem(tentativa);
            
            // Se a tentativa for diferente da mensagem original, lança exceção
            if(!tentativa.equals(mensagemOriginal)) {
                throw new DecifragemInvalidaException();
            }
            
            System.out.println("Parabéns! Você decifrou corretamente!");
            
        } catch (DecifragemInvalidaException e) {
            System.out.println("Ops! A mensagem correta era: " + mensagemOriginal);
        }
        
        scanner.close();
    }
}
