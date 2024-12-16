import java.util.*;


public class majority_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            arr[i] = l;
        }


        Arrays.sort(arr);
        int c = arr[n/2];

        int count = 0;

        for(int i =0 ; i < n; i ++){
            if(arr[i] == c){
                count++;
            }
        }

        if(count > (n/2)){
            System.out.println(c);
        }
    }
}
