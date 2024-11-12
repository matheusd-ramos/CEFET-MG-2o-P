package caixa;
public class Estoque {
    private Item estoque[];

    public Estoque(Item[] estoque){
        this.estoque = estoque;
    }

    public Estoque(){
        this.estoque = new Item[7];
    }

    public boolean inserirProduto(Item item){
        for(int i=0; i<estoque.length; i++){
            if(estoque[i] == null){
                estoque[i] = item;
                return true;
            }
        }
        return false;
    }

    public boolean verificarEstoque(int codigo){
        for(int i=0; i<estoque.length; i++){
            if(estoque[i] != null && codigo == estoque[i].getProduto().getCodigo())
                return true;
        }
        return false;
    }

    public Item[] getEstoque(){
        return estoque;
    }

    public void setEstoque(Item estoque[]){
        this.estoque = estoque;
    }
}
