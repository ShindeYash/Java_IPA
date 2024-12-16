import java.util.Scanner;

public class count_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] arr = s.split(" ");


        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != ""){
                count++;
            };
        }

        System.out.println(count);
    }
}
