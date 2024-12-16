import java.util.Scanner;
import java.util.*;


class player{
    private int id;
    private String skill;
    private String level;
    private int points;

    player(int a, String b, String c, int d){
        this.id = a;
        this.skill =b;
        this.level =c;
        this.points = d;
    }

    public int getId(){
        return id;
    }

    public String getSkill(){
        return skill;
    }

    public String getLevel(){
        return level;
    }

    public int getPoints(){
        return points;
    }
}

public class IPA11_Player {

    public static int findpoints(player[] arr, String s){
        int count = 0;
        for(int i =0; i< arr.length; i++){
            if(arr[i].getSkill().equalsIgnoreCase(s)){
                count += arr[i].getPoints();
            }

        }
        return count;
    }

    public static player getPlayer(player[] arr, String level, String skill){
        player temp = null;

        for(int i =0; i < arr.length; i++){
            if(arr[i].getPoints()>=20 && arr[i].getSkill().equalsIgnoreCase(skill) && arr[i].getLevel().equalsIgnoreCase(level)){
                temp = arr[i];
                return temp;
            }
        }
        return temp;
    }


        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            player[] arr = new player[4];

            for(int i =0 ; i < 4; i++){
                int a = sc.nextInt(); sc.nextLine();
                String b = sc.nextLine();
                String c = sc.nextLine();
                int d = sc.nextInt();
                arr[i] = new player(a, b, c, d);
            }
            sc.nextLine();
            String iskill = sc.nextLine();
            String ilevel =  sc.nextLine();

            int val1 =  findpoints(arr, iskill);
            player val2 = getPlayer(arr, ilevel, iskill);

            if(val1 > 0){
                System.out.println(val1);
            }
            else{
                System.out.println("The Given Skill is not Avalilable.");
            }

            if(val2 == null){
                System.out.println("No player availble");
            }
            else{
                System.out.println(val2.getId());
            }
        }

    }


