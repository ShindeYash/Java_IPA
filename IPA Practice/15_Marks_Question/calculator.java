/*
Write a Java program to implement a simple calculator. The program should prompt the user to enter two numbers and an
operator (+, -, *, or /) and then perform the corresponding operation and display the result.

For example, if the user enters 4, 5, and +, the program should display 9 as the result. Similarly, if the user enters 10, 3,
and *, the program should display 30 as the result.

Your program should handle invalid inputs gracefully, for example, if the user enters an operator that is not one of the four
allowed operators or if the user enters non-numeric inputs.
*/


import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); sc.nextLine();
        String c = sc.nextLine();

        switch(c){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
