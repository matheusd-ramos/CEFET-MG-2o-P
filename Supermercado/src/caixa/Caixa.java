package caixa;

import java.util.Scanner;

public class Caixa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //System.in significa a entrada padrão (teclado)

        System.out.println("Bem vindo ao nosso Supermercado!");
        System.out.print("Por favor, informe o codigo do produto para incluir no estoque: ");
        int cod = input.nextInt();
        System.out.print("Por favor, informe a descricao do produto: ");
        String descricao = input.next();
        System.out.print("Por favor, informe o preco unitario do produto: ");
        double preco = input.nextDouble();
        System.out.print("Por favor, informe a quantidade do produto: ");
        double qtde = input.nextDouble();

        // Criando um objeto item de produto
        Item item = new Item(new Produto(cod, descricao, preco), qtde, qtde * preco);

        // Criando um objeto estoque
        Estoque estoque = new Estoque();
        
        // Armazenando um item dentro do estoque
        estoque.inserirProduto(item);
        
    }
}
