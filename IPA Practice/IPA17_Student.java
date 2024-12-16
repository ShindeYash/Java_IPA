import java.util.Scanner;

class student{
    private int rollNo;
    private String name;
    private String Subject;
    private char grade;
    private String date;


    student(int a, String b, String c, char d, String e){
        this.rollNo = a;
        this.name = b;
        this.Subject = c;
        this.grade = d;
        this.date = e;
    }

    public int getRollno(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public String getSubject(){
        return Subject;
    }
    public char getGrade(){
        return grade;
    }
    public String getDate(){
        return date;
    }

}


public class IPA17_Student {

    public static student[] findStuent(student[] arr, char grade, int month){

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i].getGrade() == grade && Integer.parseInt(arr[i].getDate().substring(3, 5)) == month){
                count++;
            }
        }

        if(count == 0){
            return null;
        }
        student[] r = new student[count];
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i].getGrade() == grade && Integer.parseInt(arr[i].getDate().substring(3, 5)) == month){
                r[index] = arr[i];
                index++;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        student[] arr = new student[4];

        for(int i = 0; i < 4; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            char d = sc.nextLine().charAt(0);
            String e = sc.nextLine();

            arr[i] = new student(a, b, c ,d , e);
        }

        char grade = sc.nextLine().charAt(0);
        int month = sc.nextInt();

        student[] r = findStuent(arr, grade, month);

        if(r == null){
            System.out.println("No Student Fount");
        }
        else{
            for(int i = 0; i < r.length; i++){
                System.out.println(r[i].getName());
                System.out.println(r[i].getSubject());
            }
            System.out.println(r.length);
        }

    }
}
