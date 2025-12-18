public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Aisaule", "AITU001", "Computer Science");
        Student student2 = new Student("Aldiar", "AITU002", "Software Engineering");
        Student student3 = new Student("Bekarys", "AITU003", "Data Science");
        Student student4 = new Student("Ramazan", "AITU004", "Cybersecurity");
        Student student5 = new Student("Adilkhan", "AITU005", "Big Data Analyses");
        
        student1.addCredits(2);
        student1.updateGPA(2.8);
        
        student2.addCredits(0);
        student2.updateGPA(3.6);
        
        student3.addCredits(4);
        student3.updateGPA(2.8);
        
        student4.addCredits(5);
        student4.updateGPA(2.0);
        
        student5.addCredits(1);
        student5.updateGPA(3.1);
        
        System.out.println("Student Details:");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        
        Course course = new Course("Introduction to Programming", "Nurlybek", 5);
        
        course.addStudent(student1, 0);
        course.addStudent(student2, 1);
        course.addStudent(student3, 2);
        course.addStudent(student4, 3);
        course.addStudent(student5, 4);
        
        
        Student highestCredit = course.highestCreditStudent();
        if (highestCredit != null) {
            System.out.println("Highest Credit Student: " + highestCredit.getName() + 
                             " (" + highestCredit.getCredits() + " credits)");
        }
        
        System.out.println("\nData Processing Results:");
        
        Student[] studentArray = {student1, student2, student3, student4, student5};
        
        Student topStudent = getTopStudent(studentArray);
        if (topStudent != null) {
            System.out.println("Highest GPA Student: " + topStudent.getName() + 
                             " (GPA: " + topStudent.getGpa() + ")");
        }
        
        int honorsCount = countHonors(studentArray);
        System.out.println("Number of Honors Students: " + honorsCount);
        
        int totalCredits = totalCredits(studentArray);
        System.out.println("Total Credits Earned: " + totalCredits);
    }
    
    // Required static methods for Part 2
    public static Student getTopStudent(Student[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        
        Student top = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getGpa() > top.getGpa()) {
                top = arr[i];
            }
        }
        return top;
    }
    
    public static int countHonors(Student[] arr) {
        int count = 0;
        for (Student s : arr) {
            if (s.isHonors()) {
                count++;
            }
        }
        return count;
    }
    
    public static int totalCredits(Student[] arr) {
        int total = 0;
        for (Student s : arr) {
            total += s.getCredits();
        }
        return total;
    }
}