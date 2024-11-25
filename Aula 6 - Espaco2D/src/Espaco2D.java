import java.util.ArrayList;

public class Espaco2D {
    private ArrayList<Forma> formas;

    public Espaco2D(){
        this.formas = new ArrayList<>();
    }

    public boolean adicionarForma(Forma forma){
        return formas.add(forma);
    }

    public double calcularAreaTotal(){
        double areaTotal = 0;
        for(Forma aux: formas){
            areaTotal += aux.calcularArea();
        }
        return areaTotal;
    }

    public double calcularPerimetroTotal(){
        double perimetroTotal = 0;
        for(Forma aux: formas){
            perimetroTotal += aux.calcularPerimetro();
        }
        return perimetroTotal;
    }

    public String mostrarTiposTriangulos(){ 
        String str = "";
        for(Forma aux: formas){
            if(aux instanceof Triangulo){
                Triangulo tri = (Triangulo) aux;
                str += tri.mostrarTipo() + "\n";
            }
        }
        return str;
    }
    
}
