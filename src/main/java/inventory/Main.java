package inventory;

public class Main {
    public static void main(String[] args) {
    Product product = new Product();
    product.productId = 1001;
    product.productName = "Laptop";
    product.price = 1200.0 ;

    Inventory inventory = new Inventory();
    inventory.product = product ;
    inventory.quantity = 5;

    Warehouse warehouse = new Warehouse();
    warehouse.warehouseID = 1;
    warehouse.warehouseName = "Main Warehouse";
    warehouse.inventories = "place holder"; // placeholder for now , later we will create an Arraylist of Inventory objects

    System.out.println("Product ID: " + inventory.product.productId + ", Name: " + inventory.product.productName + ", price: " + inventory.product.price);
    System.out.println("Inventory Quantity: " + inventory.quantity);
    System.out.println("Warehouse ID: " + warehouse.warehouseID + ", Name: " + warehouse.warehouseName);
    }
}
