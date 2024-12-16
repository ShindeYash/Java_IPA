public class datatypes {
    int a = 10;  //Instance Variable
    static int num = 12; // static Variable

    public static void main(String[] args){
        boolean flag = false; // Local Variable
        System.out.println(flag);
//        new_function();
        System.out.println(num);

    }

    static void new_function(){
        datatypes a = new datatypes();
        System.out.println(a.a);
    }
}
