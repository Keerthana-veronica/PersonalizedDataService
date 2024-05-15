package dev.keerthana.personalizedDataService.productDetail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/productDetail")
public class ProductDetailController {

	private final ProductDetailService productDetailService;
 
    @Autowired
	public ProductDetailController(ProductDetailService productDetailService){
		this.productDetailService = productDetailService;
	}
    
    @GetMapping
	public List<ProductDetail> getProductDetail() {
		return productDetailService.getProductDetail();
	}

	@PostMapping
	public void registerNewProductDetail(@RequestBody ProductDetail productDetail){
        productDetailService.addNewProductDetail(productDetail);
	}
	
}
