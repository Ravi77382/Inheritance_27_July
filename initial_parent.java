//Parent Class only for accepting the values
package inheritance;
import java.util.Scanner;
public class initial_parent 
{
	int a,b,x,y,num,num1,num2,result,size,number,i,j,rev=0,r,temp,grt;;	//Declaration and Initialization
	int [] array,result1,numb;											//Creating array
	Scanner sc=new Scanner(System.in);
	public int[] accept()											//Accepting the values from user for Array Operations
	{
		System.out.println("Enter the size: ");
		size=sc.nextInt();
		System.out.println("Enter "+size+" numbers: ");
		int[] num=new int[size];
		for(i=0;i<size;i++)
		{
			num[i]=sc.nextInt();
		}
		return num;
	}
	public void pal_value() 										//Accepting the value from user for Palindrome
	{
		System.out.println("Program For Palindrome Number");
		System.out.println("Enter your number: ");
		num=sc.nextInt();
		System.out.println("The Number is: "+num);
	}
	public void swap_value()										//Accepting the values from user for Swapping with or without third variable
	{
		System.out.println("Enter the First Number: ");
		num1=sc.nextInt();
		System.out.println("Enter the Second Number: ");
		num2=sc.nextInt();
	}
	
}