package BankingApplication;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<Account>();


        String file = "/Users/darrensan/Documents/NewBankAccounts.csv";
        List<String[]> newAccountHolders = Utilities.CSV.read(file);
        for (String[] accountHolders:newAccountHolders) {
            String name = accountHolders[0];
            String sSN = accountHolders[1];
            String accountType = accountHolders[2];
            double initDeposit = Double.parseDouble(accountHolders[3]);

            if (accountType.equals("Savings")) {
                accounts.add(new Savings(name, sSN, initDeposit));
            } else if (accountType.equals("Checking")) {
                accounts.add(new Checking(name, sSN, initDeposit));
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

        for (Account acc : accounts) {
            System.out.println("***********\n");
            acc.showInfo();
        }



    }
}
