package dev.keerthana.personalizedDataService.productDetail;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDetailRepository 
           extends JpaRepository<ProductDetail, Long>{
            
            @Query("SELECT s FROM ProductDetail s WHERE s.shopperId = ?1 " )
            List<ProductDetail>  findProductbyShopperId(Long shopperId, String category, String brand);
}
