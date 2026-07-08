package estruturaDeDadosI.projeto_test_JOptionPane;

// Imports the JOptionPane class from the javax.swing package, which is the standard Java graphics library
import javax.swing.JOptionPane;

public class ExemploJOptionPane {
    public static void main(String[] args) {

        // the showMessageDialog method displays a window with a message
        JOptionPane.showMessageDialog(
            null,                   // center the window on the screen
            "Welcome to our aplication!",   // message displayed inside of the window
            "Welcome message",                // title
            JOptionPane.INFORMATION_MESSAGE          // type = icon displayed on the screen
        );

        // displays an error message
        JOptionPane.showMessageDialog(
            null,
            "An error ocurred!",
            "Error",
            JOptionPane.ERROR_MESSAGE
        );
    }
}

// JOptionPane é uma classe da biblioteca javax.swing do Java que permite criar caixas de diálogo gráficas
// janelas popup para interagir com o usuário, sem precisar construir uma interface gráfica completa do zero

// JOptionPane.INFORMATION_MESSAGE  // ícone de informação
// JOptionPane.ERROR_MESSAGE        // ícone de erro
// JOptionPane.WARNING_MESSAGE      // ícone de aviso
// JOptionPane.QUESTION_MESSAGE     // ícone de pergunta
// JOptionPane.PLAIN_MESSAGE        // sem ícone