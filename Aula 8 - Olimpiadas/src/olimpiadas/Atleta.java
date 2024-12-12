public class Atleta extends Membro{

    private String modalidade;

    public Atleta(String nome, String sobrenome, String genero, int idade, String modalidade){
        super(nome, sobrenome, genero, idade);
        this.modalidade = modalidade;
    }

    public String exibirDados(){
        return "Nome: " + nome + " " + sobrenome + 
       "\n" + "Idade: " + idade + 
       "\n" + "Genero: " + genero + 
       "\n" + "Modalidade: " + modalidade;
    }
}
