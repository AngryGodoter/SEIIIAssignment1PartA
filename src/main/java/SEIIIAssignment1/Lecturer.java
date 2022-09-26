package SEIIIAssignment1;

import org.joda.time.DateTime;

public class Lecturer {

	private String name;
	private String userName;
	private int age;
	private DateTime dob;
	private final int id;
	private Module[] modulesTeaching;
	
	public Lecturer(String name, int age, DateTime dob, int id, Module[] modulesTeaching)
	{
		this.setName(name);
		this.setAge(age);
		this.setDob(dob);
		this.id = id;
		this.setModulesTeaching(modulesTeaching);
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
	 * @return the modulesTeaching
	 */
	public Module[] getModulesTeaching() {
		return modulesTeaching;
	}

	/**
	 * @param modulesTeaching the modulesTeaching to set
	 */
	public void setModulesTeaching(Module[] modulesTeaching) {
		this.modulesTeaching = modulesTeaching;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
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
