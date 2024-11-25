public abstract class Forma {
    private Ponto2D[] pontos;

    public Ponto2D[] getPontos() {
        return pontos;
    }

    public Forma(Ponto2D[] pontos){
        this.pontos = pontos;
    }

    public static Forma gerarForma(Ponto2D[] pontos){

        if(pontos.length == 4){
            double A = pontos[0].calculaDistancia(pontos[1]);
            double B = pontos[1].calculaDistancia(pontos[2]);
            double C = pontos[2].calculaDistancia(pontos[3]);
            double D = pontos[3].calculaDistancia(pontos[0]);

            if(A == B && A == C && A == D){
                return new Quadrado(pontos);
            } else
                return null;
        }

        else if(pontos.length == 3){
            if(pontos[0].getX() != pontos[1].getX() && pontos[0].getX() != pontos[2].getX() && pontos[1] != pontos[2] || pontos[0].getY() != pontos[1].getY() && pontos[0].getY() != pontos[2].getY() && pontos[1].getY() != pontos[2].getY()){
                return new Triangulo(pontos);
            }
        }

        else if(pontos.length == 2){
            double raio = pontos[0].calculaDistancia(pontos[1]);
            if(raio != 0){
                return new Circulo(pontos);
            }
        }

        return null;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
