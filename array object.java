package info;
class Student
{
	int roll;
	String name;
	int marks;
}
public class Array {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="prajwal";
		s1.roll=10;
		s1.marks=85;
		Student s2=new Student();
		s2.name="prathii";
		s2.roll=11;
		s2.marks=58;
		Student students[]=new Student[2];
		students[0]=s1;
		students[1]=s2;
		//students[2]=s3;
		for (int i=0;i<students.length;i++)
		{
			System.out.println(students[i].name +" : " +students[i].marks);
		}
	}
}
