public class Main {
    public static void main(String[] args) {
        BankAccount account01 = new BankAccount();
        BankAccount account02 = new BankAccount(1000000);

        account01.display();
        account02.display();

        System.out.println("Account 01: " + account01.calcInterest());
        System.out.println("Account 02: " + account02.calcInterest());

        BankAccount.updateIntrestRate(9.9f);

        account01.display();
        account02.display();
    }
}
