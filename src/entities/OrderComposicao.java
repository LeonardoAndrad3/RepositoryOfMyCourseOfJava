package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class OrderComposicao {

	private Date moment = new Date();
	private OrderStatus status;
	private Client client;

	List<OrderItem> list = new ArrayList<>();

	public OrderComposicao() {
	}

	public OrderComposicao(Client client, OrderStatus status) {
		this.status = status;
		this.client = client;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getList() {
		return list;
	}

	public void addItem(OrderItem item) {
		list.add(item);
	}
	public void removeItem(OrderItem item) {
		list.remove(item);
	}

	@Override
	public String toString() {
		return "OrderComposicao [moment=" + moment + ", status=" + status + ", client=" + client + ", list=" + list
				+ "]";
	}
}
