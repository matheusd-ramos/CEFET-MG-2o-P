package planner;

public class Dia {
    private Compromisso[] compromissos;
    private int horario;

    public Dia(){
        compromissos = new Compromisso[10];
        horario = 0;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public boolean addCompromisso(Compromisso compromisso, int horario){
        for(int i = horario - 9; i < horario - 9 + compromisso.getDuracao(); i++){
            if(compromissos[i] == null && compromissos[(horario - 9) + (compromisso.getDuracao() - 1)] == null){
                compromissos[i] = compromisso;  
            } else {
                return false;
            }
        }
        return true;
    }

    public void exibirHorarios(){
        for(int i = 0; i < compromissos.length; i++){
            if(compromissos[i] != null){
                System.out.println((9+i) + ":00" + " - " + compromissos[i].getDescricao());
            } else{
                System.out.println((9+i) + ":00" + " - Sem compromissos");
            }
        }
    }
}
