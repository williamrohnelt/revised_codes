package account;

public class Account {

    // atributos
    private int number;
    private double balance;

    public Account() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    //método retirar
    public void withdraw(double value) {
        if (balance >= value) {
            balance = balance - value;
        } else
            System.out.printf("Value unavailable!\n");
    }

    public void transfer(double value, Account destination) {
        if (balance >= value) {
            balance = balance - value;
            destination.deposit(value);
        } else
            System.out.printf("Value unavailable!\n");
    }

    public void deposit(double value) {
        balance = balance + value;
    }
}