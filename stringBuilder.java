public class stringBuilder {
    public static void main(String[] args) {
        String s = "Yashyash";

        StringBuilder newS = new StringBuilder(s);

        int a = newS.indexOf("as");
        newS.setCharAt(0, 'K');
        System.out.println(newS);
        s =newS.toString();
        System.out.println(s);
        System.out.println(s.indexOf("a"));
        char[] yash_chars = s.toCharArray();

    }
}
