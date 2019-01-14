package arrylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryList {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			a.add(i);
		}
		
			Iterator<Integer> s=a.iterator();
			while(s.hasNext())
			{
				int i=(Integer)s.next();
				if(i>3 && i<7)
				{
					s.remove();
				}
				System.out.print(i);
			}
			
	}

}
