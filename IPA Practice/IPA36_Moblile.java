import java.util.*;

class mobile{
    private int id;
    private int price;
    private String brand;
    private boolean flag;

    mobile(int a, int b, String c, boolean d){
        this.id = a;
        this.price = b;
        this.brand = c;
        this.flag = d;
    }

    public int getId(){
        return id;
    }
    public int getPrice(){
        return price;
    }
    public String getBrand(){
        return brand;
    }
    public boolean getFlag(){
        return flag;
    }
}

public class IPA36_Moblile {

    static int getPrice(mobile[] arr, String s){
        int sum = 0;
        for(int i =0; i < arr.length; i++){
            if(arr[i].getBrand().equalsIgnoreCase(s)){
                sum += arr[i].getPrice();
            }
        }
        return sum;
    }

    static mobile[] secprice(mobile[] arr){
        int count=0;
        int min = Integer.MAX_VALUE;
        int secmin = Integer.MAX_VALUE;

        for(int i =0 ; i < arr.length; i++){
            if(arr[i].getPrice() < min) {
                secmin = min;
                min = arr[i].getPrice();
            }
            else if (arr[i].getPrice() < secmin){
                secmin = arr[i].getPrice();
            }
        }

        for(int i = 0; i< arr.length; i++){
            if(arr[i].getPrice() == secmin){
                count++;
            }
        }
        mobile[] re = new mobile[count];
        int index = 0;

        for(int i =0 ;i < arr.length; i++){
            if(arr[i].getPrice() == secmin){
                re[index] = arr[i];
                index++;
            }
        }

        return re;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        mobile[] arr = new mobile[5];
        for(int i = 0; i < 5; i++){
            int a = sc.nextInt();
            int b = sc.nextInt(); sc.nextLine();
            String c = sc.nextLine();
            boolean d = sc.nextBoolean();

            arr[i] = new mobile(a, b, c, d);
        }

        sc.nextLine();
        String val1 = sc.nextLine();

        int re1 = getPrice(arr, val1);
        mobile[] re2 = secprice(arr);

        if(re1 == 0){
            System.out.println("this not has taht mobile");
        }
        else{
            System.out.println(re1);
        }

        for(int i = 0; i < re2.length; i++){
            System.out.println(re2[i].getBrand() + " : " + re2[i].getPrice());
        }

    }
}
