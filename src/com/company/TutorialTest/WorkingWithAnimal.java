package com.company.TutorialTest;

public class WorkingWithAnimal {
	int justANum = 10;
	
	public static void main(String[]args){
		
		Dog fido = new Dog();
		fido.setName("Fido");
		System.out.println(fido.getName());
		
		fido.digHole();
		fido.setWeight(50);
		
		int randNum = 10;
		fido.changeVar(randNum);
		System.out.println("randNum after method call: "+ randNum);
		
		changeObjectName(fido);
		System.out.println("Dog name after method call: "+ fido.getName());
		
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		
		System.out.println("Doggy says:	"+ doggy.getSound());
		System.out.println("Kitty says:	"+ kitty.getSound());
		
		Animal [] animals = new Animal[4];
		animals[0] = doggy;
		animals[1] = kitty;
		
		System.out.println("Doggy says:	"+ animals[0].getSound());
		System.out.println("Kitty says:	"+ animals[1].getSound());
		
		speakAnimal(doggy);
		((Dog)doggy).digHole();
		
		//System.out.println(justANum); 
		//@ Cannot be used due to variable not being static. 
		
		//sayHell();
		//@ Cannot be used due to method not being static. 
		
		//fido.bePrivate();
		fido.accessPrivate();
		// Cannot use a private method or variable even if defined
		// under a subclass. 
		
	}
	
	public static void changeObjectName(Dog fido){
		fido.setName("Marcus");	
	}
	
	public static void speakAnimal(Animal randAnimal){
		System.out.println("Animal says:	"+ randAnimal.getSound());
	}
	
	public void sayHello(){
		System.out.println("Hello");
	}
}
