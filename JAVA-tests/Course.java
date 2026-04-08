import java.util.Arrays;

public class Course {
   static int maxCapacity = 100 ;

   String courseName ;
   int enrollments;

    String [] enrollStudents ;

   Course (String courseName){
    this.courseName = courseName;
    this.enrollments = 0 ;
    this.enrollStudents = new String[maxCapacity];
   }




   static void setMaxCapacity (int maxCapacity){
    Course.maxCapacity = maxCapacity;
   }

  void enrollStudent (String studentName){
    enrollStudents[enrollments] = studentName;
    enrollments++;
  }

  void unenrollStudent(String studentName) {
    enrollments-- ;
  }

  public static void main(String[] args) {
    Course javaCourse = new Course ("Java Programming");
    javaCourse.enrollStudent("Alice");
    javaCourse.enrollStudent("Dibaakar");
    javaCourse.enrollStudent("Bob");
    javaCourse.unenrollStudent("Dibaakar");

    System.out.println(Arrays.toString(javaCourse.enrollStudents));
    System.out.println(javaCourse.courseName);
    System.out.println(javaCourse.enrollments);

  }



    
}
