package athlete;

import java.util.Scanner;

public class App {
    public static void main (String args[]) {

        // Scanner é uma classe da biblioteca padrão do Java, importada com import java.util.Scanner
        // é responsável por ler dados do teclado, arquivos...
        // variável do tipo Scanner com o nome de leitor, recebe o objeto Scanner, System.in é o argumento
        Scanner reader = new Scanner(System.in);
        //                      |
        //                   Scanner, aqui é o construtor da classe sendo chamado para criar o objeto
        //                   é o mesmo nome da classe, em Java o construtor sempre tem o mesmo nome da classe

        // variables
        int age;
        String name;

        String address;
        double salary;

        // reading
        System.out.printf("Enter your age: ");
        age = reader.nextInt();
        reader.nextLine(); // limpeza do buffer do teclado

        System.out.printf("Enter your name: ");
        name = reader.nextLine();

        System.out.printf("Enter your address: ");
        address = reader.next();
        reader.nextLine();

        System.out.printf("Enter your salary: ");
        salary = reader.nextDouble();

        // verificando...
        System.out.printf("Data read: %s is %d years old, earns $ %.2f, and lives in %s.\n", name, age, salary, address);

        // criando objeto
        Athlete atleta1 = new Athlete(name, age);

        System.out.printf("Athlete data: %s is %d years old.\n", atleta1.getName(), atleta1.getAge());

        reader.close();
    }
}