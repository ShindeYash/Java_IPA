class private_constructor {
    int age;
    String name;
    private private_constructor(int a, String b){
        age = a;
        name = b;
    }

    public static void show(private_constructor a){
        System.out.println("Age is "+ a.age + " name is "+ a.name);
    }

    public static void main(String[] args) {
        private_constructor person = new private_constructor(23, "yash");
        person.show(person);
    }
}
