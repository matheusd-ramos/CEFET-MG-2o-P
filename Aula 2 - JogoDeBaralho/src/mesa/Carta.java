package mesa;

public class Carta {
    private String naipe;
    private int num;

    public Carta(String naipe, int num){
        this.naipe = naipe;
        this.num = num;
    }

    public String getNaipe(){
        return naipe;
    }

    public void setNaipe(String naipe){
        this.naipe = naipe;
    }

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public int ehMaior(Carta carta){
        if(this.num > carta.getNum()){
            return 1;
        } else { 
            if(this.num < carta.getNum()){
                return -1;
            }
        }
        return 0;
    }
}
