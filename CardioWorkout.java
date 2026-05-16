public class CardioWorkout extends Workout {

    private String activityType;
    private int caloriesBurned;
    private String intensity;

    public CardioWorkout() {
        super();
        this.activityType = "Running";
        this.caloriesBurned = 0;
        this.intensity = "Low";
    }

    public CardioWorkout(String date, int duration, String activityType, int caloriesBurned, String intensity) {
        super(date, duration);
        this.setActivityType(activityType);
        this.setCaloriesBurned(caloriesBurned);
        this.setIntensity(intensity);
    }

    public CardioWorkout(CardioWorkout other) {
        super(other.getDate(), other.getDuration());
        this.activityType = other.activityType;
        this.caloriesBurned = other.caloriesBurned;
        this.intensity = other.intensity;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    public boolean setCaloriesBurned(int caloriesBurned) {
        if (caloriesBurned >= 0) {
            this.caloriesBurned = caloriesBurned;
            return true;
        }
        return false;
    }

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CardioWorkout)) {
            return false;
        }

        CardioWorkout other = (CardioWorkout) obj;

        return this.getDate().equals(other.getDate()) &&
                this.getDuration() == other.getDuration() &&
                this.activityType.equals(other.activityType) &&
                this.caloriesBurned == other.caloriesBurned &&
                this.intensity.equals(other.intensity);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Activity: " + activityType +
                ", Calories: " + caloriesBurned +
                ", Intensity: " + intensity;
    }
}