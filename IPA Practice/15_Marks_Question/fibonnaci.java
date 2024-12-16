//import java.util.*;
//import java.io.*;
//
//public class fibonnaci
//{
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//
//        int s = 0;
//        int f = 0;
//
//
//        while(f <= a){
//            if(f == 0){
//                System.out.println(0);
//                f = 1;
//                continue;
//            }
//            int temp = f;
//            f = f+s;
//            s = temp;
//            System.out.println(s);
//
//        }
//
//    }
//}




import java.util.*;
public class fibonnaci
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int k = 1;
        String a = "";
        a = a + i + " ";
        System.out.print(i+" ");
        while(k<n)
        {
            System.out.print(k+" ");
            a = a + k + " ";
            int p = k;
            k = k+i;
            i = p;
        }
        System.out.println();
        System.out.println(a.substring(0, a.length()-1));
    }
}
