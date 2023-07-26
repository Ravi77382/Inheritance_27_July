package inheritance;
public class palindrom_class extends array_operation
{
		public static void main(String[] args)
		{
			palindrom_class obj1=new palindrom_class();
			obj1.greatest();											//Calling the function from acting parent class array_operation
			obj1.smallest();											//Calling the function from acting parent class array_operation
			obj1.ascending();											//Calling the function from acting parent class array_operation
			obj1.descending();											//Calling the function from acting parent class array_operation
			obj1.pal_value();											//Calling the function for user input from the Base class for Palindrome program
			obj1.rev();													//Calling the function within the class
			swapping s= new swapping();									//Creating object for swapping class which is derived class of Parent class(intial_parent) 
			s.swapNumbers();											//Calling the function of swapping class
		}
		public void rev()
		{
			temp=num;
			while(num>0)
			{
				r=num%10;
				rev=rev*10+r;
				num=num/10;
			}			
			System.out.println("The reverse number is: "+rev);
			if(temp==rev) 												//If the reverse number is same as input
			{
				System.out.println("Number is Palindrome.");
			}
			else 
			{
				System.out.println("Number is not Palindrome.");
			}
		}
}