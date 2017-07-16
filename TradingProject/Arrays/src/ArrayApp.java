

import java.util.*;
import java.io.*;
import java.net.*;
//Data Structure: A way of organizing data in the memory.
//One of the most important data structures is arrays.
//Parameters: basic types are passed by values where as complex types(object) 
//are passed by reference.

public class ArrayApp {
	
	public static void main(String[] args)throws Exception {
		
	
		Vector<Bar> Bars = new Vector <Bar>(1000 ,100); 
				
		Bar b1 = new Bar("2017-03-15", 1150, 2100, 1410, 1500, 1510, 30000);
		
		Bars.add(b1);
		
		/*	*/
		//Scanner keyb = new Scanner(System.in);
	
		URL finance = new URL("http://chart.finance.yahoo.com/table.csv?s=GOOG&a=1&b=14&c=2016&d=3&e=14&f=2017&g=d&ignore=.csv");
		
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(finance.openStream()));
		
		reader.readLine();
	
		String row ;
		String[] line;
		
		while((row = reader.readLine())!= null){
			
				line = row.split(",");
		
			b1.setOpen(Float.parseFloat(line[1]));
				
				Bar bar1 = new Bar(row);
				Bars.add(bar1);
		
	    }
		
		reader.close();
		
		System.out.println(Bars.toString());
	
	}
	

}
