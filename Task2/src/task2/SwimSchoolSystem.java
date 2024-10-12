package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// Class representing the swim school system
class SwimSchoolSystem {
    private List<SwimStudent> students = new ArrayList<>();
    private List<Instructor> instructors = new ArrayList<>();
    private List<SwimLesson> lessons = new ArrayList<>();
    private WaitingList waitingList = new WaitingList();

   // Method to run the swim school system
    public void run() {
        // Add some dummy data
        populateDummyData();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();
            handleUserChoice(choice, scanner);
        } while (choice != 7);
    }

 // Method to populate dummy data for testing purposes
  private void populateDummyData() {
    // Dummy instructors
    Instructor instructor1 = new Instructor("John Smith");
    instructors.add(instructor1);
    Instructor instructor2 = new Instructor("Sarah Johnson");
    instructors.add(instructor2);
    Instructor instructor3 = new Instructor("Michael Davis");
    instructors.add(instructor3);

    // Dummy lessons
    SwimLesson lesson1 = new SwimLesson("Monday", "17:00", "Novice", instructor1);
    lessons.add(lesson1);
    SwimLesson lesson2 = new SwimLesson("Monday", "18:00", "Improver", instructor2);
    lessons.add(lesson2);
    SwimLesson lesson3 = new SwimLesson("Monday", "19:30", "Advanced", instructor3);
    lessons.add(lesson3);
    SwimLesson lesson4 = new SwimLesson("Wednesday", "17:00", "Novice", instructor2);
    lessons.add(lesson4);
    SwimLesson lesson5 = new SwimLesson("Wednesday", "18:00", "Improver", instructor3);
    lessons.add(lesson5);
    SwimLesson lesson6 = new SwimLesson("Wednesday", "19:30", "Advanced", instructor1);
    lessons.add(lesson6);
    SwimLesson lesson7 = new SwimLesson("Friday", "17:00", "Novice", instructor3);
    lessons.add(lesson7);
    SwimLesson lesson8 = new SwimLesson("Friday", "18:00", "Improver", instructor1);
    lessons.add(lesson8);
    SwimLesson lesson9 = new SwimLesson("Friday", "19:30", "Advanced", instructor2);
    lessons.add(lesson9);

    //Dummy students and qualifications
    SwimStudent student1 = new SwimStudent("Alice Johnson", "Novice");
    student1.setAttendedLesson(lesson1);
    students.add(student1);
    lesson1.getAttendingStudents().add(student1);
    DistanceSwim qualification1 = new DistanceSwim(instructor1, 10);
    student1.addQualification(qualification1);

    SwimStudent student2 = new SwimStudent("Bob Thompson", "Improver");
    student2.setAttendedLesson(lesson2);
    students.add(student2);
    lesson2.getAttendingStudents().add(student2);
    DistanceSwim qualification2 = new DistanceSwim(instructor2, 100);
    student2.addQualification(qualification2);

    SwimStudent student3 = new SwimStudent("Charlie Brown", "Advanced");
    student3.setAttendedLesson(lesson3);
    students.add(student3);
    lesson3.getAttendingStudents().add(student3);
    DistanceSwim qualification3 = new DistanceSwim(instructor3, 800);
    student3.addQualification(qualification3);
    PersonalSurvival personalSurvival1 = new PersonalSurvival(instructor3, "Bronze");
    student3.addQualification(personalSurvival1);

    SwimStudent student4 = new SwimStudent("David Wilson", "Novice");
    student4.setAttendedLesson(lesson4);
    students.add(student4);
    lesson4.getAttendingStudents().add(student4);
    DistanceSwim qualification4 = new DistanceSwim(instructor2, 5);
    student4.addQualification(qualification4);

    SwimStudent student5 = new SwimStudent("Eva Davis", "Improver");
    student5.setAttendedLesson(lesson5);
    students.add(student5);
    lesson5.getAttendingStudents().add(student5);
    DistanceSwim qualification5 = new DistanceSwim(instructor3, 200);
    student5.addQualification(qualification5);

    SwimStudent student6 = new SwimStudent("Frank Johnson", "Advanced");
    student6.setAttendedLesson(lesson6);
    students.add(student6);
    lesson6.getAttendingStudents().add(student6);
    DistanceSwim qualification6 = new DistanceSwim(instructor1, 1500);
    student6.addQualification(qualification6);
    PersonalSurvival personalSurvival2 = new PersonalSurvival(instructor1, "Silver");
    student6.addQualification(personalSurvival2);

    SwimStudent student7 = new SwimStudent("Grace Thompson", "Novice");
    student7.setAttendedLesson(lesson7);
    students.add(student7);
    lesson7.getAttendingStudents().add(student7);
    DistanceSwim qualification7 = new DistanceSwim(instructor3, 15);
    student7.addQualification(qualification7);

    SwimStudent student8 = new SwimStudent("Henry Brown", "Improver");
    student8.setAttendedLesson(lesson8);
    students.add(student8);
    lesson8.getAttendingStudents().add(student8);
    DistanceSwim qualification8 = new DistanceSwim(instructor1, 150);
    student8.addQualification(qualification8);

    SwimStudent student9 = new SwimStudent("Isabelle Wilson", "Advanced");
    student9.setAttendedLesson(lesson9);
    students.add(student9);
    lesson9.getAttendingStudents().add(student9);
    DistanceSwim qualification9 = new DistanceSwim(instructor2, 1000);
    student9.addQualification(qualification9);
    PersonalSurvival personalSurvival3 = new PersonalSurvival(instructor2, "Gold");
    student9.addQualification(personalSurvival3);

    SwimStudent student10 = new SwimStudent("Jack Davis", "Novice");
    student10.setAttendedLesson(lesson1);
    students.add(student10);
    lesson1.getAttendingStudents().add(student10);
    DistanceSwim qualification10 = new DistanceSwim(instructor1, 8);
    student10.addQualification(qualification10);

    SwimStudent student11 = new SwimStudent("Katie Johnson", "Novice");
    student11.setAttendedLesson(lesson1);
    students.add(student11);
    lesson1.getAttendingStudents().add(student11);
    DistanceSwim qualification11 = new DistanceSwim(instructor1, 12);
    student11.addQualification(qualification11);

    SwimStudent student12 = new SwimStudent("Liam Wilson", "Improver");
    student12.setAttendedLesson(lesson2);
    students.add(student12);
    lesson2.getAttendingStudents().add(student12);
    DistanceSwim qualification12 = new DistanceSwim(instructor2, 120);
    student12.addQualification(qualification12);

    SwimStudent student13 = new SwimStudent("Mia Thompson", "Advanced");
    student13.setAttendedLesson(lesson3);
    students.add(student13);
    lesson3.getAttendingStudents().add(student13);
    DistanceSwim qualification13 = new DistanceSwim(instructor3, 900);
    student13.addQualification(qualification13);
    PersonalSurvival personalSurvival4 = new PersonalSurvival(instructor3, "Silver");
    student13.addQualification(personalSurvival4);

    SwimStudent student14 = new SwimStudent("Noah Brown", "Novice");
    student14.setAttendedLesson(lesson4);
    students.add(student14);
    lesson4.getAttendingStudents().add(student14);
    DistanceSwim qualification14 = new DistanceSwim(instructor2, 6);
    student14.addQualification(qualification14);

    SwimStudent student15 = new SwimStudent("Olivia Davis", "Novice");
    student15.setAttendedLesson(lesson4);
    students.add(student15);
    lesson4.getAttendingStudents().add(student15);
    DistanceSwim qualification15 = new DistanceSwim(instructor2, 10);
    student15.addQualification(qualification15);

    SwimStudent student16 = new SwimStudent("Peter Wilson", "Improver");
    student16.setAttendedLesson(lesson5);
    students.add(student16);
    lesson5.getAttendingStudents().add(student16);
    DistanceSwim qualification16 = new DistanceSwim(instructor3, 180);
    student16.addQualification(qualification16);

    SwimStudent student17 = new SwimStudent("Quinn Thompson", "Advanced");
    student17.setAttendedLesson(lesson6);
    students.add(student17);
    lesson6.getAttendingStudents().add(student17);
    DistanceSwim qualification17 = new DistanceSwim(instructor1, 1200);
    student17.addQualification(qualification17);
    PersonalSurvival personalSurvival5 = new PersonalSurvival(instructor1, "Bronze");
    student17.addQualification(personalSurvival5);

    SwimStudent student18 = new SwimStudent("Rachel Brown", "Novice");
    student18.setAttendedLesson(lesson7);
    students.add(student18);
    lesson7.getAttendingStudents().add(student18);
    DistanceSwim qualification18 = new DistanceSwim(instructor3, 8);
    student18.addQualification(qualification18);

    SwimStudent student19 = new SwimStudent("Samuel Davis", "Improver");
    student19.setAttendedLesson(lesson8);
    students.add(student19);
    lesson8.getAttendingStudents().add(student19);
    DistanceSwim qualification19 = new DistanceSwim(instructor1, 160);
    student19.addQualification(qualification19);

    SwimStudent student20 = new SwimStudent("Tessa Wilson", "Advanced");
    student20.setAttendedLesson(lesson9);
    students.add(student20);
    lesson9.getAttendingStudents().add(student20);
    DistanceSwim qualification20 = new DistanceSwim(instructor2, 1100);
    student20.addQualification(qualification20);
    PersonalSurvival personalSurvival6 = new PersonalSurvival(instructor2, "Silver");
    student20.addQualification(personalSurvival6);

    
    SwimStudent student21 = new SwimStudent("Ursula Thompson", "Novice");
    student21.setAttendedLesson(lesson1);
    students.add(student21);
    lesson1.getAttendingStudents().add(student21);
    DistanceSwim qualification21 = new DistanceSwim(instructor1, 7);
    student21.addQualification(qualification21);

    
    SwimStudent student22 = new SwimStudent("Victor Brown", "Improver");
    student22.setAttendedLesson(lesson5);
    students.add(student22);
    lesson5.getAttendingStudents().add(student22);
    DistanceSwim qualification22 = new DistanceSwim(instructor3, 220);
    student22.addQualification(qualification22);

    SwimStudent student23 = new SwimStudent("Wendy Davis", "Improver");
    student23.setAttendedLesson(lesson5);
    students.add(student23);
    lesson5.getAttendingStudents().add(student23);
    DistanceSwim qualification23 = new DistanceSwim(instructor3, 240);
    student23.addQualification(qualification23);

   
    SwimStudent student24 = new SwimStudent("Xavier Wilson", "Advanced");
    student24.setAttendedLesson(lesson9);
    students.add(student24);
    lesson9.getAttendingStudents().add(student24);
    DistanceSwim qualification24 = new DistanceSwim(instructor2, 1200);
    student24.addQualification(qualification24);
    PersonalSurvival personalSurvival7 = new PersonalSurvival(instructor2, "Gold");
    student24.addQualification(personalSurvival7);

    SwimStudent student25 = new SwimStudent("Yvonne Thompson", "Advanced");
    student25.setAttendedLesson(lesson9);
    students.add(student25);
    lesson9.getAttendingStudents().add(student25);
    DistanceSwim qualification25 = new DistanceSwim(instructor2, 1300);
    student25.addQualification(qualification25);
    PersonalSurvival personalSurvival8 = new PersonalSurvival(instructor2, "Silver");
    student25.addQualification(personalSurvival8);
}
   
// Method to display the main menu options
    private void displayMenu() {
        System.out.println("1. View swim student information");
        System.out.println("2. View swim lesson details");
        System.out.println("3. View instructor schedule");
        System.out.println("4. Add new swim student");
        System.out.println("5. Award swim qualification");
        System.out.println("6. Move swim student from waiting list");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

   // Method to handle user choice from the main menu
    private void handleUserChoice(int choice, Scanner scanner) {
        switch (choice) {
            case 1:
                viewSwimStudentInformation(scanner);
                break;
            case 2:
                viewSwimLessonDetails(scanner);
                break;
            case 3:
                viewInstructorSchedule(scanner);
                break;
            case 4:
                addNewSwimStudent(scanner);
                break;
            case 5:
                awardSwimQualification(scanner);
                break;
            case 6:
                moveSwimStudentFromWaitingList(scanner);
                break;
            case 7:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }


    // Method to view swim student information
    private void viewSwimStudentInformation(Scanner scanner) {
        System.out.println("Select a swim student:");
        List<SwimStudent> sortedStudents = new ArrayList<>(students);
        sortedStudents.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        for (int i = 0; i < sortedStudents.size(); i++) {
            SwimStudent student = sortedStudents.get(i);
            System.out.println(i + 1 + ". " + student.getName() + " (Level: " + student.getLevel() + ")");
        }
        int studentChoice = scanner.nextInt() - 1;
        if (studentChoice < 0 || studentChoice >= sortedStudents.size()) {
            System.out.println("Invalid choice.");
            return;
        }
        SwimStudent selectedStudent = sortedStudents.get(studentChoice);
        System.out.println("Student: " + selectedStudent.getName());
        if (selectedStudent.getAttendedLesson() != null) {
            System.out.println("Attended Lesson: " + selectedStudent.getAttendedLesson().getDay() + " " + selectedStudent.getAttendedLesson().getStartTime() + " (Level: " + selectedStudent.getAttendedLesson().getLevel() + ")");
            System.out.println("Instructor: " + selectedStudent.getAttendedLesson().getInstructor().getName());
        } else {
            System.out.println("Student is on the waiting list.");
        }
        System.out.println("Distance Swim Qualifications:");
        for (Qualification qualification : selectedStudent.getQualifications()) {
            if (qualification instanceof DistanceSwim) {
                DistanceSwim distanceSwim = (DistanceSwim) qualification;
                System.out.println("- " + distanceSwim.getDistance() + "m (Awarded by: " + distanceSwim.getAwardedBy().getName() + ")");
            }
        }
        if (selectedStudent.getLevel().equals("Advanced")) {
            System.out.println("Personal Survival Qualifications:");
            for (Qualification qualification : selectedStudent.getQualifications()) {
                if (qualification instanceof PersonalSurvival) {
                    PersonalSurvival personalSurvival = (PersonalSurvival) qualification;
                    System.out.println("- " + personalSurvival.getLevel() + " (Awarded by: " + personalSurvival.getAwardedBy().getName() + ")");
                }
            }
        }
    }

// Method to view swim lesson details

    private void viewSwimLessonDetails(Scanner scanner) {
        System.out.println("Select the day, time, and level of the swim lesson:");
        for (int i = 0; i < lessons.size(); i++) {
            SwimLesson lesson = lessons.get(i);
            System.out.println(i + 1 + ". " + lesson.getDay() + " " + lesson.getStartTime() + " (Level: " + lesson.getLevel() + ")");
        }
        int lessonChoice = scanner.nextInt() - 1;
        if (lessonChoice < 0 || lessonChoice >= lessons.size()) {
            System.out.println("Invalid choice.");
            return;
        }
        SwimLesson selectedLesson = lessons.get(lessonChoice);
        System.out.println("Lesson: " + selectedLesson.getDay() + " " + selectedLesson.getStartTime() + " (Level: " + selectedLesson.getLevel() + ")");
        System.out.println("Instructor: " + selectedLesson.getInstructor().getName());
        System.out.println("Attending Students:");
        for (SwimStudent student : selectedLesson.getAttendingStudents()) {
            System.out.println("- " + student.getName());
        }
        int availableSpaces = 4 - selectedLesson.getAttendingStudents().size();
        if (availableSpaces == 0) {
            System.out.println("The class is currently full.");
        } else {
            System.out.println("Spaces available: " + availableSpaces);
        }
    }

 // Method to view instructor schedule
private void viewInstructorSchedule(Scanner scanner) {
    System.out.println("Select an instructor:");
    List<Instructor> sortedInstructors = new ArrayList<>(instructors);
    sortedInstructors.sort((i1, i2) -> i1.getName().compareTo(i2.getName()));
    for (int i = 0; i < sortedInstructors.size(); i++) {
        Instructor instructor = sortedInstructors.get(i);
        System.out.println(i + 1 + ". " + instructor.getName());
    }
    int instructorChoice = scanner.nextInt() - 1;
    if (instructorChoice < 0 || instructorChoice >= sortedInstructors.size()) {
        System.out.println("Invalid choice.");
        return;
    }
    Instructor selectedInstructor = sortedInstructors.get(instructorChoice);
    System.out.println("Instructor: " + selectedInstructor.getName());
    System.out.println("Allocated Classes:");
    List<SwimLesson> instructorLessons = lessons.stream()
            .filter(lesson -> lesson.getInstructor().equals(selectedInstructor))
            .collect(Collectors.toList());

    List<String> daysOfWeek = Arrays.asList("Monday", "Wednesday", "Friday");
    instructorLessons.sort((l1, l2) -> {
        int day1Index = daysOfWeek.indexOf(l1.getDay());
        int day2Index = daysOfWeek.indexOf(l2.getDay());
        if (day1Index != day2Index) {
            return Integer.compare(day1Index, day2Index);
        }
        return l1.getStartTime().compareTo(l2.getStartTime());
    });

    for (SwimLesson lesson : instructorLessons) {
        System.out.println("- Day: " + lesson.getDay() + ", Time: " + lesson.getStartTime() + ", Level: " + lesson.getLevel());
        System.out.println("  Attending Students:");
        for (SwimStudent student : lesson.getAttendingStudents()) {
            System.out.println("  - " + student.getName());
        }
    }
}
// Method to add a new swim student
private void addNewSwimStudent(Scanner scanner) {
    System.out.print("Enter the name of the new student: ");
    scanner.nextLine(); // Consume the leftover newline character
    String name = scanner.nextLine();
    SwimStudent newStudent = new SwimStudent(name, "Novice");

    System.out.println("Novice-level lessons:");
    List<SwimLesson> noviceLessons = lessons.stream()
            .filter(lesson -> lesson.getLevel().equals("Novice"))
            .collect(Collectors.toList());

    for (SwimLesson lesson : noviceLessons) {
        int availableSpaces = 4 - lesson.getAttendingStudents().size();
        String status = (availableSpaces == 0) ? "Full" : "Spaces available: " + availableSpaces;
        System.out.println(lesson.getDay() + " " + lesson.getStartTime() + " (" + status + ")");
    }

    System.out.print("Enter the day and time of the desired lesson (e.g., Monday 17:00): ");
    String dayTime = scanner.nextLine();
    String[] parts = dayTime.split(" ");
    if (parts.length != 2) {
        System.out.println("Invalid input format. Adding the student to the waiting list.");
        waitingList.addStudent(newStudent);
        return;
    }

    String day = parts[0];
    String time = parts[1];

    SwimLesson selectedLesson = null;
    for (SwimLesson lesson : noviceLessons) {
        if (lesson.getDay().equalsIgnoreCase(day) && lesson.getStartTime().equals(time)) {
            selectedLesson = lesson;
            break;
        }
    }

    if (selectedLesson != null) {
        if (selectedLesson.getAttendingStudents().size() < 4) {
            selectedLesson.getAttendingStudents().add(newStudent);
            newStudent.setAttendedLesson(selectedLesson);
            students.add(newStudent);
            System.out.println("Student added to the lesson successfully.");
        } else {
            System.out.println("The selected lesson is full. Adding the student to the waiting list.");
            waitingList.addStudent(newStudent);
        }
    } else {
        System.out.println("Invalid day and time. Adding the student to the waiting list.");
        waitingList.addStudent(newStudent);
    }
}

// Method to award swim qualification to a student
   private void awardSwimQualification(Scanner scanner) {
    System.out.println("Select an instructor:");

    List<Instructor> sortedInstructors = new ArrayList<>(instructors);

    sortedInstructors.sort((i1, i2) -> i1.getName().compareTo(i2.getName()));

    for (int i = 0; i < sortedInstructors.size(); i++) {
        Instructor instructor = sortedInstructors.get(i);
        System.out.println(i + 1 + ". " + instructor.getName());
    }

    int instructorChoice = scanner.nextInt() - 1;

    if (instructorChoice < 0 || instructorChoice >= sortedInstructors.size()) {
        System.out.println("Invalid choice.");
        return;
    }

    Instructor selectedInstructor = sortedInstructors.get(instructorChoice);

    System.out.println("Select a swim student:");

    List<SwimStudent> sortedStudents = new ArrayList<>(students);

    sortedStudents.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));

    for (int i = 0; i < sortedStudents.size(); i++) {
        SwimStudent student = sortedStudents.get(i);
        System.out.println(i + 1 + ". " + student.getName() + " (Level: " + student.getLevel() + ")");
    }

    int studentChoice = scanner.nextInt() - 1;

    if (studentChoice < 0 || studentChoice >= sortedStudents.size()) {
        System.out.println("Invalid choice.");
        return;
    }

    SwimStudent selectedStudent = sortedStudents.get(studentChoice);

    if (selectedStudent.getLevel().equals("Advanced")) {
        System.out.println("Select the type of qualification:");
        System.out.println("1. Distance Swim");
        System.out.println("2. Personal Survival");

        int qualificationType = scanner.nextInt();

        if (qualificationType == 1) {
            System.out.println("Enter the distance (in meters):");
            int distance = scanner.nextInt();
            DistanceSwim qualification = new DistanceSwim(selectedInstructor, distance);
            selectedStudent.addQualification(qualification);
            System.out.println("Distance Swim qualification awarded successfully.");
        } else if (qualificationType == 2) {
            System.out.println("Enter the level (Bronze, Silver, Gold):");
            String level = scanner.next();
            PersonalSurvival qualification = new PersonalSurvival(selectedInstructor, level);
            selectedStudent.addQualification(qualification);
            System.out.println("Personal Survival qualification awarded successfully.");
        } else {
            System.out.println("Invalid qualification type.");
            return;
        }
    } else {
        System.out.println("Enter the distance (in meters):");
        int distance = scanner.nextInt();
        DistanceSwim qualification = new DistanceSwim(selectedInstructor, distance);
        selectedStudent.addQualification(qualification);
        System.out.println("Distance Swim qualification awarded successfully.");
    }

    if ((selectedStudent.getLevel().equals("Novice") && selectedStudent.getQualifications().stream().anyMatch(q -> q instanceof DistanceSwim && ((DistanceSwim) q).getDistance() >= 20))
            || (selectedStudent.getLevel().equals("Improver") && selectedStudent.getQualifications().stream().anyMatch(q -> q instanceof DistanceSwim && ((DistanceSwim) q).getDistance() >= 400))) {
        selectedStudent.setLevel(selectedStudent.getLevel().equals("Novice") ? "Improver" : "Advanced");
        waitingList.addStudent(selectedStudent);
        System.out.println("Student level updated and added to the waiting list.");
    }
}
 // Method to move a swim student from the waiting list to a lesson
  private void moveSwimStudentFromWaitingList(Scanner scanner) {
    if (waitingList.getWaitingStudents().isEmpty()) {
        System.out.println("No students on the waiting list.");
        return;
    }

    System.out.println("Select a swim student from the waiting list:");
    List<SwimStudent> sortedWaitingStudents = new ArrayList<>(waitingList.getWaitingStudents());
    sortedWaitingStudents.sort((s1, s2) -> {
        if (s1.getLevel().equals("Novice") && !s2.getLevel().equals("Novice")) {
            return -1;
        } else if (!s1.getLevel().equals("Novice") && s2.getLevel().equals("Novice")) {
            return 1;
        } else if (s1.getLevel().equals("Improver") && s2.getLevel().equals("Advanced")) {
            return -1;
        } else if (s1.getLevel().equals("Advanced") && s2.getLevel().equals("Improver")) {
            return 1;
        } else {
            return s1.getName().compareTo(s2.getName());
        }
    });
    for (int i = 0; i < sortedWaitingStudents.size(); i++) {
        SwimStudent student = sortedWaitingStudents.get(i);
        System.out.println(i + 1 + ". " + student.getName() + " (Level: " + student.getLevel() + ")");
    }
    int studentChoice = scanner.nextInt() - 1;
    if (studentChoice < 0 || studentChoice >= sortedWaitingStudents.size()) {
        System.out.println("Invalid choice.");
        return;
    }
    SwimStudent selectedStudent = sortedWaitingStudents.get(studentChoice);

    System.out.println("Available lessons for " + selectedStudent.getLevel() + " level:");
    List<SwimLesson> availableLessons = new ArrayList<>();
    for (SwimLesson lesson : lessons) {
        if (lesson.getLevel().equals(selectedStudent.getLevel()) && lesson.getAttendingStudents().size() < 4) {
            availableLessons.add(lesson);
            System.out.println(lesson.getDay() + " " + lesson.getStartTime() + " (Spaces available: " + (4 - lesson.getAttendingStudents().size()) + ")");
        }
    }
    if (availableLessons.isEmpty()) {
        System.out.println("No available lessons for the selected level.");
        return;
    }

    System.out.print("Enter the day and time of the desired lesson (e.g., Monday 17:00): ");
    scanner.nextLine(); // Consume the remaining newline character
    String dayTime = scanner.nextLine();
    String[] parts = dayTime.split(" ");
    if (parts.length != 2) {
        System.out.println("Invalid input format.");
        return;
    }
    String day = parts[0];
    String time = parts[1];
    for (SwimLesson lesson : availableLessons) {
        if (lesson.getDay().equalsIgnoreCase(day) && lesson.getStartTime().equals(time)) {
            if (selectedStudent.getAttendedLesson() != null) {
                selectedStudent.getAttendedLesson().getAttendingStudents().remove(selectedStudent);
            }
            lesson.getAttendingStudents().add(selectedStudent);
            selectedStudent.setAttendedLesson(lesson);
            waitingList.removeStudent(selectedStudent);
            if (!students.contains(selectedStudent)) {
                students.add(selectedStudent);
            }
            System.out.println("Student moved from the waiting list to the selected lesson.");
            return;
        }
    }
    System.out.println("Invalid day and time.");
}}


