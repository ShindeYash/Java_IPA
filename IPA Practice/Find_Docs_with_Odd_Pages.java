import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Find_Docs_with_Odd_Pages  {

    static Document[] docWithOdd(Document[] arr){
        int no = 0;
        for(int i =0 ; i < arr.length; i++){
            if(arr[i].pages % 2 == 1){
                no++;
            }
        }

        Document[] sol = new Document[no];
        int no_index = 0;

        for(int i =0 ; i < arr.length; i++){
            if(arr[i].pages % 2 == 1){
                sol[no_index] = arr[i];
                no_index += 1;
            }
        }
        return sol;
    }

    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Document[] arr = new Document[4];
        Scanner sc = new Scanner(System.in);
        for(int i =0 ; i< 4; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();


            arr[i] = new Document(a, b, c, d);
        }

        Document[] sol = docWithOdd(arr);

        for(int i = 0; i < sol.length - 1; i++){
            for(int j = 0; j < sol.length - 1- i; j++){
                if(sol[j].id > sol[j+1].id){
                    Document temp = sol[j];
                    sol[j] = sol[j+1];
                    sol[j+1] = temp;
                }
            }
        }


        if(sol != null){
            for(int i =0 ; i < sol.length; i++){
                System.out.println(sol[i].id + " " + sol[i].title + " " + sol[i].folderName +           " " + sol[i].pages);
            }
        }


    }
}

class Document
{
    int id;
    String title;
    String folderName;
    int pages;

    Document(int a, String b, String c, int d){
        this.id = a;
        this.title = b;
        this.folderName = c;
        this.pages = d;
    }
}



