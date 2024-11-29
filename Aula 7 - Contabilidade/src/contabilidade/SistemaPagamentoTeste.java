package contabilidade;

public class SistemaPagamentoTeste {
    public static void main(String[] args) throws Exception {
       ControlePagamento pagamentos = new ControlePagamento();

       // Instanciando os objetos de Novembro

       Titulo titulosNov = new Titulo(15, 11, 3000);
       Concessionaria concessionariaNov = new Concessionaria(15, 11, 1000);
       Assalariado A1 = new Assalariado("John", "Lennon", 1111, 5);
       AssalariadoComissionado AC1 = new AssalariadoComissionado("George", "Harrison", 2222, 2200, 0.1);
       Comissionado C1 = new Comissionado("Paul", "McCartney", 3333, 15000);
       Terceirizado T1 = new Terceirizado("Ringo", "Starr", 4444, 50);

       // Adicionando os objetos à lista de pagamentos
       
       pagamentos.adicionarPassivo(titulosNov); 
       pagamentos.adicionarPassivo(concessionariaNov);
       pagamentos.adicionarPassivo(A1);
       pagamentos.adicionarPassivo(AC1);
       pagamentos.adicionarPassivo(C1);
       pagamentos.adicionarPassivo(T1);

       // Calculando o valor total a pagar (não atrasado)
        System.out.println();
        System.out.println("Pagamento em dia: ");
        System.out.println();

        System.out.println("O valor a pagar aos os empregados eh " + pagamentos.calcularValorTotalEmpregados(15, 11));
        System.out.println("O valor a pagar de contas eh " + pagamentos.calcularValorTotalContas(15, 11));
        System.out.println("O valor total a pagar eh " + (pagamentos.calcularValorTotalContas(15, 11) + pagamentos.calcularValorTotalEmpregados(15, 11)));

        // Se os pagamentos estiverem atrasados, por exemplo, em um dia

        System.out.println();
        System.out.println("Pagamento atrasado em um dia: ");
        System.out.println();

        System.out.println("O valor a pagar aos empregados eh " + pagamentos.calcularValorTotalEmpregados(16, 11));
        System.out.println("O valor a pagar de contas eh " + pagamentos.calcularValorTotalContas(16, 11));
        System.out.println("O valor total a pagar eh " + (pagamentos.calcularValorTotalContas(16, 11) + pagamentos.calcularValorTotalEmpregados(16, 11)));

        // Se o atraso for de um mês
        System.out.println();
        System.out.println("Pagamento atrasado em um mês: ");
        System.out.println();

        System.out.println("O valor a pagar aos empregados eh " + pagamentos.calcularValorTotalEmpregados(15, 12));
        System.out.println("O valor a pagar de contas eh " + pagamentos.calcularValorTotalContas(15, 12));
        System.out.println("O valor total a pagar eh " + (pagamentos.calcularValorTotalContas(15, 12) + pagamentos.calcularValorTotalEmpregados(15, 12)));
    }
}
