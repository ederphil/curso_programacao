package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Pedido {
	private Date momento;
	private OrderStatus status;
	private List<PedidoItem> pedidoItem = new ArrayList<PedidoItem>();

	private Cliente cliente;
	private Double total;

	public Pedido(Date momento, OrderStatus status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Pedido() {
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<PedidoItem> getPedidoItem() {
		return pedidoItem;
	}

	public void addItem(PedidoItem pedidoItem) {
		this.pedidoItem.add(pedidoItem);
	}

	public void removeItem(PedidoItem pedidoItem) {
		this.pedidoItem.remove(pedidoItem);
	}

	public Double totalPedido() {
		total = 0.0;

		for (PedidoItem p : pedidoItem) {
			total += p.subTotalItem();
		}

		return total;

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sb.append("Dados do pedido: \n");
		sb.append("Data/Hora: " + sdf2.format(getMomento()) + "\n");
		sb.append("Status: " + getStatus() + "\n");
		sb.append("Cliente: " + getCliente().getNome() + " (" + sdf1.format(getCliente().getDataNascimento()) + ") - "
				+ getCliente().getEmail() + "\n");
		sb.append("\n");
		sb.append("Itens do pedido: \n");

		for (PedidoItem p : pedidoItem) {
			sb.append(p + "\n");
		}

		sb.append("Valor total: " + totalPedido());

		return sb.toString();
	}

}
