package contabilidade;

import java.util.ArrayList;

public class ControlePagamento {
    private ArrayList<Passivo> pagamentos;

    public ControlePagamento(){
        this.pagamentos = new ArrayList<>();
    }

    public void adicionarPassivo(Passivo p){
        pagamentos.add(p);
    }

    public double calcularValorTotalEmpregados(int diaPgto, int mesPgto){
        double valorTotal = 0;
        for(Passivo aux: pagamentos){
            if(aux instanceof Empregado)
            valorTotal += aux.getValorAPagar(diaPgto, mesPgto);
        }
        return valorTotal;
    }

    public double calcularValorTotalContas(int diaPgto, int mesPgto){
        double valorTotal = 0;
        for(Passivo aux: pagamentos){
            if(aux instanceof Conta)
            valorTotal += aux.getValorAPagar(diaPgto, mesPgto);
        }
        return valorTotal;
    }
}
