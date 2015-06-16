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
	
	private void bePrivate(){
		System.out.println("In a private Method");
	}
	
	public void accessPrivate(){
		bePrivate();
	}
}
