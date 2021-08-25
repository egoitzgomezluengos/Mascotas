package com.curso.Mascotas.Domain;

public class Cat extends Animal implements Pet{

	private String name;
	
	public Cat(String name) {
		super(4);
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	public Cat() {
		super(4);
		this.name = "gatete";
		// TODO Auto-generated constructor stub
	}



	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Al gato le gusta comer peces");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " le gusta jugar con el ovillo de lana");
	}

}
