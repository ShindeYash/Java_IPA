import java.util.*;
import java.io.*;

public class first_non_repeated_char {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            int flag = 0;
            int count = 0;
            char a = s.toLowerCase().charAt(i);

            for (int j = 0; j < s.length(); j++) {
                if (s.toLowerCase().charAt(j) == a) {
                    count++;
                }
            }
            if(count == 1){
                System.out.println(s.charAt(i));
                break;
            }

        }
    }
}