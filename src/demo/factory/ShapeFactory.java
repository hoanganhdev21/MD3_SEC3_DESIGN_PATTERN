package demo.factory;

public class ShapeFactory {
    /**
     * The function returns a shape object based on the given shape type.
     * 
     * @param shapeType The shapeType parameter is a String that represents the type of shape that we
     * want to create. It can be "CIRCLE", "SQUARE", or "RECTANGLE".
     * @return The method is returning an instance of the Shape interface. The specific shape that is
     * returned depends on the value of the shapeType parameter. If shapeType is "CIRCLE", a Circle
     * object is returned. If shapeType is "SQUARE", a Square object is returned. If shapeType is
     * "RECTANGLE", a Rectangle object is returned. If shapeType does not match any of these values,
     */
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}
