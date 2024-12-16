public class class_object {
    public static void main(String[] args) {
        class person {
            int age;
            int legs;

            void eat(){
                System.out.println("I am eating");
                System.out.println("I have age of "+ age + " and legs "+legs);
            }

            person(int a, int b){
                age = a;
                legs = b;
            }
        }

        person yash = new person(30, 3);
        yash.eat();
        int age = yash.age;
        System.out.println(yash.age);
    }
}
