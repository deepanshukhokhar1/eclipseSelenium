package introduction;

public class corejava3 {

	public static void main(String[] args) {
		
		// string is an object that represent sequence of characters
		
		// string literal
	//	String s1 = "deepanshu khokhar selenium";
		String s2 = "deepanshu khokhar selenium";  // so in string literal what will happen is if the string is same then it will not create a new object
		                                             // here s2 will be referd  to the s1 without creating any memory space in backend.

		// string new
		String s3 = new String("deepanshu");      
		String s4 = new String("deepanshu");         // in string new the new object will be created it doesn't matter if the string is same 

		// how to break the string after every space = by using .split method
		String s = "deepanshu khokhar selenium";
		s.split(" ");                         // here we put space(" ")between the quotes and s.split function will split the string // the space between (" ") is called delimiter
		String[] splittedString = s.split(" ");      // now we have to convert this string[] into array as spliteedstring to be run as array cause it is splitted  
         System.out.println(splittedString[0]);      // now we can print the string by providing the index
      
         for(int i = 0; i<splittedString.length; i++) // we can also run it by using for loop to print all the strings
         {
        	 System.out.println(splittedString[i]);
         }
         
         // to make the string reverse 
         for(int i = s.length()-1; i>=0;i--)        // we have to put the s.length at int i = s.length-1 and decrimetion to i-- as we want to reverse. 
         {
        	 System.out.println(s.charAt(i));
         }
	}

}

// .trim() is a method we can use to clear the blank space before that is before or after any string.
