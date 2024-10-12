package task2;

import java.util.ArrayList;
import java.util.List;

// Class representing a swim instructor
class Instructor {
    private String name;
    private List<SwimLesson> assignedLessons;

  // Constructor for creating a new instructor
    public Instructor(String name) {
        this.name = name;
        this.assignedLessons = new ArrayList<>();
    }

// Getter method for accessing the instructor's name
    public String getName() {
        return name;
    }

// Getter method for accessing the list of assigned lessons
    public List<SwimLesson> getAssignedLessons() {
        return assignedLessons;
    }

// Method for adding a lesson to the instructor's assigned lessons
    public void addAssignedLesson(SwimLesson lesson) {
        assignedLessons.add(lesson);
    }
}