package com.swe645.springboot.rest.survey.springboot2restservicebasic.form;

import java.util.ArrayList;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Table(name="Form")
public class Form {
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	
	private String streetAddress;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String email;
	private String dateOfSurvey;
	private ArrayList<String> mostLiked;
	private String interest;
	private String recommend;
	
	public Form() {
		super();
	}

	public Form(Long id, String firstName, String lastName, String streetAddress,String city,String state,String zip,String phoneNumber,String email,String dateOfSurvey, ArrayList<String> mostLiked, String interest,String recommend) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.dateOfSurvey = dateOfSurvey;
		this.mostLiked = mostLiked;
		this.interest = interest;
		this.recommend = recommend;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getStreetAddress() {
		return streetAddress;
	}
	
	public void setstreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZip() {
		return zip;
	}
	
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getemail() {
		return email;
	}
	
	public void setemail(String email) {
		this.email = email;
	}
	
	public String getDateOfSurvey() {
		return dateOfSurvey;
	}
	
	public void setDateOfSurvey(String dateOfSurvey) {
		this.dateOfSurvey = dateOfSurvey;
	}
	
	public ArrayList<String> getMostLiked() {
		return mostLiked;
	}
	
	public void setMostLiked(ArrayList<String> mostLiked) {
		this.mostLiked = mostLiked;
	}
	
	public String getinterest() {
		return interest;
	}
	
	public void setInterest(String interest) {
		this.interest = interest;
	}
	
	public String getRecommend() {
		return recommend;
	}
	
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}
		
}