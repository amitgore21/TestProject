package test;
//actual problem is the drive(); method impemented from whos interface
interface racer{
	void drive();
}
interface riding{
	void drive();
}
public class Test implements racer,riding{
	public void drive()
	{
		System.out.println("hi my name is amit");
	}
	public static void main(String[] args) {
		Test c=new Test();
		c.drive();
	}

}
