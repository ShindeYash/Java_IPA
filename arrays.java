import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // C Style Array Declaration;
        int[] a = {10, 20, 39, 30};
        System.out.println(a.length);
        System.out.println(Arrays.stream(a).anyMatch(num -> num == 200));
        System.out.println(Arrays.stream(a).max());
        System.out.println(Arrays.stream(a).min());

        for(int num : a){
            System.out.print(num + " ");
        }

        // Create new Array Object;
        int[] b = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.println();
            System.out.print("Enter element " + (i+1) + ": ");
            b[i] = scan.nextInt();
        }

        // Sort mentod using Arrays class for array b;
        Arrays.sort(b);

        for(int c: b){
            System.out.print(c + " ");
        }
    }
}
