
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sort_books_by_price {
    static book[] sortBooks(book[] arr){
        int no = arr.length;
        for(int i = 0; i < no - 1; i++){
            for(int j = 0; j < no - 1; j++){
                if(arr[j].getPrice() > arr[j + 1].getPrice()){
                    book temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        book[] new_arr = new book[4];

        for(int i = 0; i < 4; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();

            new_arr[i] = new book(a, b, c, d);

        }

        book[] sol_arr = sortBooks(new_arr);

        for(int i = 0 ; i < 4; i++){
            System.out.println(sol_arr[i].getId() + " " + sol_arr[i].getTitle() + " "
                    + sol_arr[i].getAuthor() + " " + sol_arr[i].getPrice());
        }
    }
}

class book{
    private int id;
    private String title;
    private String author;
    private double price;

    book(int a, String b, String c, double d){
        this.id = a;
        this.title = b;
        this.author = c;
        this.price = d;
    }

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }
}
