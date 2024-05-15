package dev.keerthana.personalizedDataService.productDetail;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.keerthana.personalizedDataService.shopperDetail.ShopperDetail;

@Service
public class ProductDetailService {

	private final ProductDetailRepository productDetailRepository;

	@Autowired
	public ProductDetailService(ProductDetailRepository productDetailRepository) {
		this.productDetailRepository = productDetailRepository;
	}

    public List<ProductDetail> getProductDetail() {
		return productDetailRepository.findAll();
	}

	public void addNewProductDetail(ProductDetail productDetail){
        System.out.print("keer :: "+productDetail);
		productDetailRepository.save(productDetail);

	}

	public List<ProductDetail> getProductbyShopperId(ShopperDetail shopperDetail) {
		List<ProductDetail> product = productDetailRepository.findProductbyShopperId(shopperDetail.getshopperId(), shopperDetail.getCategory(), shopperDetail.getBrand());
		return product;
	}
}
