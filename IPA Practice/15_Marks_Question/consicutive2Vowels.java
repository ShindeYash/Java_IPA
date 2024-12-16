/*Count the number of words in a sentence that contain at least two consecutive vowels (a, e, i, o, u) in them.
Here's a sample input and output:

Input: I enjoy eating spaghetti and meatballs for dinner
Output: 2

Explanation: There are two words in the sentence that contain at least two consecutive vowels - "enjoy" and "meatballs".
 */

import java.util.Scanner;

public class consicutive2Vowels {

    public static boolean is_vowel(char a){
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String b = "aeiou";

        String s = sc.nextLine();

        String[] arr = s.split(" ");

        int count = 0;
        for(int i =0 ; i < arr.length; i++){

            for(int j = 0; j < arr[i].length() - 1; j++){
                if(b.contains(Character.toString(arr[i].toLowerCase().charAt(j))) &&  b.contains(Character.toString(arr[i].toLowerCase().charAt(j+1)))){
                    count++;
                }
//                if(is_vowel(arr[i].toLowerCase().charAt(j)) && is_vowel(arr[i].toLowerCase().charAt(j+1))){
//                    count++;
//                }
            }
        }

        System.out.println(count);

    }
}
