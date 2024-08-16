/**
 * Vehicle
 */
public class Vehicle {
protected String brand = "Mazda";
public void honk(){
    System.out.println("Pa paam pa ");
    }
}

class Car extends Vehicle {
    private String modelName = "Truck";

    public static void main(String args[]){

        Car obj=new Car();

        obj.honk();

        System.out.println(obj.brand+" "+obj.modelName);

        }
    }
