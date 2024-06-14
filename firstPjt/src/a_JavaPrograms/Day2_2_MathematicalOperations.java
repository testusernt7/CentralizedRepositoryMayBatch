/*Performing mathematical operation of (((((10*2)-2)+2)-2)/2)*/
/*Using Different methods like non void (Default and Parameterized) and void methods (Default and Parameterized)*/
package a_JavaPrograms;
public class Day2_2_MathematicalOperations 
{
	public int mul(int a, int b)
	{
		int c=a*b; System.out.println("Mul Result In The Expression Is: "+c); return c;
	}
	public int sub(int a, int b)
	{
		int c=a-b; System.out.println("Sub Result In The Expression Is: "+c); return c;
	}
	public int sum(int a, int b)
	{
		int c=a+b; System.out.println("Sum Result In The Expression Is: "+c); return c;
	}
	public void div(int a, int b)
	{
		int c=a/b; System.out.println("Div Result In The Expression Is: "+c);
	}
	public static void main(String[] args) 
	{	Day2_2_MathematicalOperations obj = new Day2_2_MathematicalOperations();
		int Mul  = obj.mul(10, 2);
		int Sub1 = obj.sub(Mul, 2);
		int Sum  = obj.sum(Sub1, 2);
		int Sub2 = obj.sub(Sum, 2);
		obj.div(Sub2, 2);
}	}
