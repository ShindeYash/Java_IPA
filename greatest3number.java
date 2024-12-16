public class greatest3number {
    public static void main(String[] args){
        int a = 20, b = 40, c = 293;

        int r = (a > b)?((a > c)?a:c):((b>c)?b:c);

        System.out.println(r);
    }
}
