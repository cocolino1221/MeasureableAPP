package org.fasttrackit;

public class OOPinConstructions {
    public static void main(String[] args) {

        House threeBedroomsHouse = new House(3, false, "white",95,3);
        House twoBedroomsHouse = new House(2, true, "blue",75,5);
        int bedrooms = twoBedroomsHouse.getNrOfBedrooms();
        System.out.println(bedrooms);
        System.out.println(twoBedroomsHouse.isWithlevel());
        System.out.println(twoBedroomsHouse.getColor());
        System.out.println(twoBedroomsHouse.getArea());
        System.out.println(twoBedroomsHouse.getHeight());

        bedrooms = threeBedroomsHouse.getNrOfBedrooms();
        System.out.println(bedrooms);
        System.out.println(threeBedroomsHouse.isWithlevel());
        System.out.println(threeBedroomsHouse.getColor());
        System.out.println(threeBedroomsHouse.getArea());
        System.out.println(threeBedroomsHouse.getHeight());



    }
}
