

public class StudentPractice {
    //instantiate your Student class below
    public static void main(String[] args){
        Student myself = new Student("Jake Willman", 12345, 1, 4.0);

        // Print out the student's information
        System.out.println("Student Name: " + myself.getName());
        System.out.println("Student ID: " + myself.getStudentId());
        System.out.println("Number of Credits: " + myself.getNumberOfCredits());
        System.out.println("GPA: " + myself.getGpa());
    }
}
