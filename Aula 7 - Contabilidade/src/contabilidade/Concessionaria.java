package contabilidade;

public class Concessionaria extends Conta {

    public Concessionaria(int diaVencimento, int mesVencimento, double valor){
        super(diaVencimento, mesVencimento, valor);
    }

    public double getValorAPagar(int diaPgto, int mesPgto){
        return valor;
    }
}
