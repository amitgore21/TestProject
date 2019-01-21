

import java.util.ArrayList;
import java.util.Collections;

public class Player implements Comparable{
	public Player(String name, int score) {
		super();
		this.name = name;
		Score = score;
	}

	String name;
	int Score;

@Override
	public String toString() {
		return "name=" + name + ", Score=" + Score;
	}

public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}

	@Override
	public int compareTo(Object o) {
		Player w=(Player)o;
		return this.name-w.name;
	}




	
}
class Example{
	public static void main(String[] args) {
		Player s1=new Player("amit", 99);
		Player s2=new Player("Anna", 92);
		Player s3=new Player("Amar", 93);
		Player s4=new Player("guddu", 94);
		ArrayList <Player>a=new ArrayList<Player>();
		
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
