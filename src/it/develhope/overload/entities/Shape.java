package it.develhope.overload.entities;

public class Shape {
    public String shapeName;
    public int numberOfEdges;

    public Shape(){
        System.out.println("Shape object created");
        String undefinedShape = this.shapeName;
    }

    /**
     * Overload shape constructor 1 (Circle)
     * @param circleName name of the shape
     * @param radius radius of the circle
     */
    public Shape(String circleName, double radius){
        System.out.println("Circle object created");
        this.shapeName = circleName;
    }

    /**
     * Overload shape constructor 2 (Square)
     * @param edges edges of the square
     * @param edgeLength the square edge lenght
     */
    public Shape(String squareName,int edges, double edgeLength){
        System.out.println("Square object created");
        this.shapeName = squareName;
        this.numberOfEdges = edges;
    }


}
