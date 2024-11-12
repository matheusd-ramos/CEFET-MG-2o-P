package caixa;

import java.util.Scanner;

public class Caixa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //System.in significa a entrada padrão (teclado)
        Estoque estoque = new Estoque(); // Criando um objeto estoque
        Venda carrinho = new Venda(); // Criando um objeto carrinho
        int codigo;

        estoque.inserirProduto(new Item(new Produto(11111, "Detergente ABC", 1.00), 10));
        estoque.inserirProduto(new Item(new Produto(22222, "Sabao em po OMO", 6.50), 10));
        estoque.inserirProduto(new Item(new Produto(33333, "Shampoo Beleza Facil", 12.00), 10));
        estoque.inserirProduto(new Item(new Produto(44444, "Creme dental Colgate", 3.50), 10));
        estoque.inserirProduto(new Item(new Produto(55555, "Sabonete Nivea", 1.80), 10));
        estoque.inserirProduto(new Item(new Produto(66666, "Biscoito Maizena", 2.00), 10));
        estoque.inserirProduto(new Item(new Produto(77777, "Leite desnatado Parmalat", 3.00), 10));

        do{
            System.out.println("Bem vindo(a) ao Nossosuper!");
            System.out.println("");
            System.out.println("Produtos disponiveis em estoque:");
            System.out.println("");
            System.out.println("Codigo - Descricao - Preco");
            System.out.println("11111 - Detergente ABC - R$1,00");
            System.out.println("22222 - Sabão em po OMO - R$6,50");
            System.out.println("33333 - Shampoo Beleza Facil - R$12,00");
            System.out.println("44444 - Creme dental Colgate - R$3,50");
            System.out.println("55555 - Sabonete Nivea - R$1,80");
            System.out.println("66666 - Biscoito Maizena - R$2,00");
            System.out.println("77777 - Leite desnatado Parmalat - R$3,00");
            System.out.println("");

            System.out.print("Digite o codigo do produto que deseja: ");
            codigo = input.nextInt();

            if(codigo == 0){
                System.out.println("Valor total no carrinho: R$" + carrinho.somador());
                System.out.println("Obrigado por comprar em nosso supermercado!");
                break;
            }
        
            if(estoque.verificarEstoque(codigo)){
                System.out.println("Produto em estoque!");
                System.out.print("Digite a quantidade que deseja: ");
                int quantidade = input.nextInt();

                if(carrinho.adicionarAoCarrinho(estoque, codigo, quantidade)){
                    System.out.println("Produto adicionado ao carrinho!");
                } else 
                    System.out.println("Nao foi possivel adicionar o produto ao carrinho. Verifique a quantidade e tente novamente.");

            } else {
                System.out.println("Produto nao encontrado. Verifique o codigo e tente novamente."); 
                System.out.println("");
            }
    
        } while(codigo != 0);
        
        input.close();
    }
}
