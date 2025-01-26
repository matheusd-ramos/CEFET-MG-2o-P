/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Random;

/**
 *
 * @author mathe
 */
public class JogoDosFatos {
    private String operando1;
    private String operando2;
    private String operacao;
    private double resultado;
    
    private Random gerador;
    
    public JogoDosFatos(){
        operando1 = "";
        operando2 = "";
        operacao = "";
    }
    
    //public boolean verificaResultado()
    
    public void sortearNovaOperacao(){
        double op1 = gerador.nextInt(100);
        double op2 = gerador.nextInt(99)+1;
        int opera = gerador.nextInt(4);
        
        operando1 = String.valueOf(op1);
        operando2 = String.valueOf(op2);
        
        switch(opera){
            case 0: operacao = "+";
            case 1: operacao = "-";
            case 3: operacao = "x";
            case 4: operacao = "/";
        }
    }
}
