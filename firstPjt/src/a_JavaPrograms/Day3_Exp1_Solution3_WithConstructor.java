/*Question: we have five variables, we want to give value to those variables and want to print the values of those variables.
*Solution3 --> we will use a constructor for assigning the value */
/*Note: Here we are using 5 calls for single object i.e., 5 for printing and no calls for calling the variables as constructor 
will assign the value and will call the variables automatically when objec t of the class is created*/
/* If we have 10 objects, then we need to make 5*10=50 calls. So, 50 calls reduced when compared with Solution1 
and 10 more calls reduced when compared with solution2*/

package a_JavaPrograms;
public class Day3_Exp1_Solution3_WithConstructor 
{
int a, b, c, d, e;
public Day3_Exp1_Solution3_WithConstructor(int x1, int x2, int x3, int x4, int x5) //parameterized constructor
{
	a=x1; b=x2; c=x3; d=x4; e=x5;
}
public static void main(String[] args) 
{
	Day3_Exp1_Solution3_WithConstructor obj1 = new Day3_Exp1_Solution3_WithConstructor(10, 20, 30, 40, 50);
	System.out.println("Value of A is: "+obj1.a);	//1st call for printing the value of the variable
	System.out.println("Value of B is: "+obj1.b);	//2nd call for printing the value of the variable
	System.out.println("Value of C is: "+obj1.c);	//3rd call for printing the value of the variable
	System.out.println("Value of D is: "+obj1.d);	//4th call for printing the value of the variable
	System.out.println("Value of E is: "+obj1.e);	//5th call for printing the value of the variable
}
}
