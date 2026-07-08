import javax.swing.JFrame;

public class JavaSwing3 extends JFrame {

    public JavaSwing3() {
        super( "Universidade Feevale - Classe JavaSwing3" );
    }

    public static void main(String[] args) {
        JavaSwing3 minhaJanela = new JavaSwing3();
        minhaJanela.setSize(500,200);
        minhaJanela.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        minhaJanela.setVisible( true );
    }
}