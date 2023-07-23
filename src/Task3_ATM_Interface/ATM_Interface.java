package Task3_ATM_Interface;

import java.util.Scanner;

public class ATM_Interface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserVerfication uv = new UserVerfication();
        System.out.println("Welcome to the ATM");
        System.out.print("Enter Name: ");
        String inputName = sc.nextLine();
        System.out.print("Enter Account Number: ");
        String inputAccountNumber = sc.next();
        System.out.print("Enter Pin: ");
        String inputPin = sc.next();
        while(true) {
            if (uv.Verification(inputAccountNumber, inputPin)) {
                System.out.println("Welcome " + inputName);
                new Menu();
                break;
            } else {
                System.out.println("Wrong Credentials");
                System.out.print("Enter Name: ");
                inputName = sc.next();
                System.out.print("Enter Account Number: ");
                inputAccountNumber = sc.next();
                System.out.print("Enter Pin: ");
                inputPin = sc.next();
            }
        }
    }
}

