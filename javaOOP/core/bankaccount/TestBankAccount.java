public class TestBankAccount {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount bankAccount = new BankAccount(1000.0, 500.0);

        // addMoneyToChecking method
        bankAccount.addMoneyToChecking(200.0);

        // addMoneyToSaving method
        bankAccount.addMoneyToSaving(300.0);

        // withdrawMoneyFromChecking method
        bankAccount.withdrawMoneyFromChecking(400.0);

        // totalMoney method
        bankAccount.totalMoney();
        System.out.println(BankAccount.getNumberOfAccounts());
    }
}
