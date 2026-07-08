import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class JavaSwing5 extends JFrame {
    
    private static final long serialVersionUID = 1L;
    private JLabel rotulo;
    
    public JavaSwing5() {
        super( "Universidade Feevale - Componente" );
        
        setLayout(new FlowLayout());
        rotulo = new JLabel("R�tulo");
        add(rotulo);
        
        setSize(500,200);
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
    }
    public static void main(String[] args) {
        JavaSwing5 minhaJanela = new JavaSwing5();
        minhaJanela.setVisible( true );
    }
}























