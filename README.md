# AITU_Java
A. Project Overview

Project Goal
Development of an object-oriented student management system in Java, demonstrating the application of OOP principles and working with arrays of objects.

Program Description
The program models a university system that allows:
 Creating and managing student data
 Organizing students into courses
 Performing statistical calculations (average GPA, number of honors students)

Integration of Learned Topics
The project integrates the following learned topics:
 Java Fundamentals: data types, variables, conditions, loops, arrays
 OOP: classes, objects, constructors, methods
 Encapsulation: private fields, getters/setters
 Composition: Course class contains an array of Student objects

 B. Class Descriptions

Student Class

 Fields:
 `String name` - student's full name
 `String id` - unique student identifier
 `String major` - academic major
 `double gpa` - current grade point average
 `int credits` - total earned credits 

 Key Methods:
Getters/Setters for all fields with validation

addCredits(int c) - adds credits 

updateGPA(double newGPA) - updates GPA with range validation 

isHonors() - returns true if GPA ≥ 3.5

toString() - returns string representation of student

Course Class
Fields:
String courseName - course name

String instructor - instructor name

Student[] students - array of Student objects
Constructor: public Course(String courseName, String instructor, int arraySize)
Creates a course with given name, instructor, and student array size.

Key Methods:
addStudent(Student s, int index) - adds student to array at specified index
courseAverageGPA() - calculates average GPA of all students in the course
highestCreditStudent() - returns student with the highest number of credits
toString() - returns course summary information

Composition Relationship:
The Course class contains an array of Student objects, which is an example of composition - a course "has" students. When a Course object is destroyed, the student array also ceases to exist in the context of that course.

C. Instructions to Compile and Run

javac Main.java
java Main

D. Screenshots
![image alt](https://raw.githubusercontent.com/AldairRonin/AITU_Java/927b1512bfe0ffb27eacfc05474af31125b67b8d/docs/programm_screenshot.png)


E. Reflection
Learned: Practical OOP, encapsulation, array processing
Challenges: Data validation, null handling, Git workflow
OOP Benefits: Data protection, modularity, maintainability