import java.util.*;

class movie{
    private String name;
    private String company;
    private String genre;
    private int budget;

    movie(String a, String b, String c, int d){
        this.name =a ;
        this.company = b;
        this.genre = c;
        this.budget = d;
    }

    public String getName(){
        return name;
    }
    public String getCompany(){
        return company;
    }
    public String getGenre(){
        return genre;
    }
    public int getBudget(){
        return budget;
    }
}

public class IPA14_Movie {

    public static movie[] getMovie(movie[] arr, String a){
        int count = 0;
        for(int i =0; i < arr.length; i++){
            if(arr[i].getGenre().equalsIgnoreCase(a)){
                count++;
            }
        }

        if(count == 0){
            return null;
        }

        movie[] re = new movie[count];
        int index = 0;

        for(int i =0; i < arr.length; i++){
            if(arr[i].getGenre().equalsIgnoreCase(a)){
                re[index] = arr[i];
                index++;
            }
        }
        return re;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        movie[] arr = new movie[4];

        for(int i= 0;i < 4 ;i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new movie(a, b, c ,d);
        }

        String val1 = sc.nextLine();

        movie[] out = getMovie(arr, val1);



        if(out != null) {
            for (int i = 0; i < out.length; i++) {
                if (out[i].getBudget() > 80000000) {
                    System.out.println("High Budget Movie");
                } else {
                    System.out.println("Low Budget Movie");
                }
            }
        }
    }
}
