import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = a;
        int sum = 0;
        while(a > 0){
            int c = a % 10;
            sum += Math.pow(c, 3);
            a = a / 10;
        }

        if(b == sum){
            System.out.println("yes armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
    }
}
