package TestingPackage;

public class AnimalPlay {
	public static void main(String []args){
		Dog fido = new Dog();
		fido.setName("Fido");
		System.out.println(fido.getName());
		fido.digHole();
		fido.setWeight(50);
		System.out.println(fido.getWeight());
		
		Cat kitto = new Cat();
		kitto.setName("kitto");
		System.out.println(kitto.getName());
		
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		System.out.println("Doggy says: "+ doggy.getSound());
		System.out.println("Kitty says: "+ kitty.getSound());
		
		((Dog)doggy).digHole();
		
		Giraffe giraffe = new Giraffe();
		giraffe.setName("Frank");
		giraffe.setWeight(5000);
		giraffe.setSound("Honk Honk");
		System.out.println(giraffe.getName()+ " "+ giraffe.getWeight()+ " "+ giraffe.getSound());
		
		changeObjectName(fido);
		System.out.println("After changeObjectName method:  "+ fido.getName());
		
		int randNum = 10;
		fido.changeVar(randNum);
		System.out.println("Random Number after method call: "+ randNum);
		
		Animal[] animals = new Animal[2];
		animals[0] = doggy;
		animals[1] = kitty;
		System.out.println("Doggy says: "+ animals[0].getSound());
		System.out.println("Kitty says: "+ animals[1].getSound());
		
		
		
	}
	public static void changeObjectName(Dog fido){fido.setName("Marcus");}
	
}
