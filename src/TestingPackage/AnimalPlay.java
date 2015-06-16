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
	}
}
