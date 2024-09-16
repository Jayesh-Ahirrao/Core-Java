class BankAccount {
    int accoundNumber;
    int balance;

    private static int accountCount;
    private static float interestRate;

    public BankAccount() {
        accoundNumber = ++accountCount;
        balance = 10000;
    }

    public BankAccount(int balance) {
        accoundNumber = ++accountCount;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Number: " + accoundNumber);
        System.out.println("Balance: " + balance);
        System.out.println("interestRate: " + interestRate);
        System.out.println("interest: " + calcInterest());
    }

    public float calcInterest() {
        return balance * (interestRate / 100);
    }

    static void updateIntrestRate(float newInterestRate) {
        interestRate = newInterestRate;
    }

    static {
        interestRate = 7.25f;
        accountCount = 0;
    }
}