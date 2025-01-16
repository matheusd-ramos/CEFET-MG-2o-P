package aplicativo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import principal.Calculadora;

public class AppCalc extends JFrame implements ActionListener{

    private JTextField visor;
    private JPanel teclado;
    private JButton bc;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton bdiv;
    private JButton bce;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton bmult;
    private JButton bquad;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton bsub;
    private JButton bporc;
    private JButton bponto;
    private JButton b0;
    private JButton big;
    private JButton bsoma;
    private Calculadora calculadora;
    private ArrayList<JButton> botoes;
    private ArrayList<String> acoes;

    public AppCalc(){
        instanciarComponentes();
        adicionarComponentes();
        registrarHandlerEventos();
        calculadora = new Calculadora();
    }

    private void instanciarComponentes(){
        visor = new JTextField();
        teclado = new JPanel();
        botoes = new ArrayList<>();
        acoes = new ArrayList<>();
        
        bc = new JButton("C");
        botoes.add(bc);
        b7 = new JButton("7");
        botoes.add(b7);
        b8 = new JButton("8");
        botoes.add(b8);
        b9 = new JButton("9");
        botoes.add(b9);
        bdiv = new JButton("/");
        botoes.add(bdiv);
        bce = new JButton("CE");
        botoes.add(bce);
        b4 = new JButton("4");
        botoes.add(b4);
        b5 = new JButton("5");
        botoes.add(b5);
        b6 = new JButton("6");
        botoes.add(b6);
        bmult = new JButton("X");
        botoes.add(bmult);
        bquad = new JButton("^2");
        botoes.add(bquad);
        b1 = new JButton("1");
        botoes.add(b1);
        b2 = new JButton("2");
        botoes.add(b2);
        b3 = new JButton("3");
        botoes.add(b3);
        bsub = new JButton("-");
        botoes.add(bsub);
        bporc = new JButton("%");
        botoes.add(bporc);
        bponto = new JButton(".");
        botoes.add(bponto);
        b0 = new JButton("0");
        botoes.add(b0);
        big = new JButton("=");
        botoes.add(big);
        bsoma = new JButton("+");
        botoes.add(bsoma);
    }

    private void adicionarComponentes(){
        setLayout(new BorderLayout());

        add(visor, BorderLayout.NORTH);

        add(teclado, BorderLayout.SOUTH);
        teclado.setLayout(new GridLayout(4, 5));
        teclado.add(bc);
        teclado.add(b7);
        teclado.add(b8);
        teclado.add(b9);
        teclado.add(bdiv);
        teclado.add(bce);
        teclado.add(b4);
        teclado.add(b5);
        teclado.add(b6);
        teclado.add(bmult);
        teclado.add(bquad);
        teclado.add(b1);
        teclado.add(b2);
        teclado.add(b3);
        teclado.add(bsub);
        teclado.add(bporc);
        teclado.add(bponto);
        teclado.add(b0);
        teclado.add(big);
        teclado.add(bsoma);
    }

    private void registrarHandlerEventos(){
        for(JButton botao: botoes){
            botao.addActionListener(this);
        }
    }

    public static void main(String[] args) {
        AppCalc janela = new AppCalc();
        janela.setSize(500, 600);
        janela.setVisible(true);
        janela.setTitle("Calculadora top secret");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae){
        String face = ((JButton)ae.getSource()).getText();

        if(face.equals("C")){
            calculadora = new Calculadora();
            acoes.clear();
            visor.setText("");
            return;
        }
        
        if(face.equals("CE")){
            if (!acoes.isEmpty()) {
                acoes.remove(acoes.size() - 1);
                visor.setText(String.join("", acoes));
            }
            calculadora.setOperando2("");
            return;
        }

        if(face.equals("=")){
            calculadora.interpretarAcoes(acoes);
            visor.setText(calculadora.getResultado());
            acoes.clear();
            acoes.add(calculadora.getResultado());
            return;
        }

        if(face.equals("/") || face.equals("+") || face.equals("X") || 
            face.equals("%") || face.equals("X^2") || face.equals("-")){

            if(acoes.isEmpty()){
                return;
            }
            
            if(!acoes.get(acoes.size()-1).matches("[+\\-X/%.]")){
                acoes.add(face);
                visor.setText(String.join("", acoes));
            }        
        } else {
            if (face.equals(".")) {
                if (String.join("", acoes).contains(".")) {
                    return;
                }
            }
            acoes.add(face);
            visor.setText(String.join("", acoes));
        }
    }
}