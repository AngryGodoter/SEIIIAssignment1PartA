package SEIIIAssignment1;

import org.joda.time.DateTime;
import org.junit.Test;

import static org.junit.Assert.*;

/***
 * This class is used to perform some simple testings with the get username method.
 * @author Yiheng Jiang
 *
 */
public class GetUsernameTest {
	
	//create a lecturer
	Lecturer l1 = new Lecturer("BakeFenney", 42, new DateTime("1980-09-22"), 1, null);
	//create some students
	Student s1 = new Student("DavidSwain", 20, new DateTime("2002-06-02"), 1, null, null);
	Student s2 = new Student("KarlBuck", 21, new DateTime("2001-11-03"), 2, null, null);
	//create a course
	Course c1 = new Course("CT", null, null, new DateTime("2019-09-22"), new DateTime("2023-05-01"));
	//create a module
	Module m1 = new Module("Simple AI", "CT999", null, null, l1);
	
	@Test
	public void testStudentGetname1()
	{
		String s1username = s1.getUsername();
		assertEquals("DavidSwain20", s1username);
	}
	
	@Test
	public void testStudentGetname2()
	{
		String s2username = s2.getUsername();
		assertEquals("KarlBuck21", s2username);
	}
	
	@Test
	public void testLecturerGetname()
	{
		String l1username = l1.getUsername();
		assertEquals("BakeFenney42", l1username);
	}
	
	@Test
	public void testCourseGetName()
	{
		String courseCode = c1.getName();
		assertEquals("CT", courseCode);
	}
	
	@Test
	public void testModuleGetName()
	{
		String moduleName = m1.getName();
		assertEquals("Simple AI", moduleName);
	}
}
