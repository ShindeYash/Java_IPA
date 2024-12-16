import java.util.Scanner;

class college{
    private int id;
    private String name;
    private int contactno;
    private String address;
    private int pinCode;

    college(int a, String b, int c, String d, int e){
        this.id = a;
        this.name = b;
        this.contactno = c;
        this.address = d;
        this.pinCode = e;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getContact(){
        return contactno;
    }
    public String getAddress(){
        return address;
    }
    public int getPin(){
        return pinCode;
    }
}

public class IPA4_College {

    static college maxPin(college[] arr){
        int max = Integer.MIN_VALUE;
        college re = null;

        for(int i =0 ; i < arr.length; i++){
            if(arr[i].getPin() > max){
                max = arr[i].getPin();
                re = arr[i];
            }
        }

        return re;
    }

    static college addressCol(college[] arr, String a){
        college re = null;

        for(int i = 0; i < arr.length; i++){
            if(arr[i].getAddress().equalsIgnoreCase(a)){
                re = arr[i];
                return re;
            }
        }
        return re;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();
        college[] arr = new college[no];

        for(int i = 0; i < no; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            String d = sc.nextLine();
            int e = sc.nextInt();
            arr[i] = new college(a, b ,c, d, e);
        }

        sc.nextLine();
        String val1 = sc.nextLine();

        college re1 = maxPin(arr);
        college re2 = addressCol(arr, val1);

        if(re1 == null){
            System.out.println("Not found the such college");
        }
        else{
            System.out.println("id-"+re1.getId());
            System.out.println("name-"+re1.getName());
            System.out.println("contactNo-"+re1.getContact());
            System.out.println("address-"+re1.getAddress());
            System.out.println("pincode-"+re1.getPin());
        }

        if(re2 == null){
            System.out.println("Not fouond the such college");
        }
        else{
            System.out.println("id-"+re2.getId());
            System.out.println("name-"+re2.getName());
            System.out.println("contactNo-"+re2.getContact());
            System.out.println("address-"+re2.getAddress());
            System.out.println("pincode-"+re2.getPin());
        }


    }
}
