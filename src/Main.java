import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        ArrayList<Product> products_list = new ArrayList<>();
        ArrayList<Cart> cart = new ArrayList<>();
        int op1;
        int op2;
        do {
            System.out.println("""
                     1. Inventory Management
                     2. Selling interface
                    Choose an option :\s""");
            op1 = sc.nextInt();
            switch (op1) {
                case 1:
                    do{
                        System.out.println("""
                         1. Enter a new book
                         2. Enter a new electronic
                         3. Enter a new cloth
                         4. Check inventory
                         5. Sell items
                        Choose an option :\s""");
                        op2 = sc.nextInt();
                        switch(op2){
                            case 1:
                                System.out.println("Name of book : ");
                                String name = sc.next();
                                System.out.println("Price : ");
                                Double price = sc.nextDouble();
                                System.out.println("Inventory count : ");
                                int number = sc.nextInt();
                                System.out.println("Author : ");
                                String author = sc.next();
                                System.out.println("Number of pages : ");
                                int pages_number = sc.nextInt();
                                Book book = new Book(name, price,
                                        number, pages_number, author);
                                products_list.add(book);
                                System.out.println("Book successfully added.");
                                break;
                            case 2:
                                System.out.println("Name of electronic :");
                                String elec_name = sc.next();
                                System.out.println("Price : ");
                                Double elec_price = sc.nextDouble();
                                System.out.println("Inventory count : ");
                                int count = sc.nextInt();
                                System.out.println("Category : ");
                                String category = sc.next();
                                Electronics electronic = new Electronics(elec_name, elec_price, count, category);
                                products_list.add(electronic);
                                System.out.println("Electronic successfully added.");
                                break;
                            case 3:
                                System.out.println("Name of cloth : ");
                                String cl_name = sc.next();
                                System.out.println("Price : ");
                                Double cl_price = sc.nextDouble();
                                System.out.println("Inventory count : ");
                                int cl_num = sc.nextInt();
                                System.out.println("Size : ");
                                String size = sc.next();
                                System.out.println("Color : ");
                                String color = sc.next();
                                Clothes cloth = new Clothes(cl_name, cl_price, cl_num, size, color);
                                products_list.add(cloth);
                                System.out.println("Cloth successfully added.");
                                break;
                            case 4:
                                System.out.println("Products list :\n");
                                for(Product product : products_list){
                                    product.DisplayDetails();
                                }
                                break;
                        }
                    } while(op2 > 0 && op2 < 5);
                case 2:
                    int op3;
                    int op4;
                    double total = 0;
                    cart.clear();
                    do {
                        System.out.println("""

                                1. Add a new product
                                2. Display total""");
                        op4 = sc.nextInt();
                        switch(op4){
                            case 1:
                                System.out.println("Products list :\n");
                                for(Product product : products_list){
                                    product.DisplayDetails();
                                }
                                System.out.println("Choose a product to sell : ");
                                op3 = sc.nextInt();
                                if(op3 > products_list.indexOf(products_list.getLast())){
                                    System.out.println("No such index found! Retry.");
                                }else {
                                    System.out.println("Quantity = ");
                                    int quantity = sc.nextInt();
                                    if (quantity > products_list.get(op3).getInv_count()){
                                        System.out.println("Not enough stock.");
                                    } else{
                                        products_list.get(op3).Update_Inv(quantity);
                                        double price = products_list.get(op3).Calculate_price(quantity);
                                        total = total + price;
                                        Cart item = new Cart(products_list.get(op3).getName(), price, quantity);
                                        cart.add(item);
                                    }
                                    break;
                                }
                                break;
                            case 2:
                                System.out.println("Cart list :");
                                for(Cart cart1 : cart) {
                                    cart1.cartDetails();
                                }
                                System.out.println("Total price = " + total);
                                break;
                            }
                    } while(op4 > 0 && op4 < 3);
            }
        } while (op1 > 0 && op1 < 3);
    }
}