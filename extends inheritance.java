package info;

public class Animal {
	String name;
	int legs;
}


//
package info;

public class Dog  extends Animal{
	String breed;
}

//
package info;

public class Driver1 {
	public static void main(String[] args) {
		Dog d= new Dog();
		d.name="broo";
		d.legs=14;
		d.breed="nayii";
		System.out.println(d.name);
		System.out.println(d.legs);
		System.out.println(d.breed);
	}
}
