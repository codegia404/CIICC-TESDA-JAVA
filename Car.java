public class Car extends Vehicle {

    int numeberOfDoors;

    Car(String make, String model, int year, int numeberOfDoors){
        this.make = make;
        this.model = model;
        this.year = year;
        this.numeberOfDoors = numeberOfDoors;
    }

    public void displayDetails(){
        System.out.println("Car Details:");
        System.out.println("Make:" +make);
        System.out.println("Model:" +model);
        System.out.println("Year:" +year);
        System.out.println("Number of Doors:" +numeberOfDoors);

    }



}
