package SEIIIAssignment1;

public class Module {

	private String name;
	private String id;
	private Student[] students;
	private Course[] courses;
	private Lecturer lecturer;
	
	public Module(String name, String id, Student[] students, Course[] courses, Lecturer lecturer)
	{
		this.setName(name);
		this.setId(id);
		this.setStudents(students);
		this.setCourses(courses);
		this.setLecturer(lecturer);
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
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return the courses
	 */
	public Course[] getCourses() {
		return courses;
	}

	/**
	 * @param courses the courses to set
	 */
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

	/**
	 * @return the lecturer
	 */
	public Lecturer getLecturer() {
		return lecturer;
	}

	/**
	 * @param lecturer the lecturer to set
	 */
	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}
	
	
	
}
