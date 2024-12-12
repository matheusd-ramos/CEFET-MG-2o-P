import java.util.ArrayList;

public class Delegacao {

    private ArrayList<Modalidade> modalidades;
    private String nome;

    public Delegacao(String nome){
        modalidades = new ArrayList<>();
        this.nome = nome;
    }

    public boolean adicionarModalidade(Modalidade modalidade){
        return modalidades.add(modalidade);
    }
}
