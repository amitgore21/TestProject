
import java.util.ArrayList;

import java.util.Collections;

public class Student implements Comparable {
	int roll;
	String name;
	int marks;

	public Student(int roll, String name, int marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "rollNumbers=" + roll + ", name=" + name + ", marks=" + marks ;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
public Student() {
	// TODO Auto-generated constructor stub
}

@Override
public int compareTo(Object o) {
	Student w=(Student)o;
	return this.marks-w.marks;

}
	
}
class Example{
	public static void main(String[] args) {
		Student s1=new Student(10,"amit", 99);
		Student s2=new Student(12, "Anna", 92);
		Student s3=new Student(13, "Amar", 93);
		Student s4=new Student(14, "guddu", 94);
		ArrayList <Student>a=new ArrayList<Student>();
		
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		Example a1=new Example();
		a1.viewArray(a);
		}
	public  void viewArray(ArrayList x)
	{
		Collections.sort(x);
		System.out.println(x);
	}
	
}
