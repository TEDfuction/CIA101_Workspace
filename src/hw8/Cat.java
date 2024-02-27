package hw8;

import java.io.Serializable;

public class Cat extends Animal implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -449361041178537239L;
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}

	
}
