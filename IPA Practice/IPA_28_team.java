import java.util.*;

class team{
    private int id;
    private String name;
    private String country;
    private int run;

    team(int a, String b, String c, int d){
        this.id = a;
        this.name = b;
        this.country = c;
        this.run = d;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getCountry(){
        return country;
    }
    public int getRun(){
        return run;
    }
}

public class IPA_28_team {
    static team findPlayer(team[] arr, int run, String c){
        team re = null;

        for(int i =0; i < arr.length; i++){
            if(arr[i].getCountry().equalsIgnoreCase(c) && arr[i].getRun() > run){
                re = arr[i];
                return re;
            }
        }
        return re;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();
        team[] arr = new team[no];

        for(int i =0 ; i < no; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            arr[i] = new team(a, b, c , d);
        }

        int val1 = sc.nextInt(); sc.nextLine();
        String val2 = sc.nextLine();

        team re = findPlayer(arr, val1, val2);

        if(re == null){
            System.out.println("Not found such a team");
        }
        else{
            System.out.println(re.getId());
            System.out.println(re.getCountry());
            System.out.println(re.getRun());
            System.out.println(re.getName());
        }

    }

}
