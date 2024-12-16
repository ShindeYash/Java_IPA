import java.util.Scanner;

public class perfect_Squeare {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            double res = Math.sqrt(num);
            if((res - (int)res == 0))
            {
                System.out.println("Perfect Square");
            }
            else
            {
                System.out.println("Not a perfect square");
            }

    }
}
