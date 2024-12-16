import java.util.Scanner;
import java.util.*;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String r = sc.nextLine();

        char[] s_array = s.toCharArray();
        Arrays.sort(s_array);
        char[] r_array = r.toCharArray();
        Arrays.sort(r_array);
        System.out.println(s_array);
        System.out.println(r_array);
        boolean ram = Arrays.equals(r_array, s_array);
        System.out.println(ram);

    }
}
