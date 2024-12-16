import java.nio.channels.ScatteringByteChannel;

public class Exception_Handling {
    static int a = 10;
    static int b = 0;

    public static void main(String[] args) {
        try{
            int c = a/b;
            System.out.println("Final output is "+c);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Main method ends here");
    }


}
