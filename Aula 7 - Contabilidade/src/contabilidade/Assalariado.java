package contabilidade;

public class Assalariado extends Empregado{
    private double horasExtras;

    public Assalariado(String nome, String sobrenome, int numIdent, double horasExtras){
        super(nome, sobrenome, numIdent);
        this.horasExtras = horasExtras;
    }

    public double getValorAPagar(int diaPgto, int mesPgto){
        return SALARIO + horasExtras * VALORHORAEXTRA;
    }
}
