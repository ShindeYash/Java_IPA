
import java.util.*;

class car{
    private int id;
    private String brand;
    private int testConducted;
    private int testPassed;
    private String environment;
    private String rating;


    car(int a, String b, int c, int d, String e){
        this.id = a;
        this.brand = b;
        this.testConducted = c;
        this.testPassed = d;
        this.environment =e;
    }

    public void setRating(String s){
        this.rating = s;
    }

    public int getId(){
        return id;
    }

    public String getBrand(){
        return brand;
    }

    public int getTC(){
        return testConducted;
    }

    public int getTP(){
        return testPassed;
    }

    public String getEnv(){
        return environment;
    }
}

public class IPA13_AutonomousCar {

    public static int findTests(car[] arr, String s){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getEnv().equalsIgnoreCase(s)){
                sum += arr[i].getTP();
            }
        }
        return sum;
    }

    public static car getGrade(car[] arr, String s){
        car getCar = null;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getBrand().equalsIgnoreCase(s)){
                int t = (arr[i].getTP()*100/arr[i].getTC());

                getCar = arr[i];
                if(t >= 80){
                    arr[i].setRating("A1");
                }
                else{
                    arr[i].setRating("B2");
                }
            }
        }
        return getCar;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        car[] arr = new car[4];
        for(int i = 0; i < 4; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new car(a, b, c, d, e);
        }
        String env = sc.nextLine();
        String brand = sc.nextLine();

        int val1 = findTests(arr, env);
        car val2 = getGrade(arr, brand);

        if(val1 == 0){
            System.out.println("There are no tests passed in this environment.");
        }
        else{
            System.out.println(val1);
        }

        if(val2 == null){
            System.out.println("No Car is available with the specified brand.");
        }
        else{
            System.out.println(val2.getBrand()+"::"+val2.getEnv());
        }
    }
}
