import java.util.*;

class employee{
    private int employeeId;
    private String employeeName;
    private int age;
    private String gender;
    private double salary;

    employee(int a, String b, int c, String d, double e){
        this.employeeId = a;
        this.employeeName = b;
        this.age = c;
        this.gender = d;
        this.salary = e;
    }

    public int getId(){
        return employeeId;
    }

    public String getName(){
        return employeeName;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    public double getSalary(){
        return salary;
    }
}


public class Second_lowest_salary {

    static employee sec_salary(employee[] arr){
        double first = Double.MAX_VALUE;
        employee f = null;
        double second = Double.MAX_VALUE;
        employee s = null;

        if(arr.length < 2){
            return null;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i].getSalary() < first){
                second = first;
                first = arr[i].getSalary();
                f = arr[i];
            }
            else if (arr[i].getSalary() < second){
                second = arr[i].getSalary();
                s = arr[i];
            }
        }

        if (second != Double.MAX_VALUE){
            return s;
        }
        return null;

    }

    static int count_age(employee[] arr, int age){
        int count = 0;
        for(int i =0 ; i< arr.length; i++){
            if(arr[i].getAge() == age){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();
        sc.nextLine();
        employee[] arr = new employee[no];

        for(int i =0; i < no; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            String d = sc.nextLine();
            double e = sc.nextDouble(); sc.nextLine();

            arr[i] = new employee(a, b, c, d, e);
        }

        int ageFlag = sc.nextInt();

        employee e = sec_salary(arr);
        if(e != null){
        System.out.println(e.getId()+"#"+e.getName());}
        else{
            System.out.println("Null");
        }

        int a = count_age(arr, ageFlag);
        System.out.println(a);
    }
}
