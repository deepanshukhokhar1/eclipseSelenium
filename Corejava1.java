package introduction;

public class Corejava1 {

	public static void main(String[] args) {
		// Arrays 
		
		int[] arr = new int[5];               // here variable (arr) is ready to hold 5 variables ; and the count starts with 0 so 0 to 4 ;
		arr [0] = 4;
		arr [1] = 5;                          // so we can store upto 5 (4) // but there is simple way to do that also.
		
		
		int[] arr1 = {1,3,5,6,7,5,54,3,4,65};             // this is the basic and easy syntax to store an array.
		System.out.println(arr1[2]);          // to access any item in this array we can call that by its index number. 
		
		
		// for loop
		
		for(int i = 0; i<arr1.length;i++ )     // here we have to declare int first , after that i< arr.length (which is 5 we can write five or whatever the length ),
			                                  // and then i++ is increment by 1 , and increment will be upto arr.length . this will start from 0 as the first iteration will be 0 i = 0;  
		{                                     // so the code in the brackets will repeat due to loop till 5 as i<arr.length. 
			System.out.println(arr1[i]);
		}

		// string 
		String[] name = {"deepanshu" , "khokhar" , "selenium"};
		for(int i = 0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		
	}

}
