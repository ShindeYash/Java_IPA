import org.w3c.dom.ls.LSOutput;

class a{
    int flag = 10;
}
class b extends a{
    int flag = 20;
    int temp = super.flag;
}

public class super_keyward {

    public static void main(String[] args) {
        b access = new b();
        System.out.println(access.flag);
        System.out.println(access.temp);
    }
}
