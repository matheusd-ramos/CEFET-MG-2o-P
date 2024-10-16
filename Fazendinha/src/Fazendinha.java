public class Fazendinha {
    public static void main(String[] args){
        double racaoVacas, racaoCavalos, racaoGalinhas, totalDeRacao;

        Vaca vacaMarrom = new Vaca();
        vacaMarrom.setNome("Vaca Marrom");
        vacaMarrom.setCorPelo("Marrom");
        vacaMarrom.setConsumo(15.0);

        Vaca vacaPreta = new Vaca();
        vacaPreta.setNome("Vaca Preta");
        vacaPreta.setCorPelo("Preto");
        vacaPreta.setConsumo(13.0);

        Vaca vacaMalhada = new Vaca();
        vacaMalhada.setNome("Vaca Malhada");
        vacaMalhada.setCorPelo("Branca e preta");
        vacaMalhada.setConsumo(20.0);

        Cavalo cavaloBranco = new Cavalo();
        cavaloBranco.setNome("Cavalo Branco");
        cavaloBranco.setCorPelo("Branco");
        cavaloBranco.setConsumo(12.5);

        Cavalo cavaloBege = new Cavalo();
        cavaloBege.setNome("Cavalo Bege");
        cavaloBege.setCorPelo("Bege");
        cavaloBege.setConsumo(11.0);

        Galinha galinhaMarrom = new Galinha();
        galinhaMarrom.setNome("Galinha Marrom");
        galinhaMarrom.setCorPena("Marrom");
        galinhaMarrom.setConsumo(130.0);

        Galinha galinhaAmarela = new Galinha();
        galinhaAmarela.setNome("Galinha Amarela");
        galinhaAmarela.setCorPena("Amarelo");
        galinhaAmarela.setConsumo(120.0);

        Galinha galinhaPreta = new Galinha();
        galinhaPreta.setNome("Galinha Preta");
        galinhaPreta.setCorPena("Preta");
        galinhaPreta.setConsumo(118.0);

        Galinha galinhaCinza = new Galinha();
        galinhaCinza.setNome("Galinha Cinza");
        galinhaCinza.setCorPena("Cinza");
        galinhaCinza.setConsumo(122.0);

        Galinha galinhaPintadinha = new Galinha();
        galinhaPintadinha.setNome("Galinha Pintadinha");
        galinhaPintadinha.setCorPena("Preta e branca");
        galinhaPintadinha.setConsumo(119.0);

        System.out.println("Nome do animal: " + vacaMarrom.getNome());
        System.out.println("Cor do pelo/pena do animal: " + vacaMarrom.getCorPelo());
        System.out.println("Consumo medio diario do animal: " + vacaMarrom.getConsumo() + "kg");

        System.out.println("Nome do animal: " + vacaPreta.getNome());
        System.out.println("Cor do pelo/pena do animal: " + vacaPreta.getCorPelo());
        System.out.println("Consumo medio diario do animal: " + vacaPreta.getConsumo() + "kg");

        System.out.println("Nome do animal: " + vacaMalhada.getNome());
        System.out.println("Cor do pelo/pena do animal: " + vacaMalhada.getCorPelo());
        System.out.println("Consumo medio diario do animal: " + vacaMalhada.getConsumo() + "kg");
        
        System.out.println("");

        System.out.println("Nome do animal: " + cavaloBege.getNome());
        System.out.println("Cor do pelo/pena do animal: " + cavaloBege.getCorPelo());
        System.out.println("Consumo medio diario do animal: " + cavaloBege.getConsumo() + "kg");

        System.out.println("Nome do animal: " + cavaloBranco.getNome());
        System.out.println("Cor do pelo/pena do animal: " + cavaloBranco.getCorPelo());
        System.out.println("Consumo medio diario do animal: " + cavaloBranco.getConsumo() + "kg");

        System.out.println("");

        System.out.println("Nome do animal: " + galinhaAmarela.getNome());
        System.out.println("Cor do pelo/pena do animal: " + galinhaAmarela.getCorPena());
        System.out.println("Consumo medio diario do animal: " + galinhaAmarela.getConsumo() + "g");

        System.out.println("Nome do animal: " + galinhaCinza.getNome());
        System.out.println("Cor do pelo/pena do animal: " + galinhaCinza.getCorPena());
        System.out.println("Consumo medio diario do animal: " + galinhaCinza.getConsumo() + "g");

        System.out.println("Nome do animal: " + galinhaMarrom.getNome());
        System.out.println("Cor do pelo/pena do animal: " + galinhaMarrom.getCorPena());
        System.out.println("Consumo medio diario do animal: " + galinhaMarrom.getConsumo() + "g");

        System.out.println("Nome do animal: " + galinhaPintadinha.getNome());
        System.out.println("Cor do pelo/pena do animal: " + galinhaPintadinha.getCorPena());
        System.out.println("Consumo medio diario do animal: " + galinhaPintadinha.getConsumo() + "g");

        System.out.println("Nome do animal: " + galinhaPreta.getNome());
        System.out.println("Cor do pelo/pena do animal: " + galinhaPreta.getCorPena());
        System.out.println("Consumo medio diario do animal: " + galinhaPreta.getConsumo() + "g");

        System.out.println("");

        racaoVacas = vacaMalhada.getConsumo() + vacaMarrom.getConsumo() + vacaPreta.getConsumo();
        racaoCavalos = cavaloBege.getConsumo() + cavaloBranco.getConsumo();
        racaoGalinhas = (galinhaAmarela.getConsumo() + galinhaCinza.getConsumo() + galinhaMarrom.getConsumo() + galinhaPintadinha.getConsumo() + galinhaPreta.getConsumo())/1000;
        totalDeRacao = racaoVacas + racaoCavalos + racaoGalinhas;

        System.out.println("O senhor precisara de " + totalDeRacao + "kg de racao por mes");
    }
}
