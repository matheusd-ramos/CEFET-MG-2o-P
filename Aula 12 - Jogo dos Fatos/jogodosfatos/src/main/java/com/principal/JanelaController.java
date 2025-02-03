package com.principal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class JanelaController {

    @FXML
    private Button btn_0;

    @FXML
    private Button btn_1;

    @FXML
    private Button btn_2;

    @FXML
    private Button btn_3;

    @FXML
    private Button btn_4;

    @FXML
    private Button btn_5;

    @FXML
    private Button btn_6;

    @FXML
    private Button btn_7;

    @FXML
    private Button btn_8;

    @FXML
    private Button btn_9;

    @FXML
    private Button btn_menos;

    @FXML
    private Button btn_passar;

    @FXML
    private Button btn_ponto;

    @FXML
    private Button btn_reiniciar;

    @FXML
    private Button btn_sair;

    @FXML
    private Button btn_testar;

    @FXML
    private Label labelOp1;

    @FXML
    private Label labelOp2;

    @FXML
    private Label labelOperacao;

    @FXML
    private Label labelPontos;

    @FXML
    private Label labelMSG;

    @FXML
    private TextField textField;

    private JogoDosFatos jogo;

    public void initialize(){
        jogo = new JogoDosFatos();
        String op1 = jogo.gerarOperando();
        String op2 = jogo.gerarOperando();
        
        labelOp1.setText(op1);
        labelOp2.setText(op2);
        labelOperacao.setText(jogo.gerarOperacao());
        
        jogo.setOperando1(op1);
        jogo.setOperando2(op2);
        
        labelPontos.setText("Você está com 0 pontos");
    }

    @FXML
    void onAction(ActionEvent event) {
        String face = ((Button) event.getSource()).getText();

        if(face.equals("Passar")){
            String op1 = jogo.gerarOperando();
            String op2 = jogo.gerarOperando();
            
            labelOp1.setText(op1);
            labelOp2.setText(op2);
            labelOperacao.setText(jogo.gerarOperacao());
            
            jogo.setOperando1(op1);
            jogo.setOperando2(op2);
            
            textField.clear();
            return;
        }

        if(face.equals("Testar")){
            String resultado = jogo.calcularResultado();
            String resposta = textField.getText().trim();
            
            try {
                double resultadoNum = Double.parseDouble(resultado);
                double respostaNum = Double.parseDouble(resposta);
                
                if(Math.abs(resultadoNum - respostaNum) < 0.01){ // Tolerância para números decimais
                    jogo.setPontos(jogo.getPontos() + 1);
                    labelPontos.setText("Você está com " + jogo.getPontos() + " pontos");

                    String op1 = jogo.gerarOperando();
                    String op2 = jogo.gerarOperando();
                
                    labelOp1.setText(op1);
                    labelOp2.setText(op2);
                    labelOperacao.setText(jogo.gerarOperacao());
                
                    jogo.setOperando1(op1);
                    jogo.setOperando2(op2);

                    labelMSG.setText("Parabéns, resposta correta!");
                } else {
                    labelMSG.setText("Resposta incorreta. Tente novamente");
                } 
            } catch (NumberFormatException e) {
                labelMSG.setText("Formato inválido! Por favor, escreva apenas números (-XX para negativos e XX.xx para decimais)");
            }
            
            textField.clear();
            return;
        }

        if(face.equals("Reiniciar")){
            initialize();
            return;
        }

        if(face.equals("Sair")){
            System.exit(1);
        }

        textField.setText(textField.getText() + face);
    }

}
