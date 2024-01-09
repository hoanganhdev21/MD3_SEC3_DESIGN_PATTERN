package demo.factory;

public class Circle implements Shape{
    @Override
    // The `draw()` method is an implementation of the `draw()` method defined in the `Shape`
    // interface. It is responsible for drawing a circle. In this specific implementation, it prints
    // the message "inside circle draw method" to the console.
    public void draw() {
        System.out.println("inside circle draw method");
    }
}
