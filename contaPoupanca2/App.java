package codigos_revisados.contaPoupanca2;

//Classe que integra o framework de Coleções do Java
import java.util.ArrayList;

public class App {
    public static void main(String args[]) {

        // criação de uma variável int com o nome de i
        int i;

        System.out.println("***** Controle de Contas *****\n");

        // criação de um ArrayList chamado contas, recebe tipo Object
        // ArrayList<Tipo de dado> nome = new ArrayList<Tipo de dado>();
        // Object é a classe mãe de todas as classes em Java, toda classe herda de Object automaticamente, mesmo sem declarar extends Object
        // um ArrayList<Object> aceita qualquer tipo de objeto
        // guarda tipos diferentes de objetos na mesma lista
        // no contexto desse projeto, o ArrayList contas pode guardar objetos ContaEspecial, ContaPoupanca, Strings e Integers
        ArrayList<Object> contas = new ArrayList<Object>();

        // isEmpty() é um método da classe ArrayList
        if (contas.isEmpty()) {
            System.out.printf("Nenhuma conta registrada!\n\n");
        }

        // chama o método add da classe ArrayList
        // cria um objeto Conta, ContaEspecial e ContaPoupanca e adiciona no ArrayList contas com o método add
        contas.add(new Conta(1001));
        contas.add(new ContaEspecial(1002, 950.0));
        contas.add(new ContaPoupanca(1003, 12));

        // variável i recebe o valor da quantidade de objetos no ArrayList
        // size() é um método da classe ArrayList, retorna o tamanho do array
        i = contas.size();
        System.out.printf("Quantidade de contas: %d\n", i);

        // criação de variáveis do tipo Object, Conta, ContaEspecial e ContaPoupanca
        Object x;
        Conta c;

        // i = 3
        for (int j = 0; j < i; j++) {
            // primeiro loop j é 0, get(0), método get retorna o objeto na posição 0 do array contas
            x = contas.get(j);

            // o ArrayList contas foi definido para guardar objetos do tipo genérico Object (ArrayList<Object>)
            // o operador instanceof serve para verificar no sistema se o objeto apontado pela variável x é uma instância da classe Conta
            // por que é necessário o instanceof? Como x é do tipo Object, ele pode ser qualquer coisa (uma String, um Inteiro ou uma Conta)
            // o Java não permite que você chame métodos específicos de uma classe (como exibeTipo)
            // diretamente de uma variável Object sem ter certeza do que há dentro dela
            if (x instanceof Conta) {

                // cast
                // a lista foi declarada como ArrayList<Object>, quando recupera um elemento com .get(j), o Java só sabe que é um Object, não sabe que é uma Conta
                // o Java não deixa chamar exibeTipo() diretamente em x porque Object não tem esse método
                // é preciso dizer ao Java que o objeto que o x aponta é do tipo Conta, agora c é do tipo Conta
                // converte a referência x do tipo Object para o tipo Conta, permitindo acessar todos os métodos de Conta
                //     trata x como se fosse uma Conta
                //     /\
                //     |
                c = (Conta) x;

                // chama o método exibeTipo() da classe Conta
                c.exibeTipo();
            } else {
                System.out.println("Erro");
            }
        }

        // criação da variável chamada poup do tipo Conta
        //                  faz o cast de Object para ContaPoupanca, diz ao Java, trate esse Object como ContaPoupanca
        //                  /\               recupera o objeto na posição 2 do ArrayList, retorna como Object
        //                  |                /\
        //                  |                |
        Conta poup = (ContaPoupanca)contas.get(2);

        // contains() é um método do ArrayList que verifica se o objeto passado como argumento existe na lista, retorna true ou false
        if (contas.contains(poup)) {
            System.out.printf("\n\nConta %d já existe!\n", poup.getCodigo());
        }
    }
}