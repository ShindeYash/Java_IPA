import java.lang.reflect.Method;

public class MethodPrinter {

    public static void printAccessibleMethods(Class<?> clazz) {
        Method[] methods = clazz.getMethods();  // Get all public methods (inherited ones too)

        System.out.println("Methods of class: " + clazz.getName());
        for (Method method : methods) {
            // Simplified output: method signature (return type, name, parameters)
            System.out.println(method);
        }
    }

    public static void main(String[] args) {
        // Example usage: Print all methods of the String class
        printAccessibleMethods(String.class);
    }
}
