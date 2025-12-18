public class Student {
    private String name;
    private String id;
    private String major;
    private double gpa;
    private int credits;

    public Student(String name, String id, String major) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = 0.0;
        this.credits = 0;
    }
    public String getName() { return name; }
    public String getId() { return id; }
    public String getMajor() { return major; }
    public double getGpa() { return gpa; }
    public int getCredits() { return credits; }

    public void setName(String name) { this.name = name; }
    public void setId(String id) { this.id = id; }
    public void setMajor(String major) { this.major = major; }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        }
    }

    public void setCredits(int credits) {
        if (credits >= 0) {
            this.credits = credits;
        }
    }

        public void addCredits(int c) {
        if (c > 0) {
            this.credits += c;
        }
    }

    public void updateGPA(double newGPA) {
        if (newGPA >= 0.0 && newGPA <= 4.0) {
            this.gpa = newGPA;
        }
    }

    public boolean isHonors() {
        return this.gpa >= 3.5;
    }
    public String toString() {
    return "Name: " + name +
           ", ID: " + id +
           ", Major: " + major +
           ", GPA: " + gpa +
           ", Credits: " + credits +
           ", Honors: " + isHonors();
    }
}

