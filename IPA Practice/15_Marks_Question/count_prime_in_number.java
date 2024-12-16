/* Count number of prime digit in a Number
 * Input : 254786135
 * Output : 5
 */


import java.util.Scanner;



public class count_prime_in_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        String a = sc.nextLine();
        String b = "2357";

        for(int i = 0; i < a.length(); i++){
            if(b.contains(Character.toString(a.charAt(i)))){
                count++;
            }
        }
        System.out.println(count);
    }
}
