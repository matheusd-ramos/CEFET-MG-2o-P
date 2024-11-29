package contabilidade;
public interface Passivo {
    public static final double SALARIO = 1412.0; // Não vai mudar nada se não colocar, serve apenas para documentação
    public static final double VALORHORAEXTRA = 65.0;
    public static final double PERCENTUAL = 0.06;

    public abstract double getValorAPagar(int diaPgto, int mesPgto);
}
