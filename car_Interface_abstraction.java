
interface bike{
    String name = "Plusor";  // Public + Static + Final
    int cc = 220;  // Public + Static + Final

    void owner();  // Public + Abstract
    void start(); // Public + Abstract
    void stop(); // Public + Abstract

    default void parent(){
        System.out.println("Bajaj is the parent of pulsor");
    }

    static void speed(){
        System.out.println("Speed range is 0 - 180 Km/hr");
    }
}
class user implements bike{
    @Override
    public void owner(){

    }
    public void start(){
        System.out.println("Bike is Started ");
    }
    public void stop(){
        System.out.println("Bike is Stopped");
    }
}

public class car_Interface_abstraction {
    public static void main(String[] args) {
        System.out.println("Yash");
        user yash = new user();
        yash.owner();
        yash.start();
        yash.stop();
        yash.parent();
        bike.speed();
    }}
