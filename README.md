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

Usage
Upon running the program, you will be presented with a menu offering various options to manage the swim school system. Follow the on-screen prompts to navigate through different functionalities.
Class Structure
The system is built around the following main classes:

SwimSchool: Main class managing the entire system
Student: Represents a swim student
Instructor: Represents a swim instructor
Lesson: Represents a swim lesson
Qualification: Represents swim qualifications (distance and survival)

Important Notes

The program is designed to work with Java 8 and NetBeans Ant build configuration.
All data is volatile and exists only during program runtime.
Pre-loaded data is read-only, while data input during runtime is modifiable.

Swim School Operations

Classes operate on three weekday evenings: Monday, Wednesday, and Friday, from 17:00-20:00.
Each session is 30 minutes long with a maximum of 4 students.
Three levels of classes: novice, improvers, and advanced.
Instructors can teach multiple sessions and all levels.
Students attend one session per week at their designated level.
Waiting lists are maintained for level transfers and new students.

Contributing
This project is part of an academic assessment. While suggestions for improvements are welcome, please note that direct contributions may not be accepted due to academic integrity requirements.
License
This project is created for educational purposes as part of the CST2110 module. Please refer to your educational institution's policies regarding the use and distribution of academic project code.
