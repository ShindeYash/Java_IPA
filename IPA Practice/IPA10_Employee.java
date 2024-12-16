import java.util.Scanner;

class emp{
    private int empId;
    private String name;
    private String branch;
    private double rating;
    private boolean transport;


    emp(int a, String b, String c, double d, boolean e){
        this.empId = a;
        this.name = b;
        this.branch = c;
        this.rating = d;
        this.transport = e;
    }

    public int getEmpId(){
        return empId;
    }

    public String getName(){
        return name;
    }

    public String getBranch(){
        return branch;
    }

    public double getRating(){
        return rating;
    }

    public boolean isTransport(){
        return transport;
    }

}


public class IPA10_Employee {

    public static int countEmp(emp[] arr, String s){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getBranch().equals(s) && arr[i].isTransport()){
                count++;
            }
        }
        return count;
    }


    public static emp secEmp(emp[] arr){
        double first = Double.MIN_VALUE;
        emp first_emp = null;
        double sec = Double.MIN_VALUE;
        emp sec_emp = null;

        for(int i =0 ; i < arr.length; i++){
            if(!arr[i].isTransport()){
                if (arr[i].getRating() > first){
                    sec = first;
                    sec_emp = first_emp;
                    first = arr[i].getRating();
                    first_emp = arr[i];
                }
                else if (arr[i].getRating() > sec){
                    sec = arr[i].getRating();
                    sec_emp = arr[i];
                }
            }
        }
        return sec_emp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        emp[] arr = new emp[4];

        for(int i = 0; i < 4; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            boolean e = sc.nextBoolean(); sc.nextLine();

            arr[i] = new emp(a, b, c, d, e);
        }

        String val1 = sc.nextLine();

        int r1 = countEmp(arr, val1);
        emp r2 = secEmp(arr);

        if(r1 == 0){
            System.out.println("No emp with this count");
        }
        else{
            System.out.println(r1);
        }

        if(r2 == null){
            System.out.println("No second Employee");
        }
        else{
            System.out.println(r2.getEmpId());
            System.out.println(r2.getName());
        }
    }


}
