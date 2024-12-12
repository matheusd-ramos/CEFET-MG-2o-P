public class Teste {
    public static void main(String[] args) throws Exception {
        
        Modalidade skt = new Modalidade(6, "Skate");
        Delegacao br = new Delegacao("Brasileira");
        br.adicionarModalidade(skt);

        Atleta r = new Atleta("Rayssa", "Leal", "Feminino", 15, "Skate");
        Atleta k = new Atleta("Kelvin", "Hoefler", "Masculino", 35, "Skate");
        Atleta g = new Atleta("Gustavo", "Ribeiro", "Masculino", 34, "Skate");
        Atleta n = new Atleta("Nyjah", "Houston", "Masculino", 32, "Skate");
        Atleta p = new Atleta("Pamela", "Rosa", "Feminino", 30, "Skate");
        Atleta l = new Atleta("Leticia", "Bufoni", "Feminino", 34, "Skate");
        Atleta s = new Atleta("Shane", "O'Neil", "Masculino", 39, "Skate");

        if(skt.adicionarMembro(r))
            System.out.println("Atleta adicionado com sucesso!");
        else
            System.out.println("Numero maximo de atletas atingido!");

        if(skt.adicionarMembro(k))
            System.out.println("Atleta adicionado com sucesso!");
        else
            System.out.println("Numero maximo de atletas atingido!");

        if(skt.adicionarMembro(g))
            System.out.println("Atleta adicionado com sucesso!");
        else
            System.out.println("Numero maximo de atletas atingido!");

        if(skt.adicionarMembro(n))
            System.out.println("Atleta adicionado com sucesso!");
        else
            System.out.println("Numero maximo de atletas atingido!");

        if(skt.adicionarMembro(l))
            System.out.println("Atleta adicionado com sucesso!");
        else
            System.out.println("Numero maximo de atletas atingido!");

        if(skt.adicionarMembro(p))
            System.out.println("Atleta adicionado com sucesso!");
        else
            System.out.println("Numero maximo de atletas atingido!");

        if(skt.adicionarMembro(s))
            System.out.println("Atleta adicionado com sucesso!");
        else
            System.out.println("Numero maximo de atletas atingido!");

        System.out.println();
        System.out.println("Numero de atletas: " + skt.contarAtletas());
        System.out.println();

        System.out.println(r.exibirDados());
        System.out.println();
        System.out.println(p.exibirDados());
        System.out.println();
        System.out.println(k.exibirDados());
        System.out.println();
        System.out.println(g.exibirDados());
        System.out.println();
        System.out.println(n.exibirDados());
        System.out.println();
        System.out.println(l.exibirDados());
    }
}
