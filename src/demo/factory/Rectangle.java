package demo.factory;

public class Rectangle implements Shape{
    @Override
    // The `draw()` method in the `Rectangle` class is implementing the `draw()` method from the
    // `Shape` interface. It is responsible for defining how a rectangle should be drawn. In this case,
    // it simply prints a message to the console indicating that the draw method for a rectangle is
    // being called.
    public void draw() {
        // The line `System.out.println("Inside Rectangle::draw() method");` is printing a message to
        // the console. This message indicates that the `draw()` method for a rectangle is being
        // called.
        System.out.println("Inside Rectangle::draw() method");
    }
}
