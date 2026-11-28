// This code is By Using Class, object, Instance Variable , Instance Method

// 1. Class (Blueprint)
class Car {

    // 2. Instance Variable (Data)
    String color;

    // 3. Instance Method (Action)
    void drive() {
        System.out.println("The " + color + " car is driving!");
    }
}
public class Sample {
    public static void main(String[] args) {

        // 4. Object (Real car created from blueprint)
        Car myCar = new Car();

        // Giving data to the object
        myCar.color = "Red";

        // Calling the action
        myCar.drive(); // Output: The Red car is driving!
    }
}
