interface aa{
    void show();
}

interface bb{
    void show();
}

public class multiple_Inheritence_Interface implements aa,bb{
    public void show(){
        System.out.println("Show is done");
    }
    public static void main(String[] args) {
        multiple_Inheritence_Interface yash = new multiple_Inheritence_Interface();
        yash.show();
    }
}
