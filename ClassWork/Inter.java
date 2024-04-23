import java.util.List;
import java.util.*;

class Animal{
    public void eat(){
        System.out.println("Animal is Eating ");
    }
}

class Dog extends Animal{
    public void eat() {
        System.out.println("Dog is Eating ");
    }
}

class Cat extends Animal{
    public void eat() {
        System.out.println("Cat is Eating ");
    }
}

class Rat{
    public void eat(){
        System.out.println("Rat is eating ");
    }
}

public class Inter{
    public static void feedAnimals(List<? extends Animal> animals) {
        for(Animal animal : animals){
            animal.eat();
        }
    }
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        List<Cat> cats = new ArrayList();
        cats.add(new Cat());
        
        List<Rat> rats  = new ArrayList();
        rats.add(new Rat());

        feedAnimals(dogs);

    }
}

