package task2;

import java.util.ArrayList;
import java.util.List;

// Class representing a waiting list for swim students

class WaitingList {
    private List<SwimStudent> waitingStudents;

 // Constructor for creating a new waiting list
    public WaitingList() {
        this.waitingStudents = new ArrayList<>();
    }

// Methods for adding and removing students from the waiting list
    public void addStudent(SwimStudent student) {
        waitingStudents.add(student);
    }

    public void removeStudent(SwimStudent student) {
        waitingStudents.remove(student);
    }

// Getter method for accessing the list of waiting students
    public List<SwimStudent> getWaitingStudents() {
        return waitingStudents;
    }
}