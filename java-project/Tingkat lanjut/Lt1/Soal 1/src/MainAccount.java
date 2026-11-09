public class MainAccount {
    public static void main(String[] args) {
        Account r1 = new Account("Akmallutfi Afza Gusty", "12345678", 99999999);

        System.out.println("<=======Account information======>");
        System.out.println("Account Number :" + r1.getAccountNumber());
        System.out.println("Owner's Name :" + r1.getNameOwner());
        System.out.println("Balance :" + r1.getbalance());
        System.out.println("");

        r1.setNameOwner("Afza");

        r1.deposit(100000000);
        r1.withDraw(100000);

        System.out.println("<======After the Transaction=======>");
        System.out.println("Owner's Name :" + r1.getNameOwner());
        System.out.println("Balance :" + r1.getbalance());
    }
}
