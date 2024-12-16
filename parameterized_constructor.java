public class parameterized_constructor
{
    int x, y;
    String z;
    parameterized_constructor(int a, int b){
        System.out.println(a + b);
    }

    parameterized_constructor(int a, String c){
        System.out.println(a + c);
    }

    public static void main(String[] args) {
        parameterized_constructor plus = new parameterized_constructor(20,  30);

        parameterized_constructor plus2 = new parameterized_constructor(20,  "yash");

    }
}
