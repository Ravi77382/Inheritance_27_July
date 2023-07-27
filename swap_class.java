package inheritance;

public class swap_class {

	public static void main(String[] args) {
		palindrom_class obj1=new palindrom_class();
		swapping s=new swapping();
		obj1.greatest();											//Calling the function from acting parent class array_operation
		obj1.smallest();											//Calling the function from acting parent class array_operation
		obj1.ascending();											//Calling the function from acting parent class array_operation
		obj1.descending();											//Calling the function from acting parent class array_operation
		obj1.pal_value();											//Calling the function for user input from the Base class for Palindrome program
		obj1.rev();
		s.swapNumbers();
	}
}