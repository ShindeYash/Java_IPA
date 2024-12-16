// aabbbcc = a2b3c2
// abbccc = a1b2c3

import java.util.Scanner;



public class charRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        char current_char = a.charAt(0);
        int count = 0;
        for(int i =0; i < a.length(); i++){
            if(a.charAt(i) == current_char){
                count++;
            }
            else{
                System.out.print(current_char+""+count);
                current_char = a.charAt(i);
                count = 1;
            }
        }
        System.out.println(current_char+""+count);
    }
}
