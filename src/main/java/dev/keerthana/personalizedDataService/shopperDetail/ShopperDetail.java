package dev.keerthana.personalizedDataService.shopperDetail;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

public class ShopperDetail {
    @Id
    @SequenceGenerator(
        name = "shopperdetail_sequence",
        sequenceName = "shopperdetail_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "shopperdetail_sequence"
    )
    private Long shopperId;
    private String category;
    private String brand;
    
    public ShopperDetail(Long shopperId,
                        String category,
                        String brand,
                        String productId) {
         this.shopperId = shopperId;
         this.category = category;
         this.brand = brand;
    }

    public ShopperDetail () {

    }

    public Long getshopperId() {
        return shopperId;
    }

    public void setShopperId(Long shopperId) {
        this.shopperId = shopperId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product Details { " +
               "ShopperId=" + shopperId + '\''+
               "category=" + category + '\''+
               "brand=" + brand + '\'' +
               "}";
    }
    
}
