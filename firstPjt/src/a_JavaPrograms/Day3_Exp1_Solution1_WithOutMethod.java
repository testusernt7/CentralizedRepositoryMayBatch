/*Question: we have five variables, we want to give value to those variables and want to print the values of those variables.
*Solution1-->just create the object of the class but not any method, call the variables and assign the value and print*/
//Note: Here we are using 10 calls for single object i.e., 5 calls for assigning value and 5 for printing.
// If we have 10 objects, then we need to make 10*10=100 calls

package a_JavaPrograms;

public class Day3_Exp1_Solution1_WithOutMethod 
{
int a, b, c, d, e;	// 5 variables
public static void main(String[] args) 
{
	Day3_Exp1_Solution1_WithOutMethod obj1 = new Day3_Exp1_Solution1_WithOutMethod();
	obj1.a=10; //1st call
	obj1.b=20; //2nd call
	obj1.c=30; //3rd call
	obj1.d=40; //4th call
	obj1.e=50; //5th call
	System.out.println("Value of A is: "+obj1.a); //6th call
	System.out.println("Value of B is: "+obj1.b); //7th call
	System.out.println("Value of C is: "+obj1.c); //8th call
	System.out.println("Value of D is: "+obj1.d); //9th call
	System.out.println("Value of E is: "+obj1.e); //10th call
}
}
