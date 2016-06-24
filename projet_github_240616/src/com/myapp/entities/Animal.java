package com.myapp.entities;

public abstract class Animal {
	protected Long idAnimal;
	protected int ageAnimal;
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(int ageAnimal) {
		super();
		this.ageAnimal = ageAnimal;
	}
	public Long getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(Long idAnimal) {
		this.idAnimal = idAnimal;
	}
	public int getAgeAnimal() {
		return ageAnimal;
	}
	public void setAgeAnimal(int ageAnimal) {
		this.ageAnimal = ageAnimal;
	}
	
	
	
	
}
