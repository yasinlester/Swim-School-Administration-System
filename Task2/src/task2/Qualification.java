package task2;


// Abstract class representing a qualification
abstract class Qualification {
    private Instructor awardedBy;


    // Constructor for creating a new qualification
    public Qualification(Instructor awardedBy) {
        this.awardedBy = awardedBy;
    }

// Getter method for accessing the instructor who awarded the qualification
    public Instructor getAwardedBy() {
        return awardedBy;
    }
}
