/*Performing mathematical operation of (((((10+2)+2)-2)*2)/2)*/
/*Using Different methods like non void (Default and Parameterized) and void methods (Default and Parameterized)*/
package a_JavaPrograms;
public class Day2_1_MathematicalOperations 
{
public int sum(int a, int b)
{
	int c=a+b; System.out.println("Sum Result In The Expression Is: "+c); return c;
}
public int sub(int a, int b)
{
	int c=a-b; System.out.println("Sub Result In The Expression Is: "+c); return c;
}
public int mul(int a, int b)
{
	int c=a*b; System.out.println("Mul Result In The Expression Is: "+c); return c;
}
public void div(int a, int b)
{
	int c=a/b; System.out.println("Div Result In The Expression Is: "+c);
}
public static void main(String[] args) 
{	Day2_1_MathematicalOperations obj = new Day2_1_MathematicalOperations();
	int Sum1 = obj.sum(10, 2);
	int Sum2 = obj.sum(Sum1, 2);
	int Sub  = obj.sub(Sum2, 2);
	int Mul  = obj.mul(Sub, 2);
	obj.div(Mul, 2);
}	}