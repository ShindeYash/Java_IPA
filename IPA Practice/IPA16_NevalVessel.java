import java.util.*;

class NevalVessel{
    private int id;
    private String name;
    private int noVP;
    private int noVC;
    private String purpose;
    private String classification;

    NevalVessel(int a, String b, int c, int d, String e){
        this.id = a;
        this.name = b;
        this.noVP = c;
        this.noVC = d;
        this.purpose = e;
    }


    public void setCalss(String s){
        classification = s;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getVP(){
        return noVP;
    }
    public int getVC(){
        return noVC;
    }
    public String getPurpose(){
        return purpose;
    }

}

public class IPA16_NevalVessel {

    public static int findAvg(NevalVessel[] arr, int percentage){
        int sum = 0;
        int count = 0;

        for(int i =0 ; i < arr.length; i++){
            int per = (arr[i].getVC()*100/arr[i].getVP());

            if(per > percentage){
                count++;
                sum += arr[i].getVC();
            }
        }
        if(count == 0){
            return 0;
        }
        return sum/count;
    }

    public static NevalVessel findGrade(NevalVessel[] arr, String purpose){
        NevalVessel re = null;

        for(int i =0 ; i < arr.length; i++){
            if(arr[i].getPurpose().equalsIgnoreCase(purpose)){
                int per = (arr[i].getVC()*100/arr[i].getVP());

                if(per == 100){
                    arr[i].setCalss("Star");
                    re = arr[i];
                }
                else if(per >= 80 && per <= 99){
                    arr[i].setCalss("Leader");
                    re = arr[i];
                }
                else if(per >= 55 && per <= 79){
                    arr[i].setCalss("Inspirer");
                    re = arr[i];
                }
                else{
                    arr[i].setCalss("Striver");
                    re = arr[i];
                }
            }
        }
        return re;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        NevalVessel[] arr = new NevalVessel[4];

        for(int i = 0; i < 4; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new NevalVessel(a, b, c, d, e);
        }
        int per = sc.nextInt(); sc.nextLine();
        String s = sc.nextLine();

        int a = findAvg(arr, per);
        NevalVessel b = findGrade(arr, s);

        if(a == 0){
            System.out.println("Not found any avg vessals");
        }
        else{
            System.out.println(a);
        }

        if(b == null){
            System.out.println("No Such Vessel Found");
        }
        else{
            System.out.println(b.getName()+"%"+b.getPurpose());
        }

    }
}
