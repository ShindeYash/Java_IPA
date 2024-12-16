abstract class animal{
    int legs = 4;

    abstract void eat();
    abstract void speak();
}

class dog extends animal{

    @Override
    void eat(){
        System.out.println("Eats meat and  haddi");
    }
    void speak(){
        System.out.println("Bhauu Bhauuuuu");
    }
 }

 class cow extends animal{

     @Override
    void eat(){
        System.out.println("Eats Grass and Vegitables");
    }
    void speak(){
        System.out.println("Ooooo Ooooo");
    }
 }

public class animal_abstraction {
    static void go(){
    cow gaumata = new cow();
    dog tommy = new dog();

    gaumata.eat();
        gaumata.speak();

        tommy.eat();
        tommy.speak();}

    public static void main(String[] args) {
        go();
    }
}
