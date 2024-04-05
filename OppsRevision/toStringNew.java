class SourceCode{
    String itemName;
    int price;
    public String toString(){
        return itemName +" price is "+ price;
    }
    public boolean equals(SourceCode obj2){
        if(this.itemName.equals(obj2.itemName) && this.price == obj2.price){
            return true;
        }
        return false;
    }
}
public class toStringNew {
    public static void main(String[] args) {
        SourceCode obj = new SourceCode();
        obj.itemName = "Material Wallpaper";
        obj.price = 20;
        System.out.println(obj);

        SourceCode obj2 = new SourceCode();
        obj2.itemName = "Material Wallpaper";
        obj2.price = 20;
        System.out.println(obj2);

        boolean result = obj.equals(obj2);
        System.out.println(result); // comparing obj and obj2 hexadecimal values thats why false ;

    }
}
