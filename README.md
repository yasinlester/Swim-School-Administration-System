CST2110 Assessment Part 2 - Task 2
Swim School Administration System
This Java program implements a console-based administration system for a swimming school. It allows management of swim classes, students, instructors, and qualifications.
Features

Object-Oriented Design: Implements classes for SwimSchool, Student, Instructor, Lesson, and Qualification.
Console Menu: Offers a user-friendly interface with the following options:

View swim student information
View swim lesson details
View instructor schedule
Add new swim student
Award swim qualification
Move swim student from waiting list
Exit the program


Data Management:

Pre-loads dummy data for testing
Allows runtime input for adding students and awarding qualifications
Manages waiting lists for class transfers and new students


Qualification Tracking:

Tracks distance swim certificates and personal survival medals
Automatically upgrades students based on achieved qualifications



Requirements

Java 8
NetBeans IDE (configured for Ant build)

Setup and Running

Clone this repository or download the source code.
Open the project in NetBeans IDE.
Build and run the project.

After running the program, you will be presented with a menu offering various options for managing the swim school system. Follow the on-screen prompts to navigate through different functionalities.
Here's an example of how the main menu will look:

----------------------------------
Swim School Administration System
----------------------------------
1. View swim student information
2. View swim lesson details
3. View instructor schedule
4. Add new swim student
5. Award swim qualification
6. Move swim student from waiting list
0. Exit
----------------------------------
Enter your choice:

To use the system:

Enter the number corresponding to the action you want to perform.
Follow the prompts for each option to input or view information.
Select '0' when you want to exit the program.

Class Structure

The system is built around the following main classes:

ApplicationRunner.java: Main class to run the application
SwimSchoolSystem.java: Core class managing the entire swim school system
SwimStudent.java: Represents a swim student
Instructor.java: Represents a swim instructor
SwimLesson.java: Represents a swim lesson
Qualification.java: Base class for qualifications
DistanceSwim.java: Represents distance swim qualifications
PersonalSurvival.java: Represents personal survival qualifications
WaitingList.java: Manages the waiting list for students

Important Notes

The program is designed to work with Java 8 and NetBeans Ant build configuration.
All data is volatile and exists only during program runtime.
Pre-loaded data is read-only, while data input during runtime is modifiable.
Swim School Operations

Classes operate on three weekday evenings: Monday, Wednesday, and Friday, from 17:00-20:00.
Each session is 30 minutes long with a maximum of 4 students.
There are three levels of classes: novice, improvers, and advanced.
Instructors can teach multiple sessions at all levels.
Students attend one session per week at their designated level.
Waiting lists are maintained for level transfers and new students.


