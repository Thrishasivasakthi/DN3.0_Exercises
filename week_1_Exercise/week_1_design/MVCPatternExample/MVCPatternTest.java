package MVCPatternExample;

public class MVCPatternTest {
    public static void main(String[] args) {
        Student  student = new Student("Saravanapriya", 189, "A");

        
        StudentView view = new StudentView();

        
        StudentController controller = new StudentController(student, view);

        
        controller.updateView();

        
        controller.setStudentName("Thrisha");
        controller.setStudentId(217);
        controller.setStudentGrade("B");

        
        controller.updateView();
    }
        
        
}

