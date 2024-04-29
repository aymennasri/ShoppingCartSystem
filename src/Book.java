public class Book extends Product {
    String Author;
    int Page_number;
    public Book(String name, Double base_price,
                int inv_count, int page_number, String author) {
        super(name, base_price, inv_count);
        Page_number = page_number;
        Author = author;
    }

    public int getPage_number() {
        return Page_number;
    }

    public String getAuthor() {
        return Author;
    }

    public Double Calculate_price(int Quantity) {
        return Quantity * getBase_price() - Math.round((Quantity / 3) * getBase_price());
    }
    public void DisplayDetails(){
        System.out.println("Name : " + getName());
        System.out.println("Author : " + getAuthor());
        System.out.println("Number of pages = " + getPage_number());
        System.out.println("Inventory Count = " + getInv_count());
        System.out.println("Base Price = " + getBase_price());
        System.out.println("-------------------------------------------------");
    }
}
