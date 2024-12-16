import java.util.*;
import java.io.*;


public class words_Starts_with_vowel {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String a = "aeiou";

        String[] arr = s.split(" ");

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != "" && a.contains(Character.toString(arr[i].toLowerCase().charAt(0)))){
                count++;
            }
        }
        System.out.println(count);


    }

}
