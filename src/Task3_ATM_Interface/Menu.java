package Task3_ATM_Interface;

import java.util.Scanner;
public class Menu {
    
    Scanner sc = new Scanner(System.in);
    int amount = 25000;
    int i =0;
    String[] array = new String[100];

    void transactionHistory() {
        if(i==0){
            System.out.println("No Transactions");
        }
        else{
            System.out.println("Name            Type                Amount"  );
            for(int j=0; j<i; j++){
                System.out.println(array[j]);
            }
        }
        System.out.println("Balance Amount: "+amount);
    }

    void withdraw () {
        System.out.print("Enter amount for withdraw: ");
        int withdrawAmount = sc.nextInt();
        if(withdrawAmount<amount) {
            amount = amount - withdrawAmount;
            array[i] = "Self           " + "Withdraw              " + withdrawAmount;
            i++;
            System.out.println("Amount Withdrawn Successfully!");
        }
        else{
            System.out.println("Not Sufficient Balance.");
            System.out.println("Request Timeout");
            System.exit(0);
        }
    }

    void deposit () {
        System.out.print("Enter amount for deposit: ");
        int depositAmount = sc.nextInt();
        amount = amount + depositAmount;
        array[i] = "Self           " + "Deposit               " + depositAmount;
        i++;
        System.out.println("Amount Deposited Successfully!");
    }

    void transfer () {
        System.out.print("Enter Receiver's Name: ");
        String receiverName = sc.next();
        System.out.print("Enter Receiver's Account Number:");
        String receiverAccount = sc.next();
        System.out.print("Enter Amount to Transfer: ");
        int transferAmount= sc.nextInt();
        if(transferAmount<amount ) {
            if(transferAmount <=20000) {
                amount = amount - transferAmount;
                array[i] = receiverName + "          Transfer              " + transferAmount;
                i++;
                System.out.println("Amount Successfully Transferred to " + receiverName);
            }else{
                System.out.println("Maximum limit is 20000 only!");
            }
        }
        else{
            System.out.println("Not Sufficient Balance.");
            System.out.println("Request Timeout");
            System.exit(0);
        }

    }

    Menu () {
        int choice;
        do {
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: transactionHistory();
                    break;
                case 2: withdraw();
                    break;
                case 3: deposit();
                    break;
                case 4: transfer();
                    break;
                case 5: System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }while(choice!=5);

    }

    public static void main(String[] args) {
        new Menu();
    }

}
