import java.util.Vector;

public class Student extends Person {
	private String id;
	private String name;
	private Vector <Course>courses; // contains all courses the student is registered in


	public Student(String stdName, String stdId) {

	}


	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}




    public String toString() {
		// return a string representation of a student using the following format:
		// 100234546 John McDonald
		// Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850
		System.out.println(id + " " + name);
		return ("Registered courses: " + courses);

	}

	//register the student for said course
	public void registerFor(Course course){
		if (!(courses.contains(course))){ //verifies the course is not taken
			courses.add(course);
			course.addStudToRegister(this);
		}
	}

// true or false for if they are registered in courses
	public Boolean isRegisteredInCourse(Course course){
		return courses.contains(course);
	}
}




