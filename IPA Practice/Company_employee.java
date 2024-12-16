import java.util.*;

class Employee2{
    private int id;
    private String name;
    private String designation;
    private double salary;

    Employee2(int a, String b, String c, double d){
        this.id = a;
        this.name = b;
        this.designation = c;
        this.salary = d;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDes(){
        return designation;
    }

    public double getSal(){
        return salary;
    }

}

class company{
    String comp_name;
    Employee2[] arr;
    int num_emp;

    company(String a, Employee2[] b, int c){
        this.comp_name =a;
        this.arr = b;
        this.num_emp = c;
    }

    double avg_sal(Employee2[] arr, int num_emp){
        double total = 0;
        for(int i =0 ; i < num_emp; i++){
            total += arr[i].getSal();
        }
        return total/num_emp;
    }

    double max_sal(Employee2[] arr, int num_emp){
        double max = Double.MIN_VALUE;
        for(int i = 0; i < num_emp; i++){
            if(max < arr[i].getSal()){
                max = arr[i].getSal();
            }
        }
        return max;
    }


    Employee2[] getEmpDes(String des){;
        ArrayList<Employee2> list = new ArrayList<>();
        for(int i =0 ; i < num_emp; i++){
            if(arr[i].getDes().equalsIgnoreCase(des)){
                list.add(arr[i]);
            }
        }
        Employee2[] emps = list.toArray(new Employee2[list.size()]);
        return emps;
    }

}


public class Company_employee {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String compnay_name = sc.nextLine();
        int no_emp = sc.nextInt(); sc.nextLine();

        Employee2[] arr = new Employee2[no_emp];

        for(int i =0 ; i < no_emp; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble(); sc.nextLine();

            arr[i] = new Employee2(a, b ,c, d);
        }
        company comp = new company(compnay_name, arr, no_emp);
        String desig = sc.nextLine();

        double avg = comp.avg_sal(arr, no_emp);
        double max = comp.max_sal(arr, no_emp);
        Employee2[] emp_arr = comp.getEmpDes(desig);

        System.out.println("Average Salary: "+avg);
        System.out.println("Max Salary: "+max);
        System.out.println("Employees with designation: "+desig);
        for (int i =0 ; i< emp_arr.length; i++){
            System.out.println("ID: "+emp_arr[i].getId()+", Name: "+emp_arr[i].getName()+
                    ", Designation: "+emp_arr[i].getDes()+" ,Salary: "+emp_arr[i].getSal());
        }
    }
}
