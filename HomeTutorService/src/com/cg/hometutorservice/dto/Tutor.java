	package com.cg.hometutorservice.dto;
	import java.util.ArrayList;
	import java.util.List;

	import javax.persistence.CascadeType;
	import javax.persistence.Column;
	import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.OneToMany;
	import javax.persistence.Table;

import org.springframework.stereotype.Component;



	@Entity
	@Table(name="tutorDB")
	@Component
	public class Tutor {
		@Id
		private int id;
		@Column(name="tutName")
		private String name;
		
		@Column(name="tutAddress")
		private String address;
		
		@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
		@JoinColumn(name="Tutor_id")
		private List<Trainee> trainee=new ArrayList<Trainee>();
		public Tutor(){}
		public Tutor(int id, String name, String address, List<Trainee> trainee) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.trainee = trainee;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public List<Trainee> getTrainee() {
			return trainee;
		}
		public void setTrainee(List<Trainee> trainee) {
			this.trainee = trainee;
		}
		@Override
		public String toString() {
			return "Tutor [id=" + id + ", name=" + name + ", address=" + address + ", trainee=" + trainee + "]";
		}


		

	}

