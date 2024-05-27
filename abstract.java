package info;

abstract class Calci {
	abstract void add();
	abstract void mul();
}


package info;

public class CalciImp extends Calci {
	void add()
	{
		System.out.println(10+20);
	}
	void mul()
	{
		System.out.println(10*20);
	}
}



package info;

public class CalciDriver {
	public static void main(String[] args) {
		Calci c= new CalciImp();
		c.add();
		c.mul();
	}
}
