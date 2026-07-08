import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class JavaSwing7 extends JFrame {
    
    private static final long serialVersionUID = 1L;
    private JLabel rotulo;
    private JTextField campoTexto;
    
    public JavaSwing7() {
        super( "Universidade Feevale - Componente" );
        
        setLayout(null);
        rotulo = new JLabel("R�tulo");
        rotulo.setBounds(10, 50, 200, 30 );
        add(rotulo);
        
        campoTexto = new JTextField();
        campoTexto.setBounds(10, 80, 100, 20 );
        add(campoTexto);
        
        setSize(500,200);
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
    }
    public static void main(String[] args) {
        JavaSwing7 minhaJanela = new JavaSwing7();
        minhaJanela.setVisible( true );
    }
}























