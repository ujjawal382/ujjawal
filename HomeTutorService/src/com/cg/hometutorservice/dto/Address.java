package com.cg.hometutorservice.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table(name="addressDB")
@Component
public class Address {@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    public int A_id;  
    @Column(name="house_no")
	private int house_no;
    @Column(name="city")
	private String city;
    @Column(name="state")
	private String state;
    @Column(name="pincode")
	private int pin_code;
	public Address(){}
    public Address(int a_id, int house_no, String city, String state, int pin_code) {
		super();
		A_id = a_id;
		this.house_no = house_no;
		this.city = city;
		this.state = state;
		this.pin_code = pin_code;}
        public int getA_id() {
		return A_id;}
    public void setA_id(int a_id) {
		A_id = a_id;}
    public int getHouse_no() {
		return house_no;}
    public void setHouse_no(int house_no) {
		this.house_no = house_no;}
    public String getCity() {
		return city;}
    public void setCity(String city) {
		this.city = city;}
    public String getState() {
		return state;}
    public void setState(String state) {
		this.state = state;}
    public int getPin_code() {
		return pin_code;}
   public void setPin_code(int pin_code) {
		this.pin_code = pin_code;}}