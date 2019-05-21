package com.cg.hometutorservice.dto;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="traineeDB")
@Component
public class Trainee {
   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int T_id;
 	@Column(name="trainee_name")
	private String name;
	@OneToOne(cascade=CascadeType.ALL)
    private Address address;

public Trainee()
{
   
}

public Trainee(int t_id, String name, Address address) {
	super();
	T_id = t_id;
	this.name = name;
	this.address = address;
}

public int getT_id() {
	return T_id;
}

public void setT_id(int t_id) {
	T_id = t_id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}



}
