package contabilidade;

public class Titulo extends Conta{

    public Titulo(int diaVencimento, int mesVencimento, double valor){
        super(diaVencimento, mesVencimento, valor);
    }

    @Override
    public double getValorAPagar(int diaPgto, int mesPgto){
        double retorno = 0;
        if(diaPgto > diaVencimento && mesPgto == mesVencimento || mesPgto > mesVencimento){
            retorno = valor * 1.10;
        }
        return retorno;
    }

}
