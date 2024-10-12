package task2;

import java.util.ArrayList;
import java.util.List;

// Class representing a swim student
class SwimStudent {
    private String name;
    private String level;
    private SwimLesson attendedLesson;
    private List<Qualification> qualifications;

// Constructor for creating a new swim student
    public SwimStudent(String name, String level) {
        this.name = name;
        this.level = level;
        this.qualifications = new ArrayList<>();
    }

// Getter and setter methods for accessing and modifying swim student attributes
    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public SwimLesson getAttendedLesson() {
        return attendedLesson;
    }

    public void setAttendedLesson(SwimLesson attendedLesson) {
        this.attendedLesson = attendedLesson;
    }

    public List<Qualification> getQualifications() {
        return qualifications;
    }

    public void addQualification(Qualification qualification) {
        qualifications.add(qualification);
    }
}