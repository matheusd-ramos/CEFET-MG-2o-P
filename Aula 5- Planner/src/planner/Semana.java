package planner;

public class Semana {
    private Dia[] semana;
    private String[] dias = {"Segunda", "Terca", "Quarta", "Quinta", "Sexta"};

    public Semana(){
        semana = new Dia[5];
    }

    public Dia[] getSemana(){
        return semana;
    }

    public String[] getDias(){
        return dias;
    }

    public boolean addCompromissoAoDia(Compromisso compromisso, String dia, String horario){
        for(int i = 0; i < dias.length; i++){
            if((dias[i].toLowerCase()).equals(dia.toLowerCase())){
                return semana[i].addCompromisso(compromisso, horario);
            }
        }
        return false;
    }
    
}
