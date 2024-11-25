public class Triangulo extends Forma{

    private double A, B, C;

    public Triangulo(Ponto2D[] pontos){
        super(pontos);
        this.A = getPontos()[0].calculaDistancia(getPontos()[1]); 
        this.B = getPontos()[0].calculaDistancia(getPontos()[2]);
        this.C = getPontos()[1].calculaDistancia(getPontos()[2]);
    }

    public double calcularPerimetro(){
        return A + B + C;
    }

    public double calcularArea(){
        double sp = calcularPerimetro() / 2;
        return Math.sqrt(sp * (sp - A) * (sp - B) * (sp - C));
    }

    public String mostrarTipo(){ 
        if(A == B && A == C){
            return "Triangulo Equilatero";
        } else if(A == B || B == C || A == C){
            return "Triangulo Isoceles";
        }
        else
            return "Triangulo Escaleno";
    }
}
