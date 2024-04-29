public class Cart {
    String name;
    int quantity;
    double price;

    public Cart(String name, double price, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void cartDetails(){
        System.out.println("Name : " + getName());
        System.out.println("Quantity : " + getQuantity());
        System.out.println("Price = \n" + getPrice());
    }
}
