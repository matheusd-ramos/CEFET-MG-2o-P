package contabilidade;

public class AssalariadoComissionado extends Comissionado {

    private double percentualBonus;

    public AssalariadoComissionado(String nome, String sobrenome, int numIdent, double valorVendas, double percentualBonus){
        super(nome, sobrenome, numIdent, valorVendas);
        this.percentualBonus = percentualBonus;
    }

    @Override
    public double getValorAPagar(int diaPgto, int mesPgto){
        return SALARIO * (percentualBonus + 1) + super.getValorAPagar(diaPgto, mesPgto); // Poderia ser Passivo.SALARIO também
    }

}
