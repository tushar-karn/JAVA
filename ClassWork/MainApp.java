import java.util.Scanner;

interface Car {
    String getName();
    int getMaxSpeed();

    default void applyBreak() {
        System.out.println("Applying Brake on " + getName());
    }

    static Car getFastestCar(Car car1, Car car2) {
        if (car1.getMaxSpeed() >= car2.getMaxSpeed()) {
            return car1;
        }
        return car2;
    }
}

class BMW implements Car {
    private String name;
    private int maxSpeed;

    public void carData(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
}

class Audi implements Car {
    private String name;
    private int maxSpeed;

    public void carData(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
}

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car ref = new BMW();
        ((BMW) ref).carData("BMW X5", 250);
        System.out.println("Name of car is " + ref.getName());
        System.out.println("Maximum speed is " + ref.getMaxSpeed());

        ref = new Audi();
        ((Audi) ref).carData("Audi A6", 240);
        System.out.println("Name of car is " + ref.getName());
        System.out.println("Maximum speed is " + ref.getMaxSpeed());
    }
}
