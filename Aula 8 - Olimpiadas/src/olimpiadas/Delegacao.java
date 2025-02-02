package olimpiadas;
import java.util.ArrayList;

public class Delegacao {

    private ArrayList<Modalidade> modalidades;
    
    public Delegacao(String nome){
        modalidades = new ArrayList<>();
    }

    public boolean adicionarModalidade(Modalidade modalidade){
        return modalidades.add(modalidade);
    }
}
