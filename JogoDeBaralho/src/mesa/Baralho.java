package mesa;

import java.util.Random;

public class Baralho {
    private Carta[] baralho;
    private String[] naipes = {"Copas", "Ouros", "Paus", "Espadas"};
    private Random gerador;

    public Baralho(){
        int contador = 0;

        // Não esquecer de instanciar os objetos
        baralho = new Carta[52]; 
        gerador = new Random();

        // For para preencher as cartas
        for(String naipe: naipes){
            for(int i=1; i<=13; i++){
                baralho[contador] = new Carta(naipe, i);
                contador++;
            }
        }
    }

    public void embaralhar(){
        int num = gerador.nextInt(baralho.length);

        for(int i=0; i<baralho.length; i++){
            Carta aux = baralho[i];
            baralho[i] = baralho[num];
            baralho[num] = aux;
        }
    }

    public Carta[] distribuiCartas(int nCartas){
        Carta[] retorno = new Carta[nCartas];
        int contador = 0;
        int contador2 = 0;

        while(contador < nCartas){
            if(baralho[contador] != null){
                retorno[contador] = baralho[contador];
                baralho[contador] = null;
                contador++;
            }
            contador2++;
        }

        return retorno;
    }
}
