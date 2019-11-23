package acme.travel.model;

import java.util.Date;

public class HotelReserve implements Reservable {

	private static final long serialVersionUID = 2842781706354709752L;
	private String name;
	private String customer;
	private ServiceType type;
	private ServiceStatus status;
	private Date initialDay;
	private Date endDay;
	private Float price;

	public HotelReserve() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public ServiceType getType() {
		return type;
	}

	public void setType(ServiceType type) {
		this.type = type;
	}

	public ServiceStatus getStatus() {
		return status;
	}

	public void setStatus(ServiceStatus status) {
		this.status = status;
	}

	public Date getInitialDay() {
		return initialDay;
	}

	public void setInitialDay(Date initialDay) {
		this.initialDay = initialDay;
	}

	public Date getEndDay() {
		return endDay;
	}

	public void setEndDay(Date endDay) {
		this.endDay = endDay;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "HotelReserve [customer=" + customer + ", name=" + name + ", status=" + status + ", type=" + type
				+ ", initialDay=" + initialDay + ", endDay=" + endDay + ", price=" + price + "]";
	}


}
