public class Account {
    private String nameOwner;
    private String accountNumber;
    private double balance;

    public Account(String nameOwner, String accountNumber, double balance) {
        this.nameOwner = nameOwner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getbalance() {
        return balance;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public void deposit(double number) {
        balance += number;
        System.out.println("Your deposit has been successfully added!" + number);
    }

    public void withDraw(double number) {
        if (number <= balance) {
            balance -= number;
            System.out.println("Withdrawal Successful!" + number);
            System.out.println("");
        } else {
            System.out.println("Withdrawal failed, your balance is insufficient!");
            System.out.println("");
        }
    }
}
