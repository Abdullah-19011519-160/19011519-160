package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import entity.ProductRefund;
import service.ProductRefundService;

public class ProductRefundController {
	@Autowired
	private ProductRefundService service;
@PostMapping("/addProductRefund")
public ProductRefund getProductRefund(@RequestBody ProductRefund ProductRefund) {
	return service.saveProductRefund(ProductRefund);
}
@PostMapping("/addProductRefunds")
public List<ProductRefund> getProductRefunds(@RequestBody List<ProductRefund> ProductRefunds) {
	return service.saveProductRefunds(ProductRefunds);
}
@GetMapping("/ProductRefunds")
public List<ProductRefund> findAllProductRefunds(){
	return service.getProductRefunds();
}
@GetMapping("/ProductRefunds/{id}")
public ProductRefund findProductRefundById(@PathVariable int id){
	return service.getProductRefundById(id);
}
@GetMapping("/ProductRefunds/{name}")
public ProductRefund findProductRefundByName(@PathVariable String name){
	return service.getProductRefundByName(name);
}
@PutMapping("/update")
public ProductRefund updateProductRefund(@RequestBody ProductRefund ProductRefund) {
return service.updateProductRefund(ProductRefund);
}
@DeleteMapping("/delete/{id}")
public String deleteProductRefund(@PathVariable int id) {
return service.deleteProductRefund(id);
}
}
