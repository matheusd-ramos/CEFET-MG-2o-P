package planner;

public class Dia {
    private Compromisso[] compromissos;
    private String horario;

    public Dia(){
        compromissos = new Compromisso[10];
        horario = "";
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public boolean addCompromisso(Compromisso compromisso, String horario){
        for(int i = Integer.parseInt(horario) - 9; i < Integer.parseInt(horario) - 9 + compromisso.getDuracao(); i++){
            if(compromissos[i] == null){
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
                System.out.println(horario + " - " + compromissos[i].getDescricao());
            } else{
                System.out.println(horario + " - Sem compromissos");
            }
        }
    }
}
