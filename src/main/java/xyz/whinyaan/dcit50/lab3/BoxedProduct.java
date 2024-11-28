package xyz.whinyaan.dcit50.lab3;

public class BoxedProduct {
    public String brand;
    public int quantity;

    public BoxedProduct(String brand, int quantity) {
        this.brand = brand;
        this.quantity = quantity;
    }
    
    public String getBrand() {
        return brand;
    }

    public int getQuantity() {
        return quantity;
    }
}
