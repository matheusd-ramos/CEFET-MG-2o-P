import java.util.ArrayList;

public class Modalidade {

    private ArrayList<Membro> membros;
    private int maxMembros;
    private String nome;

    public Modalidade(int maxMembros, String nome){
        this.membros = new ArrayList<>();
        this.maxMembros = maxMembros;
        this.nome = nome;
    }

    public boolean adicionarMembro(Membro membro){
        if(contaMembros() < maxMembros)
            return membros.add(membro);
        return false;
    }

    public int contaMembros(){
        return membros.size();
    }

    public int contarAtletas(){
        int qtde = 0;
        for(Membro aux: membros){
            if(aux instanceof Atleta)
                qtde++;
        }
        return qtde;
    }

    public int contarTecnicos(){
        int qtde = 0;
        for(Membro aux: membros){
            if(aux instanceof Tecnico)
                qtde++;
        }
        return qtde;
    }

    public int contarProfSaude(){
        int qtde = 0;
        for(Membro aux: membros){
            if(aux instanceof ProfSaude)
                qtde++;
        }
        return qtde;
    }
}
