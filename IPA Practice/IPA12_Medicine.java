import java.util.Scanner;
import java.util.*;

class medicine{
    private String name;
    private String batch;
    private String disease;
    private int price;

    medicine(String a, String b, String c, int d){
        this.name = a;
        this.batch = b;
        this.disease = c;
        this.price = d;
    }

    public String getName(){
        return name;
    }

    public String getBatch(){
        return batch;
    }

    public String getDisease(){
        return disease;
    }

    public int getPrice(){
        return price;
    }
}


public class IPA12_Medicine {

    public static int[] getprice(medicine[] arr, String s){
        int count = 0;
        for(int i =0; i < arr.length; i++){
            if(arr[i].getDisease().equalsIgnoreCase(s)){
                count++;
            }
        }

        if(count == 0){
            return null;
        }

        int[] r = new int[count];
        int index = 0;

        for(int i =0; i < arr.length; i++){
            if(arr[i].getDisease().equalsIgnoreCase(s)){
                r[index] = arr[i].getPrice();
                index++;
            }
        }

        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        medicine[] arr = new medicine[4];

        for(int i = 0; i < 4; i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new medicine(a, b, c, d);
        }

        String disease = sc.nextLine();

        int[] val = getprice(arr, disease);

        for(int i: val){
            System.out.println(i);
        }

    }
}
