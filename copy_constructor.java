public class copy_constructor {
    public static void main(String[] args) {
        person yash = new person(23, "yash shinde");
        yash.show();
        person ram = new person(yash);
        ram.show();
    }
}

class person{
    int age;
    String name;
    person(int a, String b){
        age = a;
        name = b;
    }
    person(person r){
        age = r.age;
        name = r.name;
    }

    void show(){
        System.out.println("my name is "+name+" my age is "+age);
    }
}