package model;

import java.io.Serializable;

//Serializable : để chuyển đổi object sang nhị phân
public class Product implements Serializable {
    private int id;
    private String productName;
    private String brand;
    private float price;
    private String description;

    public Product() {
    }

    public Product(int id, String productName, String brand, float price) {
        this.id = id;
        this.productName = productName;
        this.brand = brand;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
