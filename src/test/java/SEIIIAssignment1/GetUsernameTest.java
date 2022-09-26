package SEIIIAssignment1;

import org.joda.time.DateTime;

/***
 * This class is used to perform some simple testings with the get username method.
 * @author Yiheng Jiang
 *
 */
public class GetUsernameTest {

	public static void main(String[] args)
	{
		//create some students
		Student s1 = new Student("DavidSwain", 20, new DateTime("2002-06-02"), 1, null, null);
		Student s2 = new Student("KarlBuck", 21, new DateTime("2001-11-03"), 2, null, null);
		//create a lecturer
		Lecturer l1 = new Lecturer("BakeFenney", 42, new DateTime("1980-09-22"), 1, null, null);
		
		//test the getUsername method
		System.out.println("The first student is called: " + s1.getName());
		System.out.println("He is " + Integer.toString(s1.getAge()) + " years old");
		System.out.println("His username is: " + s1.getUsername());
		System.out.println("\n\n");
		System.out.println("The second student is called: " + s2.getName());
		System.out.println("He is " + Integer.toString(s2.getAge()) + " years old");
		System.out.println("His username is: " + s2.getUsername());
		System.out.println("\n\n");
		System.out.println("The Lecturer is called: " + l1.getName());
		System.out.println("He is " + Integer.toString(l1.getAge()) + " years old");
		System.out.println("His username is: " + l1.getUsername());
	}
	
}
