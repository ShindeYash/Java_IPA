public class strings {
    public static void main(String[] args) {
        String str = "YASH";
        System.out.println(str.length());
        System.out.println(str.toLowerCase());


        String str2 = new String("YASH");
        System.out.println(str2.length());
        System.out.println(str2.toLowerCase());

        if(str == str2){
            System.out.println("Yes they are equal");
        }
        else{
            System.out.println("not equals");
        }

        if(str.equals(str2)){
            System.out.println("Yes they are equal");
        }
        else{
            System.out.println("not equals");
        }


        String s = "ram";
        String s2 = "ram";
//        s = s.concat("ji ki jay");
        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(s2));
                s = s.concat("ji ki jay");
        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(s2));

    }
}
