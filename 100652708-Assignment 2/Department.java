 import java.util.HashSet;
import java.util.Vector;

 public class Department {
     private String name; // the name of school Dept of Computing and Info Science
     private String id; // short name for courses SOFE, ELEE, STAT, etc
     private Vector<Course> courseList; // all courses offered by the department
     private Vector<Student> registerList;
     private int studentIncrement = 0;// all students taking courses in the department.
    private int incrementCourse = 0;

     public Department(String name, String id) {
         name = this.name;
         id = this.id;
         registerList = new Vector<>();
         courseList = new Vector<>();
     }

     public String getName() {
         return name;
     }

     public String getId() {
         return id;
     }


     public String toString() {
         // returns a string representation of department name, number
         // of courses offered and number of students registered in the
         // department. Use the format:
         // ECSE: 53 courses, 460 students
         System.out.println(name + ":" + courseList.size() + " courses " + registerList.size() + "students");
         return null;
     }

     //offered courses
     public void offerCourse(Course course) {
         courseList.add(course);
         incrementCourse++;
     }

     //print he courses offered
     public void printCoursesOffered() {
         for (int i = 0; i < courseList.size(); i++) {
             courseList.elementAt(i).toString();
         }

     }
        //print the students by name
     public void printStudentsByName() {
         for (Student student : registerList) {
             student.toString();
         }

     }

        //adds the student to the register vector
     public void addStudentToRegister(Student stud) {
         if (isStudentRegistered(stud)) {
             registerList.add(stud);

         }

     }

     //print the students by name
     public void printStudentsBuName(){
             for(Student name:registerList)
                 System.out.println(name);
             System.out.println();
         }



     public boolean isStudentRegistered(Student student) {
         return (registerList.contains(student));
     }

// registers the student course in the department
     public void registerStudentCourseInDepartment(Student student, Course course) {
         if (!registerList.contains(student)) {
             registerList.addElement(student);
             studentIncrement++;
         }
         if (!courseList.contains(course)) {
             courseList.addElement(course);
         }
     }

     }

