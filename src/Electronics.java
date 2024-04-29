public class Electronics extends Product{
    String Category;
    public Electronics(String name, Double base_price, int inv_count, String category) {
        super(name, base_price, inv_count);
        Category = category;
    }

    public String getCategory() {
        return Category;
    }

    public Double Calculate_price(int Quantity) {
        if(Quantity <= 5 && Quantity >= 3){
            return Quantity * getBase_price() * 0.95;
        }
        else if (Quantity >= 6){
            return Quantity * getBase_price() * 0.9;
        }
        return Quantity * getBase_price();
    }
    public void DisplayDetails(){
        System.out.println("Name : " + getName());
        System.out.println("Category : " + getCategory());
        System.out.println("Inventory Count = " + getInv_count());
        System.out.println("Base Price = " + getBase_price());
        System.out.println("-------------------------------------------------");
    }
}
