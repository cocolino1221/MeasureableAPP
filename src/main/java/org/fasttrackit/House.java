package org.fasttrackit;

public class House extends Construction{
    private int nrOfBedrooms ;
    private boolean withlevel;
    private String color;


    public House(int nrOfBedrooms, boolean withlevel, String color , int area , int height) {
        super(area, height);
        this.nrOfBedrooms = nrOfBedrooms;
        this.withlevel = withlevel;
        this.color = color;
    }

    public int getNrOfBedrooms() {
        return nrOfBedrooms;
    }

    public boolean isWithlevel() {
        return withlevel;
    }

    public String getColor() {
        return color;
    }
}
