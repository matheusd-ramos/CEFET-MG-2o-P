package caixa;

public class Item {
    private Produto produto;
    private double qtde;
    private double preco_total;

    public Item(Produto produto, double qtde, double preco_total) {
        this.produto = produto;
        this.qtde = qtde;
        this.preco_total = preco_total;
    }

    public Produto geProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }    
    
    public double getQtde() {
        return qtde;
    }

    public void setQtde(double qtde) {
        this.qtde = qtde;
    }
    
    public double getPreco_total() {
        return preco_total;
    }

    public void setPreco_total(double preco_total) {
        this.preco_total = preco_total;
    }
}
