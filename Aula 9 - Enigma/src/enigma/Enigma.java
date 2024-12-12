import java.util.Scanner;

public class Enigma {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        Chave chave = new Chave(3);
        CifraDeCesar cifra = new CifraDeCesar(chave);

        String mensagemOriginal = "hello";
        String mensagemCifrada = cifra.cifrar(mensagemOriginal);
        
        System.out.println("Mensagem cifrada: " + mensagemCifrada);
        System.out.println("Deslocamento usado: 3");
        
        System.out.println("\nTente decifrar a mensagem!");
        System.out.print("Sua resposta: ");
        String tentativa = input.nextLine();
        
        try {
            cifra.verificarMensagem(tentativa);
            
            if(!tentativa.equals(mensagemOriginal)) {
                throw new DecifragemInvalidaException();
            }
            
            System.out.println("Parabéns! Você decifrou corretamente!");
            
        } catch (DecifragemInvalidaException e) {
            System.out.println(e.getMessage());
            System.out.println("A mensagem correta era: " + mensagemOriginal);
        } finally {
            input.close();
        }
        
        input.close();
    }
}
