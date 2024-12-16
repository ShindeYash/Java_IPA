import java.util.Scanner;
import java.util.*;

class engine{

    private int id;
    private String name;
    private String type;
    private double price;

    engine(int a, String b, String c, double d){
        this.id = a;
        this.name = b;
        this.type = c;
        this.price = d;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public double getPrice(){
        return price;
    }

}


public class IPA20_Engine {
    static double avgPrice(engine[] arr, String s){
        int count = 0;
        double sum = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i].getType().equalsIgnoreCase(s)){
                count++;
                sum += arr[i].getPrice();
            }
        }

        if(count == 0){
            return 0;
        }
        else{
            return sum/count;
        }
    }


    static engine[] getarr(engine[] arr, String s){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getName().equalsIgnoreCase(s)){
                count++;
            }
        }

        if(count == 0){
            return null;
        }

        engine[] re = new engine[count];
        int index = 0;

        for(int i =0; i < arr.length; i++){
            if(arr[i].getName().equalsIgnoreCase(s)){
                re[index] = arr[i];
                index++;
            }
        }

        for(int i =0 ; i <count; i++){
            for(int j =0; j < count; j++){
                if(arr[j].getId() < arr[j+1].getId()){
                    engine temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return re;
    }

    public static void main(String[] args){
        engine[] arr = new engine[4];

        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < 4; i++){
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();

            arr[i] = new engine(a, b, c, d);
        }

        sc.nextLine();
        String val1 = sc.nextLine();
        String val2 = sc.nextLine();

        double re1 = avgPrice(arr, val1);
        engine[] re2 = getarr(arr, val2);

        if(re1 == 0){
            System.out.println("No found avg string");
        }
        else{
            System.out.println(re1);
        }

        if(re2 == null){
            System.out.println("No found engines Null");
        }
        else{
            for(int i =0; i < re2.length; i++){
                System.out.println(re2[i].getId());
            }
        }


    }
}
