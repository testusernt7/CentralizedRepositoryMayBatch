/*Question: we have five variables, we want to give value to those variables and want to print the values of those variables.
*Solution2--> we will use a method for assigning the value.*/
//Note: Here we are using 6 calls for single object i.e., 1 call for assigning value and 5 for printing.
// If we have 10 objects, then we need to make 6*10=60 calls. So, 40 calls reduced when compared with Solution1.

package a_JavaPrograms;

public class Day3_Exp1_Solution2_WithMethod 
{
int a, b, c, d, e;	// 5 variables
public void method1(int x1, int x2, int x3, int x4, int x5)	//void method which do not return any return time i.e., no result
{
	a=x1; b=x3; c=x3; d=x4; e=x5;
}
public static void main(String[] args) 
{
	Day3_Exp1_Solution2_WithMethod obj1 = new Day3_Exp1_Solution2_WithMethod();
	obj1.method1(10, 20, 30, 40, 50);				//1st call for assigning value to variables with the help of method creation
	System.out.println("Value of A is: "+obj1.a);	//2nd call for printing the value of the variable
	System.out.println("Value of B is: "+obj1.b);	//3rd call for printing the value of the variable
	System.out.println("Value of C is: "+obj1.c);	//4th call for printing the value of the variable
	System.out.println("Value of D is: "+obj1.d);	//5th call for printing the value of the variable
	System.out.println("Value of E is: "+obj1.e);	//6th call for printing the value of the variable
}
}
