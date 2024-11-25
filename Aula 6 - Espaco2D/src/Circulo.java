public class Circulo extends Forma {   
    
    private double raio;
    
    public Circulo(Ponto2D[] pontos){
        super(pontos);
        this.raio = getPontos()[0].calculaDistancia(getPontos()[1]);
    }

    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro(){
        return 2 * Math.PI * raio;
    }
}
