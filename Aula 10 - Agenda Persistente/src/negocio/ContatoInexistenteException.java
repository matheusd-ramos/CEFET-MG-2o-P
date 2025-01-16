package negocio;

public class ContatoInexistenteException extends Exception{
    public ContatoInexistenteException(){
        super("Contato nao encontrado");
    }
}
