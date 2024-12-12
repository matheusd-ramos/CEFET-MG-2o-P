public class Tecnico extends Membro{

    private String modalidade;
    private String funcao;

    public Tecnico(String nome, String sobrenome, String genero, int idade, String modalidade, String funcao){
        super(nome, sobrenome, genero, idade);
        this.modalidade = modalidade;
        this.funcao = funcao;
    }

    public String exibirDados(){
       return "Nome: " + nome + " " + sobrenome + 
       "\n" + "Idade: " + idade + 
       "\n" + "Genero: " + genero + 
       "\n" + "Modalidade: " + modalidade + 
       "\n" + "Funcao: " + funcao;
    }
}
