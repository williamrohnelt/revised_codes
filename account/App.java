package account;

public class App {
    public static void main(String args[]) {

        // creating two variables of type Account, these variables will receive an Account object (Account class)
        Account c1 = new Account();
        Account c2 = new Account();

        c1.setNumber(31);
        c2.setNumber(38);
        c1.deposit(500);
        c1.transfer(200, c2);

        System.out.printf("Balance of account %d: $%.2f\n", c1.getNumber(), c1.getBalance());
        System.out.printf("Balance of account %d: $%.2f\n", c2.getNumber(), c2.getBalance());
    }
}