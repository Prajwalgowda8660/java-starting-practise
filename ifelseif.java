package info;

public class Bro {
	public static void main(String[] args) {
		int x=15;
		int y=10;
		int z=27;
		if(x>y&&x>z) {
			System.out.println(x);
		}
		else if (y>x&&y>z){
			System.out.println(y);
		}
		else {
			System.out.println(z);
		}
	}
}
