package info;
class Prajwal
{
	int price;
	String brand;
	static String name;

	public void show()
	{
		System.out.println(brand+ " "+price+" "+name );
	}
	public static void show1(Prajwal m)
	{
		System.out.println(m.brand+ " "+m.price+" "+name );
	}
}
public class Three7 {
	public static void main(String[] args) {
		Prajwal m1=new Prajwal();
		m1.brand="Realme";
		m1.price=12000;
		Prajwal.name="Smart phone";

		Prajwal m2=new Prajwal();
		m2.brand="apple";
		m2.price=18000;
		Prajwal.name="Smart phone";
		Prajwal.name="phone";
		m1.show();
		m2.show();
		Prajwal.show1(m1);
	}

}
