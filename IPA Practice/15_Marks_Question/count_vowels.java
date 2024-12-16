/* Count number of vowel, consonent and digit into a string */


import java.util.Scanner;



public class count_vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count_vowel = 0;
        int count_digit = 0;
        int count_consonent = 0;

        String a = sc.nextLine();
        String b = "0123456789";
        String c = "aeiou";

        for(int i = 0; i < a.length(); i++){
            if(c.contains(Character.toString(a.toLowerCase().charAt(i)))){
                count_vowel++;
            }
            else if(Character.isDigit(a.charAt(i))){
                count_digit++;
            }
            else if(c.contains(Character.toString(a.toLowerCase().charAt(i))) == false && Character.isLetter(a.charAt(i))){
                count_consonent++;
            }
        }
        System.out.println("Count of Vowels : " + count_vowel);
        System.out.println("Count of Digits : " + count_digit);
        System.out.println("Count of Consonents : " + count_consonent);
    }
}