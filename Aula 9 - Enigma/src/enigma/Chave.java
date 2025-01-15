public class Chave {
    
    private int deslocamento;
    private String[] alfabeto;

    public Chave(int deslocamento){
        this.deslocamento = deslocamento;
        this.alfabeto = new String[26];

        for(int i = 0; i < 26; i++){
            alfabeto[i] = String.valueOf((char) ('a' + i));
        }
    }

    public int buscarIndice(String c){
        int i = 0;
        while(!c.equals(alfabeto[i])){
            i++;
        }
        return i;
    }

    public int getDeslocamento() {
        return deslocamento;
    }

    public String[] getAlfabeto() {
        return alfabeto;
    }
}
