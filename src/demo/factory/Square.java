package demo.factory;

public class Square implements Shape{
    @Override
    // The `draw()` method is an implementation of the `draw()` method from the `Shape` interface. It
    // is responsible for defining how a `Square` object should be drawn. In this case, it simply
    // prints a message to the console indicating that the `draw()` method of the `Square` class has
    // been called.
    public void draw() {
        // The line `System.out.println("Inside Square::draw() method");` is printing a message to the
        // console. This message indicates that the `draw()` method of the `Square` class has been
        // called.
        System.out.println("Inside Square::draw() method");
    }
}
