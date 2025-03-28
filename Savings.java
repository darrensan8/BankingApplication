package BankingApplication;

public class Savings extends Account {
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;
    public Savings(String name,String sSN, double initDepositAmt) {
        super(name, sSN, initDepositAmt);
        accountNum = "1" + accountNum;
        setSafetyDepositBox();
    }
    @Override
    public void setRate() {
        rate = getBaseRate() - 0.25;
    }
    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
    }
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: SAVINGS ACC");
        super.showInfo();
        System.out.println(
                "Your savings account features:" +
                        "\nSafety Deposit Box ID: " + safetyDepositBoxID +
                        "\nSafety Deposit Box Pin: " + safetyDepositBoxKey
        );
    }
}
