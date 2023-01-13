package it.develhope.overload;
import it.develhope.overload.entity.Shape;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape circle = new Shape("Cerchio", 10.6);
        Shape square = new Shape("Quadrato", 4, 6.8);
        Shape rectangle = new Shape("Rettangolo", 4,9,5);
        Shape triangle = new Shape("Triangolo", 3, 8,8,4);

        String shapeDetails = shape.getShapeDetails();
        String circleDetails = circle.getShapeDetails();
        String squareDetails = square.getShapeDetails();
        String rectangleDetails = rectangle.getShapeDetails();
        String triangleDetails = triangle.getShapeDetails();
        System.out.println("-----------------------Shapes details----------------------------");
        System.out.println(shapeDetails);
        System.out.println(circleDetails);
        System.out.println(squareDetails);
        System.out.println(rectangleDetails);
        System.out.println(triangleDetails);
    }
}
