package info;

public class Drink {
	public static void main(String[] args) {
		System.out.println("hi");
		try {
			System.out.println(10/0);
			System.out.println("tried");
		}
		catch (ArithmeticException e)
		{
			System.out.println("catched");
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("bye");
	}
}
