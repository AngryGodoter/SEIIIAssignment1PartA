package SEIIIAssignment1;

import org.joda.time.DateTime;

/**
 * This class contains basic info about a student.
 * @author Yiheng Jiang
 *
 */
public class Student {
	
	private String name;
	private String userName;
	private int age;
	private DateTime dob;
	private final int id;
	private Course course;
	private Module[] registeredModules;
	
	public Student(String name, int age, DateTime dob, int id, Course course, Module[] registeredModules)
	{
		this.setName(name);
		this.setAge(age);
		this.setDob(dob);
		this.id = id;
		this.setCourse(course);
		this.setRegisteredModules(registeredModules);
		this.setUserName(getUsername());
	}

	public String getUsername()
	{
		String userName = "";
		userName += this.name;
		userName += Integer.toString(age);
		return userName;
	}
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the dob
	 */
	public DateTime getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(DateTime dob) {
		this.dob = dob;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
	}

	/**
	 * @return the registeredModules
	 */
	public Module[] getRegisteredModules() {
		return registeredModules;
	}

	/**
	 * @param registeredModules the registeredModules to set
	 */
	public void setRegisteredModules(Module[] registeredModules) {
		this.registeredModules = registeredModules;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
