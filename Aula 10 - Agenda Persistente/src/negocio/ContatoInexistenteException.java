package negocio;

public class ContatoInexistenteException extends Exception{
    public ContatoInexistenteException(){
        super("Contato nao encontrado. Por favor, ferifique se o nome esta correto e tente novamente!");
    }
}
