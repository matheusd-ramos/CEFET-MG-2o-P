package negocio;

import java.util.HashMap;

public class Agenda {

    private HashMap<String, Contato> contatos;

    public Agenda() {
       contatos = new HashMap<>();
    }

    public boolean incluirContato(Contato contato){
        if(contatos.put(contato.getNome(), contato) == null){
            return true;
        }
        return false;
    }

    public boolean removerContato(String nome){
        if(contatos.remove(nome) == null){
            return false;
        }
        return true;
    }

    public boolean existeContato(String nome){
        return contatos.containsKey(nome);  
    }

    public Contato consultarContato(String nome) throws ContatoInexistenteException{
        if(contatos.get(nome) == null){
            throw new ContatoInexistenteException();
        }
        return contatos.get(nome);
    }

    public HashMap<String, Contato> getContatos() {
        return contatos;
    }

    public void setContatos(HashMap<String, Contato> contatos) {
        this.contatos = contatos;
    }

    
}