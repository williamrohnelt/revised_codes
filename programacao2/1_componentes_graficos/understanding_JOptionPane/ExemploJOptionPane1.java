// Imports the JOptionPane class from the javax.swing package, which is the standard Java graphics library
import javax.swing.JOptionPane;

public class ExemploJOptionPane1 {
    public static void main(String[] args) {
        // the showMessageDialog method displays a window with a message
        JOptionPane.showMessageDialog(
            null,   // center the window on the screen
            "Hello students"    // message displayed inside of the window
        );
    }
}