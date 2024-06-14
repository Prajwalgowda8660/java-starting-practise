package info;

public class Three4 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("prajwal");
		sb.append(   " gowda" );
		sb.deleteCharAt(2);
		sb.insert(2, "a");
		System.out.println(sb);
	}

}
