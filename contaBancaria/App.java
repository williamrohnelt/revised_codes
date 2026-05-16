package codigos_revisados.contaBancaria;

public class App {
    public static void main(String[] args) {

        // criação de uma variável do tipo ContaBancaria com o nome de cb1, acessar o contrutor vazio para criar o objeto
        ContaBancaria contaBancaria1 = new ContaBancaria();

        // criação de uma variável do tipo Correntista com o nome de cc1, acessar o contrutor com os parâmetros nome e endereço para criar o objeto
        Correntista correntista1 = new Correntista("William","Novo Hamburgo");

        contaBancaria1.setNumero(310);;
        contaBancaria1.setCorrentista(correntista1);

        correntista1.setNumero(contaBancaria1);

        ContaBancaria contaBancaria2 = new ContaBancaria();
        Correntista correntista2 = new Correntista("Bruna","Estância Velha");

        contaBancaria2.setNumero(458);
        contaBancaria2.setCorrentista(correntista2);

        correntista2.setNumero(contaBancaria2);

        contaBancaria1.depositar(1000.0);
        contaBancaria1.transferir(150.0, contaBancaria2);
        contaBancaria1.extrato();
        contaBancaria2.extrato();
    }
}