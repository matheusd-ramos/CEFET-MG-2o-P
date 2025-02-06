package controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import modelo.JogoDaForca;

public class JanelaController {
     @FXML
    private Button btnA;

    @FXML
    private Button btnB;

    @FXML
    private Button btnC;

    @FXML
    private Button btnD;

    @FXML
    private Button btnE;

    @FXML
    private Button btnF;

    @FXML
    private Button btnG;

    @FXML
    private Button btnH;

    @FXML
    private Button btnI;

    @FXML
    private Button btnJ;

    @FXML
    private Button btnK;

    @FXML
    private Button btnL;

    @FXML
    private Button btnM;

    @FXML
    private Button btnN;

    @FXML
    private Button btnO;

    @FXML
    private Button btnP;

    @FXML
    private Button btnQ;

    @FXML
    private Button btnR;

    @FXML
    private Button btnS;

    @FXML
    private Button btnT;

    @FXML
    private Button btnU;

    @FXML
    private Button btnV;

    @FXML
    private Button btnW;

    @FXML
    private Button btnX;

    @FXML
    private Button btnY;

    @FXML
    private Button btnZ;

    @FXML
    private Button btn_conferir;

    @FXML
    private Button btn_novojogo;

    @FXML
    private Button btn_sair;

    @FXML
    private Button btnÇ;

    @FXML
    private Label lbl_tentativa;

    @FXML
    private TextField tf1;

    @FXML
    private TextField tf2;

    @FXML
    private TextField tf3;

    @FXML
    private TextField tf4;

    @FXML
    private TextField tf5;

    @FXML
    private TextField tf6;

    @FXML
    private TextField tf7;

    private JogoDaForca jogo;
    private String palavra;
    private char[] chars;

    @FXML
    void initialize(){
        jogo = new JogoDaForca();
        palavra = jogo.sorteiaPalavra();
        chars = palavra.toCharArray();
        tf1.clear();
        tf2.clear();
        tf3.clear();
        tf4.clear();
        tf5.clear();
        tf6.clear();
        tf7.clear();
        jogo.setNumTentativas(15);
        lbl_tentativa.setText("Você tem " + jogo.getNumTentativas() + " tentativas");
    }


    @FXML
    void onAction(ActionEvent event){
        if (event.getSource() == btn_novojogo) {
            initialize();
        } else if(event.getSource() == btn_sair){
            System.exit(0);
        } else if (event.getSource() == btn_conferir){
            if (!tf1.getText().isEmpty() && !tf2.getText().isEmpty() && 
                !tf3.getText().isEmpty() && !tf4.getText().isEmpty() && 
                !tf5.getText().isEmpty() && !tf6.getText().isEmpty() && 
                !tf7.getText().isEmpty() && jogo.getNumTentativas() > 0) {
                lbl_tentativa.setText("Parabéns, você venceu!");
            } else if (jogo.getNumTentativas() <= 0) {
                initialize();
            } else {
                lbl_tentativa.setText("Preencha todas as letras antes de conferir.");
            }
        } else if (event.getSource() instanceof Button) {
            jogo.setNumTentativas(jogo.getNumTentativas() - 1);
            lbl_tentativa.setText("Você tem " + jogo.getNumTentativas() + " tentativas");

            if (jogo.getNumTentativas() <= 0) 
                initialize();
            
            Button botao = (Button) event.getSource();
            String texto = botao.getText().toLowerCase();

            for (int i = 0; i < chars.length; i++) {
                if (String.valueOf(chars[i]).toLowerCase().equals(texto)) {
                    switch (i) {
                        case 0: tf1.setText(texto); break;
                        case 1: tf2.setText(texto); break;
                        case 2: tf3.setText(texto); break;
                        case 3: tf4.setText(texto); break;
                        case 4: tf5.setText(texto); break;
                        case 5: tf6.setText(texto); break;
                        case 6: tf7.setText(texto); break;
                    }
                }
            }
        }
    }
}
