package task2;

import java.util.ArrayList;
import java.util.List;

// Class representing a swim lesson
class SwimLesson {
    private String day;
    private String startTime;
    private String level;
    private List<SwimStudent> attendingStudents;
    private Instructor instructor;

  // Constructor for creating a new swim lesson
    public SwimLesson(String day, String startTime, String level, Instructor instructor) {
        this.day = day;
        this.startTime = startTime;
        this.level = level;
        this.instructor = instructor;
        this.attendingStudents = new ArrayList<>();
    }
// Getter methods for accessing swim lesson attributes
    public String getDay() {
        return day;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getLevel() {
        return level;
    }

    public List<SwimStudent> getAttendingStudents() {
        return attendingStudents;
    }

    public Instructor getInstructor() {
        return instructor;
    }
}