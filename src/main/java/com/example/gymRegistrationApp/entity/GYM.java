package com.example.gymRegistrationApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="gym")
public class GYM {
	@Id
	@GeneratedValue
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private Integer weight;
	private Double height;
	private Double bmi;
	private String bmiResult;
	private String gender;
	private String requireTrainer;
	private String packageTime;
	private String haveGymBefore;
	private String date;

	private String important;
	
	public GYM(Integer id, String firstName, String lastName, String email, Integer weight, Double height, Double bmi,
			String bmiResult, String gender, String requireTrainer, String packageTime, String haveGymBefore,
			String date,String important) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.weight = weight;
		this.height = height;
		this.bmi = bmi;
		this.bmiResult = bmiResult;
		this.gender = gender;
		this.requireTrainer = requireTrainer;
		this.packageTime = packageTime;
		this.haveGymBefore = haveGymBefore;
		this.date = date;
		this.important=important;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getBmi() {
		return bmi;
	}
	public void setBmi(Double bmi) {
		this.bmi = bmi;
	}
	public String getBmiResult() {
		return bmiResult;
	}
	public void setBmiResult(String bmiResult) {
		this.bmiResult = bmiResult;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRequireTrainer() {
		return requireTrainer;
	}
	public void setRequireTrainer(String requireTrainer) {
		this.requireTrainer = requireTrainer;
	}
	public String getPackageTime() {
		return packageTime;
	}
	public void setPackageTime(String packageTime) {
		this.packageTime = packageTime;
	}
	public String getHaveGymBefore() {
		return haveGymBefore;
	}
	public void setHaveGymBefore(String haveGymBefore) {
		this.haveGymBefore = haveGymBefore;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getImportant() {
		return important;
	}

	public void setImportant(String important) {
		this.important = important;
	}

	@Override
	public String toString() {
		return "GYM [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", weight=" + weight + ", height=" + height + ", bmi=" + bmi + ", bmiResult=" + bmiResult
				+ ", gender=" + gender + ", requireTrainer=" + requireTrainer + ", packageTime=" + packageTime
				+ ", haveGymBefore=" + haveGymBefore + ", date=" + date + "]";
	}
	
}
