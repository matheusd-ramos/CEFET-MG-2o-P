package contabilidade;

public class Titulo extends Conta{

    public Titulo(int diaVencimento, int mesVencimento, double valor){
        super(diaVencimento, mesVencimento, valor);
    }

    @Override
    public double getValorAPagar(int diaPgto, int mesPgto){
        if(diaPgto > diaVencimento && mesPgto == mesVencimento || mesPgto > mesVencimento){
            return valor * 1.1;
        }
        return valor;
    }

}
