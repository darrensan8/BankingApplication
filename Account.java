package BankingApplication;

public abstract class Account implements InterestBaseRate {
    // List common properties in savings and checking acc
    private String name;
    private String sSN;
    private double balance;
    private static int index = 1000;
    protected String accountNum;
    protected double rate;

    public Account(String name,String sSN, double initDepositAmt) {
        this.name = name;
        this.sSN = sSN;
        balance = initDepositAmt;
        index++;
        this.accountNum = setAccountNum();
        setRate();
    }

    public abstract void setRate();

    private String setAccountNum() {
        String lastTwoDigitOfSSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNum = (int)(Math.random() * Math.pow(10,3));
        return lastTwoDigitOfSSN + uniqueID + randomNum;
    }

    public void compound() {
        double accruedInterest = balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println("Accrued Interest: $ " + accruedInterest);
        printBalance();
    }

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }

    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawing $" + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("Transfering $" + amount + " to " + toWhere);
        printBalance();
    }
    public void printBalance() {
        System.out.println("Your balance is currently: $" + balance);
    }
    public void showInfo() {
        System.out.println(
                "NAME: " + name +
                "\nACCOUNT NUMBER: " + accountNum +
                "\nBALANCE: " + balance +
                "\nRATE: " + rate + "%"

        );
    }

}
