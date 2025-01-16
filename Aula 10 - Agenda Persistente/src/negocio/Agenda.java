package negocio;

import java.util.HashMap;

public class Agenda {
    
    private HashMap<String, Contato> contatos;

    public boolean incluirContato(Contato contato){
        if(contatos.put(contato.getNome(), contato) == null){
            return true;
        }
        return false;
    }

    public boolean removerContato(Contato contato){
        if(contatos.remove(contato.getNome()) != null){
            return true;
        }
        return false;
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
}