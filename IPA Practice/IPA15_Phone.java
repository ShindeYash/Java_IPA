import java.util.*;

class phone{
    private int id;
    private String os;
    private String brand;
    private int price;

    phone(int a, String b, String c, int d){
        this.id = a;
        this.os = b;
        this.brand = c;
        this.price = d;
    }

    public int getId(){
        return id;
    }
    public String getOs(){
        return os;
    }
    public String getBrand(){
        return brand;
    }
    public int getPrice(){
        return price;
    }
}

public class IPA15_Phone {
    public static int findPriceForGivenBrand(phone[] arr, String brand){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getBrand().equalsIgnoreCase(brand)){
                sum += arr[i].getPrice();
            }
        }
        return sum;
    }

    public static phone getPhoneIdBasedOnOs(phone[] arr, String os){
        phone temp = null;

        for(int i =0; i < arr.length; i++) {
            if (arr[i].getOs().equalsIgnoreCase(os) && arr[i].getPrice() >= 50000) {
                temp = arr[i];
                return temp;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        phone[] re = new phone[4];

        for(int i = 0; i < re.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();

            re[i] = new phone(a, b, c, d);
        }
        sc.nextLine();

        String val = sc.nextLine();
        String val2 = sc.nextLine();

        int re1 = findPriceForGivenBrand(re, val);
        phone re2 = getPhoneIdBasedOnOs(re, val2);

        if(re1 == 0){
            System.out.println("The given Brand is not available");
        }
        else{
            System.out.println(re1);
        }

        if(re2 == null){
            System.out.println("No phones are available with specified os and price range");
        }
        else{
            System.out.println(re2.getId());
        }
    }
}
