package introduction;

public class MethodsDemo {

	public static void main(String[] args) {
		// whenever we declare a method 
		MethodsDemo d = new MethodsDemo();       // here we declared d as an object 
		                                         //  whenever this method will get executed it will return string.
		String name = d.getData();                             // and that string we can capture in a variable. and the "deepanshu khokhar" will fall in this name variable.
         System.out.println(name);
	}
      // method will only be declared here and it will not run here it can only run on demand
	
	public String getData()                 // if we put the static in this then getData method will belong to class not to object. then we can call this without any object (d). 
	                                     // here getData is method  // void means it returns nothing , if we put int or String there than it will return integer
	{
		System.out.println("hello world");       // whenever the .getData method is called this will run and executed 
	    return  "deepanshu khokhar";	           //  whatever will be return that have to be capture in variable and to 
	                                               // print that we have to print the variable
	}
	
}
