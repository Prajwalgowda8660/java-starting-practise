package info;

public class Calculator {
	public void Playmusic()
	{
		System.out.println("music playing...");
	}
	public String getMeAPen(int cost)
	{
		if(cost>=10)
		{
			return "pen";
		}
		else
		{
			return "nothong";
		}
	}
}



package info;

public class Driver2 {
	public static void main(String[] args) {
		Calculator m=new Calculator();
		m.Playmusic();
		String str=m.getMeAPen(10);
		System.out.println(str);
	}
}
