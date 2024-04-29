public class Clothes extends Product{
    String Size;
    String Color;

    public Clothes(String name, Double base_price,
                   int inv_count, String size, String color) {
        super(name, base_price, inv_count);
        Size = size;
        Color = color;
    }

    public String getSize() {
        return Size;
    }

    public String getColor() {
        return Color;
    }

    Double Calculate_price(int Quantity) {
        if(getColor().equals("black") || getColor().equals("white")){
            return Quantity * getBase_price() * 1.1;
        }
        return Quantity * getBase_price();
    }
    public void DisplayDetails(){
        System.out.println("Name : " + getName());
        System.out.println("Size : " + getSize());
        System.out.println("Color : " + getColor());
        System.out.println("Inventory Count = " + getInv_count());
        System.out.println("Base Price = " + getBase_price());
        System.out.println("-------------------------------------------------");
    }
}
