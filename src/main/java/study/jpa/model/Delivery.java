package study.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Delivery {
	
	@Id
	@GeneratedValue
	@Column(name = "DELIVERY_ID")
	private Long id;
	
	@OneToOne(mappedBy = "delivery")
	private Order order;
	
	private String city;
	private String street;
	private String zipcode;
	
	@Enumerated(EnumType.STRING)
	private DeliveryStatus status;
	
}
