package dev.keerthana.personalizedDataService.shopperDetail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.keerthana.personalizedDataService.productDetail.ProductDetail;

@RestController
@RequestMapping(path = "api/v1/getProductsByShopperId")
public class ShopperDetailController {
    
    private final ShopperDetailService shopperDetailService;
 
    @Autowired
	public ShopperDetailController(ShopperDetailService shopperDetailService){
		this.shopperDetailService = shopperDetailService;
	}

    @PostMapping
	public List<ProductDetail> getProductByShopperId(@RequestBody ShopperDetail shopperDetail) {
		return shopperDetailService.getProductbyShopperId(shopperDetail);
	}
}
