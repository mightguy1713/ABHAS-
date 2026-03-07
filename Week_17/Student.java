package Week_17;

public class Student {
    private int studentId;
    private String name;
    private String course;
    
     public Student(int studentId, String name, String course) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
    }

    public String getFormattedDisplay() {   
    return "<html><body style = 'text-align: center'>"
                + "<h2>Student ID Card</h2>"
                + "<p><b>ID:</b> " + studentId + "</p>"
                + "<p><b>Name:</b> " + name + "</p>"
                + "<p><b>Course:</b> " + course + "</p>"
                + "</body></html>";
    }
}