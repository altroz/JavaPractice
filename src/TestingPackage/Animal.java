package TestingPackage;

public class Animal {
	private String name;
	private double height;
	private int weight;
	private String sound;
	
	//Getter and Setter Methods @ NAME
	public void setName(String newName){name = newName;}
	public String getName(){return name;}
	
	//Getter and Setter Method @WEIGHT
	public void setWeight(int newWeight){weight = newWeight;}
	public int getWeight(){return weight;}
	
	//Getter and Setter Method @Height
	public void setHeight(double newHeight){height = newHeight;}
	public double getHeight(){return height;}
	
	//Getter and Setter Method @SOUND
	public void setSound(String newSound){sound = newSound;}
	public String getSound(){return sound;}
}
