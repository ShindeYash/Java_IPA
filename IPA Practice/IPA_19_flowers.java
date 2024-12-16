import java.util.Scanner;

class flower{
    private int id;
    private String name;
    private int price;
    private int rating;
    private String type;

    flower(int a, String b, int c, int d, String e){
        this.id = a;
        this.name = b;
        this.price = c;
        this.rating = d;
        this.type = e;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public int getRating(){
        return rating;
    }
    public String getType(){
        return type;
    }
}


public class IPA_19_flowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        flower[] arr = new flower[4];

        for(int i = 0; i < 4;i ++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new flower(a, b, c, d, e);

        }

        flower val = minfind(arr);

        if(val == null){
            System.out.println("No flower found");
        }
        else{
            System.out.println(val.getId());
        }

    }


    public static flower minfind(flower[] arr){
        flower min = null;
        int price = 0;
        for(int i =0 ;i < 4; i++){
            if(arr[i].getPrice() > price && arr[i].getRating() > 3){
                min = arr[i];
                price = arr[i].getPrice();
            }
        }
        return min;
    }
}
