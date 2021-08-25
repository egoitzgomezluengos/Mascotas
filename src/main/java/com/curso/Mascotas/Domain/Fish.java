package com.curso.Mascotas.Domain;

public class Fish extends Animal implements Pet{
	
	private String name;

	public Fish() {
		super(0);
		// TODO Auto-generated constructor stub
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
		System.out.println("el pez nada en forma de juego");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("el pezcome el pan que ha tirado el abuelo");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Obviamente el pez no camina");
	}

}
