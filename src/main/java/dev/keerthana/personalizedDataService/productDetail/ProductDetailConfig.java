package dev.keerthana.personalizedDataService.productDetail;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductDetailConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(
        ProductDetailRepository repository) {
          return args -> {
               ProductDetail babyProduct = new ProductDetail(1L, "baby", "kelly", "terte5456");
               ProductDetail kitchenProduct = new ProductDetail(2L, "kitchen", "Topperware", "fghd8678");

        repository.saveAll(
            List.of(babyProduct, kitchenProduct)
        );
      };
    }
}
