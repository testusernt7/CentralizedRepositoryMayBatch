/*Writing a first Java program using four pillars (class creation with methods and variables, main method creation, 
 * object creation and calling methods and variables */

package a_JavaPrograms;

public class Day1_FirstJavaProgram_Student
{
	int age, rollno;
public void display1()
{
	System.out.println("Welcome To All Of You");
}
public void display2()
{
	System.out.println("This is Nagaraju");
}
public static void main(String[] args) 
{
	Day1_FirstJavaProgram_Student student = new Day1_FirstJavaProgram_Student();
	student.display1();
	student.display2();
	student.age=32;
	student.rollno=6;
	System.out.println("Student Age Is: "+student.age);
	System.out.println("Student RollNum Is: "+student.rollno);
}
}
