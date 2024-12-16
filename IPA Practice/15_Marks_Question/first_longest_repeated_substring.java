import java.util.*;
import java.io.*;

public class first_longest_repeated_substring {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();



        int i = 0;
        int j = 1;

        String r = "";
        String s = "";


        for(int m = 0; m < line.length(); m++){
            if(line.substring(i, j).contains(Character.toString(line.charAt(m)))){
                if(r.length() < s.length()){
                    r = s;
                }
                else{
                    s = s + line.charAt(m);
                }
            }
        }

        System.out.println(r);

    }
}
