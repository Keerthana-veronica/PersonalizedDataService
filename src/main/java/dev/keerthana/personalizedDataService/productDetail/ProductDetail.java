package dev.keerthana.personalizedDataService.productDetail;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class ProductDetail {
    @Id
    @SequenceGenerator(
        name = "productdetail_sequence",
        sequenceName = "productdetail_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "productdetail_sequence"
    )
    private Long shopperId;
    private String category;
    private String brand;
    private String productId;
    
    public ProductDetail(Long shopperId,
                        String category,
                        String brand,
                        String productId) {
         this.shopperId = shopperId;
         this.category = category;
         this.brand = brand;
         this.productId = productId;
    }

    public ProductDetail () {

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

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Product Details { " +
               "ShopperId=" + shopperId + '\''+
               "category=" + category + '\''+
               "brand=" + brand + '\'' +
               "productId=" + productId + '\'' +
               "}";
    }
}
