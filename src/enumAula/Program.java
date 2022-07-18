package enumAula;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String [] args) {
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		System.out.println(order);

		OrderStatus c1 = OrderStatus.DELIVERED;
		OrderStatus c2 = OrderStatus.valueOf("DELIVERED");

		System.out.println(c1);
		System.out.println(c2);



	}
}
