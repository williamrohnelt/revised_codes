import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class JavaSwing9 extends JFrame {
    
    private static final long serialVersionUID = 1L;
    private JLabel rotulo;
    private JTextField campoTexto;
    private JButton botao;
    
    public JavaSwing9() {
        super( "Universidade Feevale - Componente" );
        
        setLayout(null);
        rotulo = new JLabel("R�tulo");
        rotulo.setBounds(10, 50, 200, 30 );
        add(rotulo);
        
        campoTexto = new JTextField();
        campoTexto.setBounds(10, 80, 100, 20 );
        add(campoTexto);

        botao = new JButton( "Aperte Aqui!");
        botao.setBounds(280, 80, 150, 20 );
        botao.setActionCommand( "Apertar" );
        botao.addActionListener( acaoParaOBotao );
        add(botao);
        
        setSize(600,400);
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
    }
    
    ActionListener acaoParaOBotao = new ActionListener(){

        public void actionPerformed(ActionEvent arg0) {

            if( arg0.getActionCommand().equals( "Apertar" ) ) {
                JOptionPane.showMessageDialog( null, "Apertou o bot�o" );
            } 	
        }
    };
    
    public static void main(String[] args) {
        JavaSwing9 minhaJanela = new JavaSwing9();
        minhaJanela.setVisible( true );
    }
}























