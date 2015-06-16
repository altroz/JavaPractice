package TestingPackage;

public class Dog extends Animal{
	public Dog(){
		super();
		setSound("Bark");
	}
	public void digHole(){
		System.out.println("Hole has been Dug.");
	}
	public void changeVar(int randNum){
		randNum =12;
	System.out.println("randNum in Method: "+ randNum);}
}
