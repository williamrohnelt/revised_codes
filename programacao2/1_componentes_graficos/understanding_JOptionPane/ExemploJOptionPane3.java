import javax.swing.JOptionPane;

public class ExemploJOptionPane3 {

    public static void main(String[] args) {

        String yourAge = JOptionPane.showInputDialog(
            null,
            "Inform your age"
        );

        // a classe Integer vem do pacote nativo do java chamado java.lang, o Pacote java.lang é importado automáticamente,
        // o pacote java.lang contém as classes mais fundamentais e essenciais para o funcionamento de qualquer programa,
        // por ser tão importante, o java importa todo o conteúdo desse pacote automaticamente para dentro de todos os arquivos de código
        int yourAgeInIntegerNumbers = Integer.parseInt(yourAge);
        int nextAge = ++yourAgeInIntegerNumbers;

        JOptionPane.showMessageDialog(
            null,
            "On your next birthday you will turn " + nextAge
        );
    }
}