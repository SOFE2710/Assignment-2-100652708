
import java.util.Vector;
public class Course{
   private Department dept;
   private String title; // title of the course (e.g. Intro to programming);
   private String code; // course code, e.g. SOFE, ELEE, MANE, etc.
   private int number; // course number, e.g. 1200, 2710, 2800, etc.
   private  Vector <Student>classList;
   private int classIncrement = 0;


//initializing
   public Course(String code, int number, Department dept, String title) {
       code = this.code;
       number = this.number;
       dept = this.dept;
       title = this.title;
	 	   
	   }

    public Department getDept() {
        return dept;
    }

    public int getNumber() {
        return number;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }


    public void addStudentToCourse(Student student){
       classList.add(student);
       classIncrement++;

    }

    //adds student to the department's registration list
    public void addStudToRegister(Student student){

        //adds student to the list within the department class
        dept.addStudentToRegister(student);
    }



    public String toString() {
     // return a string representation of the course with the course code,
     // name, and number of people registered in the course in the following
     // format:
     // SOFE 2710 Object Oriented Programming and Design, Enrollment = 260
      return(code + " " + number + " " + title + ", Enrollment = " + classList.size());

  }




}
