package SEIIIAssignment1;

import org.joda.time.DateTime;

public class Course {

	private String name;
	private Module[] modules;
	private Student[] students;
	private DateTime startDate;
	private DateTime endDate;
	
	public Course(String name, Module[] modules, Student[] students, DateTime startDate, DateTime endDate)
	{
		this.setName(name);
		this.setModules(modules);
		this.setStudents(students);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
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
	 * @return the modules
	 */
	public Module[] getModules() {
		return modules;
	}

	/**
	 * @param modules the modules to set
	 */
	public void setModules(Module[] modules) {
		this.modules = modules;
	}

	/**
	 * @return the students
	 */
	public Student[] getStudents() {
		return students;
	}

	/**
	 * @param students the students to set
	 */
	public void setStudents(Student[] students) {
		this.students = students;
	}

	/**
	 * @return the startDate
	 */
	public DateTime getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public DateTime getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	
	
	
}
