//Create a Vehicle class with a move() method. Create a Car subclass that extends Vehicle and adds a honk() method. Instantiate Car and call both methods.

class Vehicle{
    void move(){
        System.out.println("Vehicle is moving.");
    }
}   

class Car extends Vehicle{
    void honk(){
        System.out.println("Car is honking.");;
    }
}


public class InheritanceQ1{
    public static void main(String[] args){
        Car c = new Car();
        c.move();
        c.honk();
    }
}