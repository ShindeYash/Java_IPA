import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        boolean flag = true;

        for(int i =0 ; i < s.length(); i++){
            if(s.charAt(i) == t.charAt(t.length() - 1 - i)){
                continue;
            }
            else{
                flag = false;
            }
        }

        if(flag == false){
            System.out.println(false);
        }
        else{
            System.out.println(true);
        }
    }
}
