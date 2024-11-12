public class Galinha {
    private String nome;
    private String corPena;
    private double consumo;

    public Galinha(){
        this.nome = "";
        this.corPena = "";
        this.consumo = 0;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCorPena(){
        return corPena;
    }

    public void setCorPena(String corPena){
        this.corPena = corPena;
    }
    
    public double getConsumo(){
        return consumo;
    }

    public void setConsumo(double consumo){
        this.consumo = consumo;
    }
}
