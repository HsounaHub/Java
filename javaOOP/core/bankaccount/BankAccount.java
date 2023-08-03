public class BankAccount {
    private  double checkingBalance;
    private  double savingBalance;
    private static int numberOfAccounts;
    private static double totalAmountOfMoney;

    public BankAccount(double checkingBalance, double savingBalance) {
        this.checkingBalance = checkingBalance;
        this.savingBalance = savingBalance;
        numberOfAccounts++;
    }

    public void addMoneyToChecking(double amount) {
        double newCheckingBalance = this.checkingBalance + amount;
        this.checkingBalance=newCheckingBalance;
        System.out.println("Your new checking balance: " + newCheckingBalance);
    }

    public void addMoneyToSaving(double amount) {
        double newSavingBalance = this.savingBalance + amount;
        this.savingBalance=newSavingBalance;
        System.out.println("Your new saving balance: " + newSavingBalance);
    }

    public void withdrawMoneyFromChecking(double amount) {
        if ((this.checkingBalance - amount) >= 0) {
            double newCheckingBalance = this.checkingBalance - amount;
            this.checkingBalance=newCheckingBalance;
            System.out.println("Your new checking balance: " + newCheckingBalance);
        } else {
            System.out.println("You don't have enough money to withdraw from checking");
        }
    }

    public void totalMoney() {
        double totalAmount = this.checkingBalance + this.savingBalance;
        System.out.println("Your total amount: " + totalAmount);
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public static double getTotalAmountOfMoney() {
        return totalAmountOfMoney;
    }
}
