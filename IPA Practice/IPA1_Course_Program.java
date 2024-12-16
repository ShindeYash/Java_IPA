import java.util.Scanner;

class Course{
    private int Id;
    private String Name;
    private String Admin;
    private int Quiz;
    private int Handson;

    Course(int a, String b, String c, int d, int e){
        this.Id = a;
        this.Name = b;
        this.Admin = c;
        this.Quiz = d;
        this.Handson = e;
    }

    public int getId(){
        return Id;
    }

    public String getName(){
        return Name;
    }

    public String getAdmin(){
        return Admin;
    }

    public int getQuiz(){
        return Quiz;
    }

    public int getHandson(){
        return Handson;
    }
}

public class IPA1_Course_Program {
    public static int findAvg(Course[] arr, String value){
        int count = 0;
        int sum = 0;
        for(int i =0; i < arr.length; i++){
            if(arr[i].getAdmin().equalsIgnoreCase(value)){
                count++;
                sum += arr[i].getQuiz();
            }
        }
        if(count == 0){
            return 0;
        }
        return sum/count;
    }

    public static Course[] sort_course (Course[] arr, int val) {
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getHandson() < val){
                count++;
            }
        }

        if(count == 0){
            return null;
        }

        Course[] sol = new Course[count];



        for(int i = 0; i < arr.length; i++){
            if(arr[i].getHandson() < val){
                sol[i] = arr[i];
            }
        }



        for(int i = 0; i < count; i++){
            for(int j = 0; j < count - 1; j++){
                if(sol[j].getHandson() < sol[j+1].getHandson()){
                    Course temp = sol[j];
                    sol[j] = sol[j+1];
                    sol[j+1] = temp;
                }
            }
        }

        return sol;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Course[] input = new Course[4];

        for(int i = 0; i < 4; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            int e = sc.nextInt(); sc.nextLine();

            input[i] = new Course(a, b, c, d, e);
        }

        String val1 = sc.nextLine();
        int val2 = sc.nextInt();

        int return1 = findAvg(input, val1);
        if(findAvg(input, val1) == 0){
            System.out.println("No Course found.");
        }
        else{
            System.out.println(return1);
        };

        Course[] return2 = sort_course(input, val2);

        if(return2 == null){
            System.out.println("No Course found with mentioned attribute.");
        }
        else{
            for(int i = 0; i < return2.length; i++){
                System.out.println(return2[i].getName());
            }
        }


    }
}
