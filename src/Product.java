public abstract class Product {
    String Name;
    Double Base_price;
    int Inv_count;
    public Product(String name, Double base_price, int inv_count) {
        Name = name;
        Base_price = base_price;
        Inv_count = inv_count;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getBase_price() {
        return Base_price;
    }

    public void setBase_price(Double base_price) {
        Base_price = base_price;
    }

    public int getInv_count() {
        return Inv_count;
    }

    public void setInv_count(int inv_count) {
        Inv_count = inv_count;
    }

    abstract void DisplayDetails();
    public boolean IsAvailable(String Name){
        return getName().equals(Name);
    }
    public void Update_Inv(int Quantity){
        setInv_count(getInv_count() - Quantity);
    }
    abstract Double Calculate_price(int Quantity);
}