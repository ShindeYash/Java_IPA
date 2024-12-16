// Parent class (Abstract)
abstract class Animal {
    // Abstract method (no implementation)
    abstract void speak();
}

// Child class (Dog)
class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog says: Woof Woof");
    }
}

// Child class (Cat)
class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Cat says: Meow Meow");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Animal myDog = new Dog();  // Upcasting: Dog treated as Animal
        Animal myCat = new Cat();  // Upcasting: Cat treated as Animal

        // Demonstrating polymorphism
        myDog.speak();  // Output: Dog says: Woof Woof
        myCat.speak();  // Output: Cat says: Meow Meow
    }
}
