package mesa;

public class Mesa {
    public static void main(String[] args) {
        boolean jogoEmpatado;
        do {
            jogoEmpatado = jogarPartida();
        } while (jogoEmpatado);
    }

    private static boolean jogarPartida() {
        Baralho copag = new Baralho();
        Jogador a = new Jogador(5);
        Jogador b = new Jogador(5);

        copag.embaralhar();
        System.out.println("Mesa embaralhando...");

        a.setMao(copag.distribuiCartas(5));
        b.setMao(copag.distribuiCartas(5));
        System.out.println("Mesa distribui as 5 cartas para jogador A e para o jogador B.");

        System.out.println("O jogador A joga a carta de naipe " + a.escolheMelhor().getNaipe() + " e de valor " + a.escolheMelhor().getNum());
        System.out.println("O jogador B joga a carta de naipe " + b.escolheMelhor().getNaipe() + " e de valor " + b.escolheMelhor().getNum());
        
        if (a.escolheMelhor().getNum() > b.escolheMelhor().getNum()) {
            System.out.println("O jogador A venceu o jogo.");
            return false;
        } else if (b.escolheMelhor().getNum() > a.escolheMelhor().getNum()) {
            System.out.println("O jogador B venceu o jogo.");
            return false;
        } else {
            if (a.escolheMelhor().getNaipe().equals("Ouros")) {
                System.out.println("O jogador A venceu o jogo por ter uma carta de Ouros.");
                return false;
            } else if (b.escolheMelhor().getNaipe().equals("Ouros")) {
                System.out.println("O jogador B venceu o jogo por ter uma carta de Ouros.");
                return false;
            } else {
                System.out.println("Como os valores das cartas sao iguais e nenhum jogador tem carta de Ouros, o jogo ficou empatado!");
                System.out.println("Jogando novamente...");
                return true;
            }
        }
    }
}
