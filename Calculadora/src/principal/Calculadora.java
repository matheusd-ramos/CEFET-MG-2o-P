package principal;

import java.util.ArrayList;

public class Calculadora {
    private String visor;
    private String operando1;
    private String operando2;
    private String resultado;
    private String operacao;

    public Calculadora(){
        visor = "";
        operando1 = "";
        operando2 = "";
        resultado = "";
        operacao = "";
    }

    public void concatenarOperando1(String valor){
        operando1 = operando1 + valor;
        visor = operando1;
    }

    public void concatenarOperando2(String valor){
        operando2 = operando2 + valor;
        visor = operando1 + operacao + operando2;
    }

    public String definirOperacao(String valor){
        operacao = valor;
        visor = operando1 + operacao;
        return operacao;
    }

    public int buscarIndiceDoOperador(ArrayList<String> acoes){
        int indice = 0;
        for(String acao: acoes){
            if(acao.equals("/") || acao.equals("+") || acao.equals("X") || acao.equals("%") || acao.equals("X^2") || acao.equals("-")){
                return indice;
            } else
                indice++;
        }
        return indice;
    }

    public void interpretarAcoes(ArrayList<String> acoes){
        if(acoes.size() < 2) {
            return;
        }
        
        int indiceOperador = buscarIndiceDoOperador(acoes);
        if(indiceOperador > 0) {
            // Concatena todos os números antes do operador
            String op1 = "";
            for(int i = 0; i < indiceOperador; i++) {
                op1 += acoes.get(i);
            }
            
            // Concatena todos os números depois do operador até encontrar outro operador ou um espaço vazio
            String op2 = "";
            if(!acoes.get(indiceOperador).equals("X^2")) {
                for(int i = indiceOperador + 1; i < acoes.size(); i++) {
                    String atual = acoes.get(i);
                    if(atual.equals("/") || atual.equals("+") || atual.equals("X") || 
                       atual.equals("%") || atual.equals("X^2") || atual.equals("-") || atual.equals("")) {
                        break;
                    }
                    op2 += atual;
                }
                // Se não for X^2 e não tiver segundo operando, retorna
                if(op2.isEmpty()) {
                    return;
                }
            }
            
            double resultado = realizarOperacao(op1, op2, acoes.get(indiceOperador));
            this.resultado = String.valueOf(resultado);
            
            acoes.clear();
            acoes.add(this.resultado);
        }
    }

    public double realizarOperacao(String operando1, String operando2, String operacao){
        double op1 = Double.parseDouble(operando1);
        double op2 = Double.parseDouble(operando2);
        double resultado = 0;
        
        if(operacao.equals("+")){
            resultado = op1 + op2;
        } else if (operacao.equals("-")){
            resultado = op1 - op2;
        } else if (operacao.equals("X")){
            resultado = op1 * op2;
        } else if (operacao.equals("/")){
            resultado = op1 / op2;
        } else if (operacao.equals("%")){
            resultado = (op1/100) * op2;
        } else if (operacao.equals("X^2")){
            resultado = Math.pow(op1, 2);
        }

        return resultado;
    }

    public String getVisor() {
        return visor;
    }

    public void setVisor(String visor) {
        this.visor = visor;
    }

    public String getOperando1() {
        return operando1;
    }

    public void setOperando1(String operando1) {
        this.operando1 = operando1;
    }

    public String getOperando2() {
        return operando2;
    }

    public void setOperando2(String operando2) {
        this.operando2 = operando2;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    
}
