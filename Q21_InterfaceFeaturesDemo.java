public class InterfaceDemo {
    public static void main(String[] args) {
        Interface1 obj = new MyClass();

        // Call abstract  (implemented by MyClass)
        obj.method1("Hello from method1");

        // Call default method (overridden in MyClass)
        obj.log("Testing log");

        // Call static method from interface
        boolean result1 = Interface1.isNull(null);
        boolean result2 = Interface1.isNull("");
        boolean result3 = Interface1.isNull("Hello");

        System.out.println("isNull(null) = " + result1);   // true
        System.out.println("isNull(\"\") = " + result2);    // true
        System.out.println("isNull(\"Hello\") = " + result3); // false
    }
}

