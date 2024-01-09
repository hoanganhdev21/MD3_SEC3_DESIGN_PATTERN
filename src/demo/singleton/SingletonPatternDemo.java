package demo.singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        // Khởi tạo đối tượng
        // The line `SingleObject object = SingleObject.getInstance();` is creating an instance of the
        // `SingleObject` class using the `getInstance()` method. This method returns the single
        // instance of the `SingleObject` class, ensuring that only one instance of the class is
        // created throughout the program. The created instance is then assigned to the variable
        // `object`.
        SingleObject object = SingleObject.getInstance();
        // The line `object.showMessage();` is calling the `showMessage()` method on the `object`
        // instance of the `SingleObject` class. This method is responsible for displaying a message.
        object.showMessage(); // gọi showMessage
    }
}
