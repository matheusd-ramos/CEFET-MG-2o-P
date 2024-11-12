package caixa;

public class Venda {
    private Item carrinho[];
    private int quantidade;

    public Venda(Item[] carrinho, int quantidade) {
        this.carrinho = carrinho;
        this.quantidade = quantidade;
    }

    public Venda(){
        this.carrinho = new Item[10];
        this.quantidade = 0;
    }

    public boolean adicionarAoCarrinho(Estoque estoque, int codigo, int quantidade){
        Item[] itensEstoque = estoque.getEstoque();

        for(int i=0; i<itensEstoque.length; i++){
            if(itensEstoque[i] != null && codigo == itensEstoque[i].getProduto().getCodigo()){
                if(itensEstoque[i].getQtde() >= quantidade){
                    for(int j=0; j<carrinho.length; j++){
                        if(carrinho[j] == null){
                            carrinho[j] = new Item(itensEstoque[i].getProduto(), quantidade);
                            itensEstoque[i].setQtde(itensEstoque[i].getQtde() - quantidade);
                            this.quantidade += quantidade;
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public double somador(){
        double valorTotal = 0.0;
        
        for (Item item : carrinho) {
            if (item != null) {
                valorTotal += item.getProduto().getPreco() * item.getQtde();
            }
        }

        return valorTotal;
    }

    public Item[] getItens() {
        return carrinho;
    }

    public void setItens(Item[] carrinho) {
        this.carrinho = carrinho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
