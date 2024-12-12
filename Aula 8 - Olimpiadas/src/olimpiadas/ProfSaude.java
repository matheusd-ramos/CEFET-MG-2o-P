public class ProfSaude extends Membro {

    private String funcao;

    public ProfSaude(String nome, String sobrenome, String genero, int idade, String funcao){
        super(nome, sobrenome, genero, idade);
        this.funcao = funcao;
    }

    public String exibirDados(){
        return "Nome: " + nome + " " + sobrenome + 
       "\n" + "Idade: " + idade + 
       "\n" + "Genero: " + genero + 
       "\n" + "Funcao: " + funcao;
    }
}
