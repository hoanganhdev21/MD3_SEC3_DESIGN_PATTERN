package demo.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        // The code is demonstrating the use of the Factory Pattern.
        // The line `ShapeFactory shapeFactory = new ShapeFactory();` is creating an instance of the
        // `ShapeFactory` class. This instance will be used to create different shapes using the
        // factory pattern.
        ShapeFactory shapeFactory = new ShapeFactory();
        // The line `Shape shape = shapeFactory.getShape("CIRCLE");` is using the `shapeFactory`
        // instance to create a `Shape` object of type "CIRCLE". The `getShape` method in the
        // `ShapeFactory` class is responsible for creating and returning the appropriate shape object
        // based on the input parameter. In this case, it will create a `Circle` object and assign it
        // to the `shape` variable.
        Shape shape = shapeFactory.getShape("CIRCLE");
        // The line `shape.draw();` is calling the `draw()` method on the `shape` object. This method
        // is responsible for drawing the shape on the screen or performing any other action associated
        // with the shape. The specific implementation of the `draw()` method will depend on the type
        // of shape that was created.
        shape.draw();
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
    }
}
