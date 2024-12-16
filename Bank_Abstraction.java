import java.util.Scanner;

abstract class bank_new{
    public String name = "BOM";
    public String IFSC = "234324";

    void show(){
        System.out.println("My banks name is "+name);
        System.out.println("My banks IFSC is "+IFSC);
    }

    abstract void deposite(int amount);
    abstract void withdraw(int amount);
    abstract void check_balance();
    abstract void change_password();
}

class customer extends bank_new {
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

public class Bank_Abstraction {
    public static void main(String[] args) {
        customer yash = new customer();
        yash.show();
        yash.deposite(4000);
    }
}
