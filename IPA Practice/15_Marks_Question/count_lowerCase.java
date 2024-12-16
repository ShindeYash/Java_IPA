import java.util.*;
import java.io.*;

public class count_lowerCase {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        int count = 0;


        for(int i =0; i < a.length(); i++){
            if((int)a.charAt(i) >= (int)'a' && a.charAt(i) <= 'z'){
                count++;
            }
        }
        System.out.println(count);
    }


}
