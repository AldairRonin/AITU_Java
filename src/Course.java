public class Course {
    private String courseName;
    private String instructor;
    private Student[] students;
    
    public Course(String courseName, String instructor, int arraySize) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = new Student[arraySize];
    }
    
    public void addStudent(Student s, int index) {
        if (index >= 0 && index < students.length) {
            students[index] = s;
        }
    }
    
    public double courseAverageGPA() {
        double sum = 0.0;
        int count = 0;
        
        for (Student student : students) {
            if (student != null) {
                sum += student.getGpa();
                count++;
            }
        }
        
        if (count > 0) {
            return sum / count;
        } else {
            return 0.0;
        }
    }
    
    public Student highestCreditStudent() {
        Student highest = null;
        int maxCredits = -1;
        
        for (Student student : students) {
            if (student != null && student.getCredits() > maxCredits) {
                maxCredits = student.getCredits();
                highest = student;
            }
        }
        
        return highest;
    }
    
    @Override
    public String toString() {
        return "Course: " + courseName + 
               "\nInstructor: " + instructor + 
               "\nAverage GPA: " + String.format("%.2f", courseAverageGPA());
    }
}