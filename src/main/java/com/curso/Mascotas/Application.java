package com.curso.Mascotas;

import com.curso.Mascotas.Domain.Animal;
import com.curso.Mascotas.Domain.Cat;
import com.curso.Mascotas.Domain.Fish;
import com.curso.Mascotas.Domain.Pet;
import com.curso.Mascotas.Domain.Spider;

public class Application
{
	public static void main( String[] args )
	{
		
		Fish f = new Fish();
		Cat c = new Cat("Tom");
		Animal a = new Fish();
		Animal e = new Spider();
		Pet p = new Cat();
		
		f.play();
		c.play();
		
		e.eat();
		e.walk();
		
		a.walk();
		
		System.out.println("el nombre del gato de mi amigo es " +p.getName());
	}
}