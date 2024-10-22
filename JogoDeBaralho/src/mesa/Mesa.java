package mesa;

public class Mesa {
    public static void main(String[] args){
        Baralho copag = new Baralho();

        Jogador a = new Jogador(5);
        Jogador b = new Jogador(5);

        copag.embaralhar();

        a.setMao(copag.distribuiCartas(5));
        a.setMao(copag.distribuiCartas(5));

        a.escolheMelhor();
        b.escolheMelhor();
        
    }
}
