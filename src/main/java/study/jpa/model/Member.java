package study.jpa.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Member {
	@Id
	@GeneratedValue
	@Column(name = "MEMBER_ID")
	private Long id;
	
	private String name;
	
	private String city;
	private String street;
	private String zipcode;
	
	@OneToMany(mappedBy = "member")
	private List<Order> orders = new ArrayList<Order>();
}
