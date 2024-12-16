import java.util.*;

class car35{
    private int id;
    private String name;
    private String fueltype;

    car35 (int a, String b, String c){
        this.id = a;
        this.name = b;
        this.fueltype = c;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getFueltype(){
        return fueltype;
    }
}

public class IPA35_CAR {

    static car35[] arrArrange(car35[] arr, int a){
        int count = 0;
        for(int i =0 ;i < arr.length; i++){
            if(arr[i].getId() == a){
                count++;
            }
        }

        if(count == 0){
            return null;
        }

        car35[] re = new car35[arr.length-count];
        int index = 0;

        for(int i =0 ;i < arr.length; i++){
            if(arr[i].getId() != a){
                re[index] = arr[i];
                index++;
            }
        }
        return re;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        car35[] arr = new car35[5];

        for(int i = 0;i < 5; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();

            arr[i] = new car35(a, b, c);
        }
        int val1 = sc.nextInt(); //sc.close();

        car35[] ret = arrArrange(arr, val1);

        if(ret == null){
            System.out.println("not found any");
        }
        else{
            for(int i =0; i < ret.length; i++){
                System.out.println(ret[i].getId() + " : "+ ret[i].getName());
            }
        }


    }
}
