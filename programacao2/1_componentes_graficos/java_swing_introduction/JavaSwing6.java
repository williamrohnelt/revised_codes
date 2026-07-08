import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class JavaSwing6 extends JFrame {
    
    private static final long serialVersionUID = 1L;
    private JLabel rotulo;
    
    public JavaSwing6() {
        super( "Universidade Feevale - Componente" );
        
        setLayout(null);
        rotulo = new JLabel("R�tulo");
        rotulo.setBounds(10, 50, 200, 30 );
        add(rotulo);
        
        setSize(500,200);
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
    }
    public static void main(String[] args) {
        JavaSwing6 minhaJanela = new JavaSwing6();
        minhaJanela.setVisible( true );
    }
}























