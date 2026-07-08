import javax.swing.JOptionPane;

public class ExemploJOptionPane4 {
    public static void main(String[] args) {

        JOptionPane.showConfirmDialog(
                null,
                "Confirm?"
            );

        JOptionPane.showConfirmDialog(
                null,
                "Confirm?",
                "Confirmation",
                JOptionPane.DEFAULT_OPTION
            );

        JOptionPane.showConfirmDialog(
                null,
                "Confirm?",
                "Confirmation",
                JOptionPane.CANCEL_OPTION
            );

        JOptionPane.showConfirmDialog(
                null,
                "Confirm?",
                "Confirmation",
                JOptionPane.OK_OPTION
            );

        JOptionPane.showConfirmDialog(
                null,
                "Confirm?",
                "Confirmation",
                JOptionPane.OK_CANCEL_OPTION
            );

        JOptionPane.showConfirmDialog(
                null,
                "Confirm?",
                "Confirmation",
                JOptionPane.NO_OPTION
            );

        JOptionPane.showConfirmDialog(
                null,
                "Confirm?",
                "Confirmation",
                JOptionPane.YES_OPTION
            );

        JOptionPane.showConfirmDialog(
                null,
                "Confirm?",
                "Confirmation",
                JOptionPane.YES_NO_OPTION
            );

        JOptionPane.showConfirmDialog(
                null,
                "Confirm?",
                "Confirmation",
                JOptionPane.YES_NO_CANCEL_OPTION
            );

        JOptionPane.showConfirmDialog(
                null,
                "Confirm?",
                "Confirmation",
                JOptionPane.CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE
            );
    }
}