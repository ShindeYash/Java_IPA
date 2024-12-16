import java.util.Scanner;

class Antenna{
    private int id;
    private String name;
    private String pl;
    private double vs;

    Antenna(int a, String b, String c, double d){
        this.id = a;
        this.name = b;
        this.pl = c;
        this.vs = d;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getPl(){
        return pl;
    }
    public double getVs(){
        return vs;
    }
}

public class IPA18_Antenna {

    static int search(Antenna[] arr, String name){
        int id = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getName().equalsIgnoreCase(name)){
                id = arr[i].getId();
            }
        }
        return id;
    }


    static Antenna[] sort(Antenna[] arr, double d){
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i].getVs() < d){
                count++;
            }
        }

        if(count==0){
            return null;
        }

        Antenna[] r = new Antenna[count];
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i].getVs() < d){
                r[index] = arr[i];
                index++;
            }
        }

        for(int i = 0; i < r.length - 1; i++){
            for(int j = i; j < r.length; j++){
                if(arr[j].getVs() < arr[j+1].getVs()){
                    Antenna temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return r;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Antenna[] arr = new Antenna[4];
        for(int i = 0; i < 4; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();

            arr[i] = new Antenna(a, b, c ,d);
        }
        sc.nextLine();

        String name = sc.nextLine();
        double vs = sc.nextDouble();

        int val = search(arr, name);
        Antenna[] r = sort(arr, vs);

        if(val == 0){
            System.out.println("There is no antenna with given parameter");
        }
        else{
            System.out.println(val);
        }

        if(r != null){
        for (int i = 0; i < r.length; i++){
            System.out.println(r[i].getPl());
        }}
        else{
            System.out.println("Not found antenna");
        }
    }
}
