package demo.singleton;

public class SingleObject {

    // Khai báo 1 biến
    // The line `private static final SingleObject instance = new SingleObject();` is declaring and
    // initializing a private static final variable named `instance` of type `SingleObject`.
    private static final SingleObject instance = new SingleObject();

    // The `private SingleObject()` constructor is declared to ensure that no other class can create an
    // instance of the `SingleObject` class. By making the constructor private, it can only be accessed
    // within the `SingleObject` class itself. This is a key aspect of the Singleton design pattern,
    // which aims to restrict the instantiation of a class to a single object.
    private SingleObject() {
        // Khai báo constructor -> để trùng với class
    }

    /**
     * The getInstance() function returns the instance of the SingleObject class.
     * 
     * @return The method is returning an instance of the SingleObject class.
     */
    public static SingleObject getInstance() {
        return instance;
    } // chả về chính instance đó trả ề một thể hiện cụ thể của lớp đấy

    // Test
    /**
     * The function showMessage() prints "Hello world!" to the console.
     */
    public void showMessage() {
        System.out.println("Hello word !");
    }
}

// singleton => mục đích tạo ra 1 instance duy nhất để ễ dàng kiểm soát