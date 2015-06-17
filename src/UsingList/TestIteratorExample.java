package UsingList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIteratorExample {
	public static void main(String [] args){
		List d = new ArrayList();
		Car Car =new Car("BWM");
		d.add(Car);
		d.add(new Car("Ferrari"));
		d.add(new Car("Porsche"));
		
		Iterator<Car> i3 = d.iterator();
		
		while(i3.hasNext()){
			Car d2 = i3.next();
			System.out.println(d2.name);
		}
		
		System.out.println("size:  "+ d.size());
		System.out.println("get1:  "+ d.get(1).name);
		System.out.println("BMW  "+ d.indexOf(Car));
		d.remove(2);
		Object[] object =d.toArray();
		for(Object o: obj){
			Car d2 = (Car)o;
		}
		System.out.println("obj  "+ d2.name);
	}
}	
