import java.util.Scanner;

public class calculatorFunction {

    public static int calculator(int a, int b, char c){
        if(c == '+'){
            return a + b;
        }
        else if (c == '-'){
            return a - b;
        }
        return 0;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String c = scan.next();
        System.out.println(calculator(a, b ,c.charAt(0)));
    }
}
