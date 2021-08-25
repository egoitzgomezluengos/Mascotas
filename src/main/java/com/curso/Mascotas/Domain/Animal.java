package com.curso.Mascotas.Domain;

public abstract class Animal {
	
	//variables
	protected int legs;

	//constructor
	protected Animal(int legs) {
		super();
		this.legs = legs;
	}
	
	
	//otros metodos
	
	public  void walk() {
		System.out.println("El animal anda sobre " + legs + " patas");
	};
	public abstract void eat();

}
