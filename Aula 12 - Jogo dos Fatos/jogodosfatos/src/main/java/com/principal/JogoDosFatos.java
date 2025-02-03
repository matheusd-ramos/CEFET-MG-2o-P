package com.principal;

import java.util.Random;

public class JogoDosFatos {

    private String operando1;
    private String operando2;
    private String operacao;
    private double resultado;
    private int pontos;
    private Random gerador;

    public JogoDosFatos(){
        gerador = new Random();
        pontos = 0;
        resultado = 0.0;
    }

    public String gerarOperacao(){
        int op = gerador.nextInt(4);

        switch(op){
            case 0: operacao = "+"; break;
            case 1: operacao = "-"; break;
            case 2: operacao = "*"; break;
            case 3: operacao = "/"; break;
        }

        return operacao;
    }

    public String gerarOperando(){
        String operando = String.valueOf(gerador.nextInt(97) + 1);
        return operando;
    }

    public String calcularResultado(){
        if(operacao.equals("+")){
            resultado = Double.parseDouble(operando1) + Double.parseDouble(operando2);
        } else if(operacao.equals("-")){
            resultado = Double.parseDouble(operando1) - Double.parseDouble(operando2);
        } else if(operacao.equals("*")){
            resultado = Double.parseDouble(operando1) * Double.parseDouble(operando2);
        } else if(operacao.equals("/")){
            resultado = Double.parseDouble(operando1) / Double.parseDouble(operando2);
        }

        return Double.toString(resultado);
    }

    public void setOperando1(String operando1) {
        this.operando1 = operando1;
    }

    public void setOperando2(String operando2) {
        this.operando2 = operando2;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

}

