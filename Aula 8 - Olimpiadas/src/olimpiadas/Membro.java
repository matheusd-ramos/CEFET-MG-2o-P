public abstract class Membro {
    protected String nome;
    protected String sobrenome;
    protected String genero;
    protected int idade;

    public Membro(String nome, String sobrenome, String genero, int idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.genero = genero;
        this.idade = idade;
    }

    public abstract String exibirDados();
}
