import java.util.*;
import java.io.*;




public class word_count_check {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String word = sc.nextLine();

        String[] arr = line.split(" ");
        int count = 0;

        for(int i =0 ; i < arr.length; i++){
            if(arr[i].toLowerCase().contains(word.toLowerCase())){
                count++;
            }
        }

        System.out.println(count);
    }
}
