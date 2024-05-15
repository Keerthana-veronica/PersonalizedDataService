package dev.keerthana.personalizedDataService.shopperDetail;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import dev.keerthana.personalizedDataService.productDetail.ProductDetail;
import dev.keerthana.personalizedDataService.productDetail.ProductDetailService;

@Service
public class ShopperDetailService {

    private final ProductDetailService productDetailService = new ProductDetailService(null);

    @PostMapping
    public List<ProductDetail> getProductbyShopperId(@RequestBody ShopperDetail shopperDetail) { 
		List<ProductDetail> product = productDetailService.getProductbyShopperId(shopperDetail);
		return product;
	}
}
