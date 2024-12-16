public class Practice_type_casting {
    public static void main(String[] args) {
        byte b = 127;
        int a = 234;
        b = (byte)a;
        a = b;
        char c = (char)a;
        System.out.println(c);

        b++;
        b++;
        b++;

        System.out.println(b);

        float k = 2.3f;
        a = (int)k;
        System.out.println(a);
    }
}
