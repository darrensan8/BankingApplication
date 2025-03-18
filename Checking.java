package BankingApplication;

public class Checking extends Account {
    private int debitCardNumber;
    private int debitCardPin;
    public Checking(String name, String sSN, double initDepositAmt) {
        super(name, sSN, initDepositAmt);
        accountNum = "2" + accountNum;
        setDebitCard();
    }
    @Override
    public void setRate() {
        rate = getBaseRate() * 0.15;
    }
    private void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10,12));
        debitCardPin = (int) (Math.random() * Math.pow(10,4));

    }
    public void showInfo() {

        System.out.println("ACCOUNT TYPE: CHECKING ACC");
        super.showInfo();
        System.out.println(
                "Your checking account features:" +
                        "\nDebit card number: " + debitCardNumber +
                        "\nDebit card pin: " + debitCardPin
        );
    }
}
