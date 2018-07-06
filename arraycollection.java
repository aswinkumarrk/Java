package list;

import java.util.ArrayList;
import java.util.Collections;

public class arraycollection {

	public static void main(String[] args) {
ArrayList<Integer>al=new ArrayList<Integer>();
al.add(9000);
al.add(888);
al.add(100);
al.add(209);
al.add(10);
System.out.println("element present at index 0 is");
System.out.println(al.get(0));
System.out.println("iteration from i");

for(int i=0;i<al.size();i++)
{
	System.out.println(al.get(i));
	
}
Collections.sort(al);
System.out.println("array list after sorting");

for(int i=0;i<al.size();i++)
{
	System.out.println(al.get(i));
	
}

	}
}