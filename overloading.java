package info;

public class Calculator1 {
	public int add(int n1,int n2,int n3)
	{
		return n1+n2+n3;
	}
	public int add(int n1,int n2)
	{
		return n1+n2;
	}
	public double add(double n1,int n2)
	{
		return n1+n2;
	}
}


package info;

public class Drivercal1 {
	public static void main(String[] args) {
		Calculator1 m=new Calculator1();
		int r1=m.add(10, 20, 10);
		System.out.println(r1);
		int r2=m.add(10, 00);
		System.out.println(r2);
		double r3=m.add(14.65, 10);
		System.out.println(r3);
	}
}
