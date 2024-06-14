//I have three constructors and if I want to call all of them at same time, then I need to create three objects.
/* Instead of avoiding creation of multiple objects, we can use the concept of "this" keyword using which we can call from 
 * one constructor to another constructor. Also, "this" is a first statement inside constructor. 
 * We can't write more than one "this" statement in a constructor */

package a_JavaPrograms;
public class Day3_Assignment1_ConstructorWithTHISkeyword 
{
public Day3_Assignment1_ConstructorWithTHISkeyword()
{	this(10,20,30);	//control will go to three parameterized constructor
	System.out.println("Default Parametized Constructor");
}
public Day3_Assignment1_ConstructorWithTHISkeyword(int a)
{	this();	//control will go to default parameterized constructor
	System.out.println("One Parametized Constructor");
}
public Day3_Assignment1_ConstructorWithTHISkeyword(int a, int b)
{	this(10);	//control will go to one parameterized constructor
	System.out.println("Two Parametized Constructor");
}
public Day3_Assignment1_ConstructorWithTHISkeyword(int a, int b, int c)
{	
	System.out.println("Three Parametized Constructor");
}
public static void main(String[] args) 
{
	Day3_Assignment1_ConstructorWithTHISkeyword obj = new Day3_Assignment1_ConstructorWithTHISkeyword(10,20); //control goes to 2 parameterized constructor
}	}
