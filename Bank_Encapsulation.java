import java.beans.PropertyEditorManager;
import java.util.Scanner;

// classes having Private attributes with public behaviour are the examples of Encapsulation.

class bank{
    private int balance;
    private final int password = 123;

    Scanner scan = new Scanner(System.in);
    void withdraw(int amount){
        System.out.println("Please enter the password: ");
        int pass = scan.nextInt();
        if (pass == password){
            if (balance >= amount){
                System.out.println(amount+" is wihtdrawn ");
                balance = balance - amount;
                System.out.println("Remaining balance is "+ balance);
            }
            else{
                System.out.println("Current Balnce is less : "+balance);
            }
        }
        else{
            System.out.println("Please Enter the Correct Password");
        }

    }

    void deposite(int amount){
        System.out.println("Please enter the password: ");
        int pass = scan.nextInt();
        if (pass == password){
                System.out.println(amount+" is deposited ");
                balance = balance + amount;
                System.out.println("New balance is "+ balance);

        }
        else{
            System.out.println("Please Enter the Correct Password");
        }

    }


    void check_balance(){
        System.out.println("Please enter the password: ");
        int pass = scan.nextInt();
        if (pass == password){
            System.out.println("Current Balance is "+ balance);

        }
        else{
            System.out.println("Please Enter the Correct Password");
        }

    }

    void change_password(){
        System.out.println("Please enter the password: ");
        int pass = scan.nextInt();
        int p1, p2;
        if (pass == password){
            System.out.print("Please enter New Password: ");
            p1 = scan.nextInt();
            System.out.println("Please Reenter New Password: ");
            p2 = scan.nextInt();
            if(p1 == p2){
                System.out.println("Your Password is Updated Successfully.");
            }
            else{
                System.out.println("Enter and Reenter didn't match. Try again Please.");
            }
        }
        else{
            System.out.println("Please Enter the Correct Password");
        }

    }
}

public class Bank_Encapsulation {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String name = scan.next();
        bank yash = new bank();

        System.out.println("Welcome to the bank");

        System.out.println("Our Bank has following Services: ");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Change Password");
        System.out.print("Please Enter Number of Your Service Request : ");

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        switch (n){
             case 1:
                yash.deposite(20000);
                break;
            case 2:
                yash.withdraw(2000);
                break;
            case 3:
                yash.check_balance();
                break;
            case 4:
                yash.change_password();
                break;
            default:
                System.out.println("Please Select Appropriate Option!");
        }
        System.out.println("Thanks for choosing our bank");


    }
}
