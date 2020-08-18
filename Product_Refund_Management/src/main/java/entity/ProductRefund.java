package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "REFUND_PRODUCT")
public class ProductRefund {

    @Id
    @GeneratedValue
    private static int id;
    private static String name;
    private static int quantity;
    private static double price;
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		ProductRefund.id = id;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		ProductRefund.name = name;
	}
	public static int getQuantity() {
		return quantity;
	}
	public static void setQuantity(int quantity) {
		ProductRefund.quantity = quantity;
	}
	public static double getPrice() {
		return price;
	}
	public static void setPrice(double price) {
		ProductRefund.price = price;
	}
	
}

