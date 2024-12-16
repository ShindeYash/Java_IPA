import java.util.Scanner;

class footwear{
   private int id;
    private String name;
    private String type;
    private int price;

    footwear(int a, String b, String c, int d){
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
    public int getPrice(){
        return price;
    }
}

public class IPA2_Footwear {

    public static int countType(footwear[] arr, String s){
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i].getType().equalsIgnoreCase(s)){
                count++;
            }
        }
        return count;
    }

    public static footwear secPrice(footwear[] arr, String name){
        int first = 0;
        int second = 0;
        footwear first_a = null;
        footwear second_a= null;

        for(int i = 0; i < arr.length; i++){
            if (arr[i].getName().equalsIgnoreCase(name)) {
                if(arr[i].getPrice() > first){
                    second = first;
                    first = arr[i].getPrice();
                    second_a = first_a;
                    first_a = arr[i];
                }
                else if (arr[i].getPrice() > second){
                    second  = arr[i].getPrice();
                    second_a = arr[i];

                }
            }
        }
        return second_a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        footwear[] arr = new footwear[5];

        for(int i = 0 ; i < 5; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();

            arr[i] = new footwear(a, b, c, d);
        }
        sc.nextLine();
        String in1  = sc.nextLine();
        String in2  = sc.nextLine();

        int val1 = countType(arr, in1);
        footwear val2 = secPrice(arr, in2);

        if(val1 == 0){
            System.out.println("not found any count");
        }
        else {
            System.out.println(val1);
        }

        if(val2 == null){
            System.out.println("not adfasdfasfa");
        }
        else {
            System.out.println(val2.getPrice());
        }
    }
}
