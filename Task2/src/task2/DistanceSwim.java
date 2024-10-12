package task2;

// Class representing a distance swim qualification
class DistanceSwim extends Qualification {
    private int distance;

// Constructor for creating a new distance swim qualification
    public DistanceSwim(Instructor awardedBy, int distance) {
        super(awardedBy);
        this.distance = distance;
    }

// Getter method for accessing the distance of the qualification
    public int getDistance() {
        return distance;
    }
}