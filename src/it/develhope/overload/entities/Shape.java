package it.develhope.overload.entities;

public class Shape {
    public String shapeName;
    public String numberOfEdges;

    public Shape(){
        System.out.println("Shape object created");
        String undefinedShape = this.shapeName;
    }

    /**
     * Overload shape constructor 1
     * @param circleName name of the shape
     * @param radius radius of the circle
     */
    public Shape(String circleName, double radius){
        System.out.println("Circle object created");
        this.shapeName = circleName;
    }


}
