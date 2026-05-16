public abstract class Workout {
    private String date;
    private int duration;

    public Workout() {
        this.date = "Unknown";
        this.duration = 0;
    }

    public Workout(String date, int duration) {
        this.setDate(date);
        this.setDuration(duration);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public boolean setDuration(int duration) {
        if (duration >= 0) {
            this.duration = duration;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Date: " + date + ", Duration: " + duration + " min";
    }
}