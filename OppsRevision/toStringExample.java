class Laptop{
    String model ;
    int price;

    public String toString(){
        return model + " Price "+ price;
    }
    public boolean equals(Laptop that){
        if (this.model.equals(that.model)&& this.price == that.price) {
            return true;
        }
        return false;
    }
}
public class toStringExample {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "iPhone 13";
        obj.price = 40000;    
        System.out.println(obj);  //obj and obj2 are compared by hexadecimal value thats why it is false;
        // System.out.println(obj.toString()); // default 
        // equlas , toString both are comming from object class ;
        
        Laptop obj2 = new Laptop();
        obj2.model = "iPhone 13";
        obj2.price = 40000;    

        boolean result = obj.equals(obj2);
        System.out.println(obj2);
        System.out.println(result);
    }
}
