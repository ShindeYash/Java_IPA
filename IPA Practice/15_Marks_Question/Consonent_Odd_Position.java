/* Find the characters in odd position of a string which are consonent
 *
 * Input: Arijit Ghosh
 * Output: hs
 */

import java.util.Locale;
import java.util.Scanner;



public class Consonent_Odd_Position {
    public static boolean isConsonent(char a){
        if(a == 'a' || a == 'o' ||a == 'i' ||a == 'e' || a == 'u'){
            return false;
        }
        else if (Character.isLetter(a)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        for(int i = 0; i < s.length(); i++){
            if(i%2==0){
                if(isConsonent(s.toLowerCase().charAt(i))){
                    System.out.print(s.charAt(i));
                }
            }
        }
    }
}
