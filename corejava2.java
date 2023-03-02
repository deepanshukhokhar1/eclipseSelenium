package introduction;

import java.util.ArrayList;

public class corejava2 {

	public static void main(String[] args) {
		// if else statement

		int[] arr1 = {1,3,5,6,7,5,54,3,4,65};
		
		// get the values from this array which are multiple of 2.
		// we use break; statement when we have to check only if an array has an multiple of 2.
		
		for(int i = 0; i<arr1.length ; i ++) {
			if(arr1[i] % 2 == 0)
			{
				System.out.println(arr1[i]);
			//	break;                                             // break; is a keyword which will simply break the for loop once after its if condition got true then it breaks the loop in here whent reaches 6
			}
			else                                           // else is not mandatory but if write else then one of the condition will execute.  
			{
				System.out.println(arr1[i] + "these are not divisible of 2");
			}
		}
		
		ArrayList<String> a = new ArrayList<String>();                    // we ArrayList so we can dynamically change the values with .add() method.
		a.add("deepanhu");                            
		a.add("good");                                                     //if you want to access the methods present in the class then you have to create object of the class.
		                                                                   //create object of the class = object.method           
		a.add("boy");
		a.add("selenium");
		System.out.println(a.get(3));
		
		// simple for loop syntax
		
		for(int i = 0; i<a.size();i++)                                // in ArrayList method we use i<a.size() NOT i<a.length.
		{
			System.out.println(a.get(i));
		}
		
		// enhanced for loop syntax is this
		
		for(String s :a) 
		{
			System.out.println(s);
		}
		
		// to check any item is present in the array we use .contains method
		System.out.println(a.contains("selenium"));
		
		
		
	}

}
