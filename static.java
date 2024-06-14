package info;
class Prajwal
{
	int price;
	String brand;
	String name;

	public void show()
	{
		System.out.println(brand+ " "+price+" "+name );
	}
}
public class Three7 {
	public static void main(String[] args) {
		Prajwal m1=new Prajwal();
		m1.brand="Realme";
		m1.price=12000;
		m1.name="Smart phone";

		Prajwal m2=new Prajwal();
		m2.brand="apple";
		m2.price=18000;
		m2.name="Smart phone";
		m1.name="phone";
		m1.show();
		m2.show();

	}

}
