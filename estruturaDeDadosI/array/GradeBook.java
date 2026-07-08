package estruturaDeDadosI.array;

// classe GradeBook utilizando um array para armazenar notas de teste

public class GradeBook {

    // variável do tipo String de nome courseName, private significa que só a classe pode acessar essa variável
    private String courseName; // nome do curso que essa GradeBook representa

    // array de inteiros de nome grades, private significa que só a classe pode acessar essa variável
    private int[] grades; // array de notas de aluno

    // método construtor chamado GradeBook (deve ser o mesmo nome da classe)
    // recebe dois parâmetros, a variável String courseName e o array int grades
    // os valores passados como argumanto são definidos nos atributos da classe
    public GradeBook(String courseName, int[] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    // método setCourseName, recebe como parâmetro um valor String
    // o método define o valor passado à variável courseName
    // public pode ser acessado fora da classe
    // void não retorna nada
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // método para recuperar o nome do curso
    public String getCourseName() {
        return courseName;
    }
    
    // realiza varias operações nos dados
    public void processGrades() {

        // gera saída de array de notas
        outputGrades();

        // chama método getAverage para calcular a nota média
        System.out.printf("%nClass average is %.2f%n", getAverage());
        
        // chama métodos getMinimum e getMaximum
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", 
            getMinimum(),getMaximum());
        
        // chama outputBarChart para imprimir gráfico de distribuição de nota
        outputBarChart();
    }
    
    // localiza nota mínima
    public int getMinimum() {
        int lowGrade = grades[0]; // supõe que grades[0] é a menor nota
        // faz um loop pelo array de notas
        for (int grade : grades) {
            // se nota for mais baixa que lowGrade, atribui essa nota a lowGrade
            if (grade < lowGrade)
            lowGrade = grade; // nova nota mais baixa
        }
        return lowGrade;
    }

    // localiza nota máxima
    public int getMaximum() {
        int highGrade = grades[0]; // supõe que grades[0] é a maior nota
        // faz um loop pelo array de notas
        for (int grade : grades) {
            // se a nota for maior que highGrade, atribui essa nota a highGrade
            if (grade > highGrade)
                highGrade = grade; // nova nota mais alta
        }
        return highGrade;
    }

    // determina média para o teste
    public double getAverage() {
        int total = 0;
        // soma notas de um aluno
        for (int grade : grades) {
            // total = total + grade
            total += grade;
        }
        // retorna média de notas
        return (double) total / grades.length;
    }

    // gera a saida do gráfico de barras exibindo distribuição de notas
    public void outputBarChart() {
        System.out.println("Grade distribution:");
        // armazena frequência de notas em cada intervalo de 10 notas
        int[] frequency = new int[11];
        // para cada nota, incrementa a frequência apropriada
        for (int grade : grades) {
            ++frequency[grade / 10];
        }
        // para cada frequência de nota, imprime barra no gráfico
        for (int count = 0; count < frequency.length; count++) {
            // gera saída do rótulo de barra ( "00-09: ", ..., "90-99: ", "100: ")
            if (count == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            // imprime a barra de asteriscos
            for (int stars = 0; stars < frequency[count]; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // gera a saída do conteúdo do array de notas
    public void outputGrades() {
        System.out.printf("The grades are:%n%n");
        // gera a saída da nota de cada aluno
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d: %3d%n", student + 1, grades[student]);
        }
    }
}