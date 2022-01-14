package Scripts;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;

public class Sample {

	//String[] arr = {"Test","Test1","Test2"};
	
	public static void main(String[] args) {

			
		
		// TODO Auto-generated method stub
		String s[]= {"amazon","Flipkart","Myntra","Noon"};
		List a = Arrays.asList(s);
		ArrayList<String> li = new ArrayList<String>(a);
		li.add("Tiger");	
		System.out.println("check the list"+li);
		li.clear();
		System.out.println("check the list"+li);
		
		ArrayList<String> x = new ArrayList<String>(10);
		x.add("Sandeep");
		x.add("Khandelwal");
		x.add("36");
		System.out.println("size of the list"+x.size());
		x.trimToSize();
		System.out.println("size of the list"+x.size());
		x.add("sandeep1");
		System.out.println("size of the list"+x);
		System.out.println("size of the list"+x.size());
		//System.out.println("check the list"+a);
		
		
		System.out.println("size of the list"+x.indexOf("sandeep1"));

		
		
		 
				//simple add below elements in the array list of string type
/*		
		
		li.add("Sandeep");
		li.add("Sandeep1");
		li.add("Sandeep2");
		li.add("Sandeep3");
		li.add("Sandeep4");
		

/*
throws an index out of bound error
	li.add(0, "Sandeep");
	li.add(2, "Sandeep2");
	li.add(4, "Sandeep1");
	li.add(1, "Sandeep3");
	li.add(3, "Sandeep4");
		

	
		

		int counter = 0;
		for (String x: li)
		{
			counter++;
			System.out.println("araylist:"+x);
		}

	
		
/*
li.remove(1);
int d = 0;
for (String y: li)
{
	d++;
	System.out.println("araylist1:"+y);
}


li.clear();

int f = 0;
for (String g: li)
{
	f++;
	System.out.println("araylist2:"+g);
}

*/
}

		
		
}
