package repositery;

import entity.ProductRefund;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRefundRepositery extends JpaRepository<ProductRefund,Integer> {
    ProductRefund findByName(String name);
}

