import javax.swing.JOptionPane;

public class ExemploJOptionPane2 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(
            null,
            "Hello students",
            "Greetings",
            JOptionPane.PLAIN_MESSAGE
        );

        JOptionPane.showMessageDialog(
            null,
            "Relevant information",
            "Information",
            JOptionPane.INFORMATION_MESSAGE
        );

        JOptionPane.showMessageDialog(
            null,
            "Warning: test the examples at home",
            "Warning",
            JOptionPane.WARNING_MESSAGE
        );

        JOptionPane.showMessageDialog(
            null,
            "Question: all clear?",
            "Question",
            JOptionPane.QUESTION_MESSAGE
        );

        JOptionPane.showMessageDialog(
            null,
            "Incorrect place to submit work",
            "Error",
            JOptionPane.ERROR_MESSAGE
        );
    }
}