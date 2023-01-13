package it.develhope.overload.entities;

public class Shape {
    public String shapeName;
    public int numberOfEdges;

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
     * @param edgeLength the square edge lenght
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


}
