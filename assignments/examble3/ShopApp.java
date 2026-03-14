/*the problem here is like the previous problem the encapsulation princible was not 
applied and didnt check for valid input
also you repeated the same logic in multiple places */

class Customer {
    private double balance;
    private int itemsCount;
    public void SetBalance(double balance) {
        if(balance>=0)
        this.balance = balance;
        else 
        System.out.println("you cant have negative balance");
    }
    public double GetBalance() {
        return balance;
    }
    public void SetItemsCount(int itemsCount) {
        if(itemsCount>=0)
        this.itemsCount = itemsCount;
        else
        System.out.println("you cant have negative items count");
    }
    public int GetItemsCount() {
        return itemsCount;
    
    }
    public void AddToCart(Product product){
        if (product.isInStock()==true) {                       // check stock
            if (this.balance >= product.getPrice()) { // check balance
                this.itemsCount++;
                this.balance -= product.getPrice();
                System.out.println(product.getName()+" added to cart");
            } else {
                System.out.println("Not enough balance for  "+product.getName());
            }
        } else {
            System.out.println(product.getName()+" not in stock");
        }
        
    }
}

class Product {
    private String name;
    private double price;
    private boolean inStock;
    Product(String name){
        this.name=name;
    }
    public void SetPrice(double price){
        this.price=price;
    }
    public void SetInStock(boolean inStock){
        this.inStock=inStock;
    }
    public double getPrice() {
        return price;
    }
    public String getName(){
        return this.name;
    }
    public boolean isInStock() {
        return inStock;
    }
    
    
}

public class ShopApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.SetBalance(1800);
        customer.SetItemsCount(0);

        Product phone = new Product("phone");
        phone.SetPrice(150);
        phone.SetInStock(true);

        Product book = new Product("book");
        book.SetPrice(30);
        book.SetInStock(false);

        customer.AddToCart(book);
        customer.AddToCart(phone);
            
    }
}