package contabilidade;

public class Terceirizado extends Empregado {

    public double horasTrabalhadas;

    public Terceirizado(String nome, String sobrenome, int numIdent, double horasTrabalhadas){
        super(nome, sobrenome, numIdent);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorAPagar(int diaPgto, int diaVencimento){
        return VALORHORAEXTRA * horasTrabalhadas;
    }
}
