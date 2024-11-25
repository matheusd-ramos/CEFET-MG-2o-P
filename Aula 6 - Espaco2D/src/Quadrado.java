public class Quadrado extends Forma{

    private double lado;

    public Quadrado(Ponto2D[] pontos){
        super(pontos);
        this.lado = getPontos()[0].calculaDistancia(getPontos()[1]);
    }

    public double calcularPerimetro(){
        return lado * 4;
    }

    public double calcularArea(){
        return Math.pow(lado, 2);
    }
}
