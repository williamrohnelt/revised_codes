import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class JavaSwing8 extends JFrame {
    
    private static final long serialVersionUID = 1L;
    private JLabel rotulo;
    private JTextField campoTexto;
    private JButton botao;
    
    public JavaSwing8() {
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
        add(botao);
        
        setSize(500,200);
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
    }
    public static void main(String[] args) {
        JavaSwing8 minhaJanela = new JavaSwing8();
        minhaJanela.setVisible( true );
    }
}























