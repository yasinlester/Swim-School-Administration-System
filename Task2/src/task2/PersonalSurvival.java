package task2;


// Class representing a personal survival qualification
class PersonalSurvival extends Qualification {
    private String level;

 // Constructor for creating a new personal survival qualification
    public PersonalSurvival(Instructor awardedBy, String level) {
        super(awardedBy);
        this.level = level;
    }

    // Getter method for accessing the level of the qualification
    public String getLevel() {
        return level;
    }
}