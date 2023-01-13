package it.develhope.overload.entity;

public class Shape {
    private String shapeName;
    private int numberOfEdges;

    public Shape(){
        System.out.println("Shape object created");
        String undefinedShape = this.shapeName;
    }

    /**
     * Overload Shape constructor 1 (Circle)
     * @param circleName name of the shape
     * @param radius radius of the circle
     */
    public Shape(String circleName, double radius){
        System.out.println("Circle object created");
        this.shapeName = circleName;
    }

    /**
     * Overload Shape constructor 2 (Square)
     * @param squareName The name of the shape
     * @param edges edges of the square
     * @param edgeLength the square edge length
     */
    public Shape(String squareName,int edges, double edgeLength){
        System.out.println("Square object created");
        this.shapeName = squareName;
        this.numberOfEdges = edges;
    }

    /**
     * Overload Shape constructor 3 (rectangle)
     * @param rectangleName The name of the shape
     * @param edges Edges of the rectangle
     * @param e1 First rectangle edge
     * @param e2 Second rectangle edge
     */
    public Shape(String rectangleName,int edges, double e1, double e2){
        System.out.println("Rectangle object created");
        this.shapeName = rectangleName;
        this.numberOfEdges = edges;
    }

    /**
     * Overload Shape constructor 4 (triangle)
     * @param triangleName The name of the shape
     * @param edges Edges of the triangle
     * @param e1 First triangle edge
     * @param e2 Second triangle edge
     * @param e3 Third triangle edge
     */
    public Shape(String triangleName,int edges, double e1, double e2, double e3){
        System.out.println("Triangle object created");
        this.shapeName = triangleName;
        this.numberOfEdges = edges;
    }

    public String getShapeDetails(){
        if(shapeName == null) return "Undefined shape";
        return shapeName + " - " + numberOfEdges;
    }


}
