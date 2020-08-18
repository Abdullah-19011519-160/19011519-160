package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice1.Congrats1.entity.Product;

import entity.ProductRefund;
import repositery.ProductRefundRepositery;
@Service
public class ProductRefundService {
	@Autowired
    private ProductRefundRepositery repository;

    public ProductRefund saveProductRefund(ProductRefund productRefund) {
        return repository.save(productRefund);
    }

    public List<ProductRefund> saveProductRefunds(List<ProductRefund> productRefunds) {
        return repository.saveAll(productRefunds);
    }

    public List<ProductRefund> getProductRefunds() {
        return repository.findAll();
    }

    public ProductRefund getProductRefundById(int id) {
        return repository.findById(id).orElse(null);
    }

    public ProductRefund getProductRefundByName(String name) {
        return repository.findByName(name);
    }

    public String deleteProductRefund(int id) {
        repository.deleteById(id);
        return "ProductRefund removed !! " + id;
    }
    public ProductRefund updateProduct(ProductRefund productRefund) {
		ProductRefund existingProduct=repository.findById(productRefund.getId()).orElse(null);
		existingProduct.setName(productRefund.getName());
		existingProduct.setQuantity(productRefund.getQuantity());
		existingProduct.setPrice(productRefund.getPrice());
		return repository.save(existingProduct);
	}

}
