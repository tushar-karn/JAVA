
class Animal{
    String color = "GRAY";
}

class Cat extends Anim1{
    String color = "BROWN";
}
class Human extends Cat{

    String color = "SKIN";
    void display(){
        System.out.println(super.color);
    }
}


 class AnimailInheritance {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.display();
    }
}
