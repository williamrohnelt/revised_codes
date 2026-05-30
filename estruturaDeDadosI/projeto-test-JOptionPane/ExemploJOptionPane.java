// importa a classe JOptionPane do pacote javax.swing, que é a biblioteca gráfica padrão do Java
import javax.swing.JOptionPane;

public class ExemploJOptionPane {
    public static void main(String[] args) {

        // método showMessageDialog exibe uma janela com uma mensagem
        JOptionPane.showMessageDialog(
            null,                       // centraliza na tela
            "Bem-vindo ao nosso aplicativo!",   // mensagem
            "Mensagem de Boas-Vindas",            // título
            JOptionPane.INFORMATION_MESSAGE             // tipo = ícone exibido na janela
        );

        // Exibe uma mensagem de erro
        JOptionPane.showMessageDialog(
            null,           // centraliza na tela
            "Um erro ocorreu!",     // mensagem
            "Erro",                   // título
            JOptionPane.ERROR_MESSAGE       // tipo = ícone exibido na janela
        );
    }
}

// JOptionPane é uma classe da biblioteca javax.swing do Java que permite criar caixas de diálogo gráficas
// janelas popup para interagir com o usuário, sem precisar construir uma interface gráfica completa

// JOptionPane.INFORMATION_MESSAGE  // ícone de informação
// JOptionPane.ERROR_MESSAGE        // ícone de erro
// JOptionPane.WARNING_MESSAGE      // ícone de aviso
// JOptionPane.QUESTION_MESSAGE     // ícone de pergunta
// JOptionPane.PLAIN_MESSAGE        // sem ícone