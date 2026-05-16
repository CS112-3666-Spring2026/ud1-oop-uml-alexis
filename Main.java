public class Main {
    public static void main(String[] args) {

        CardioWorkout w1 = new CardioWorkout();

        CardioWorkout w2 = new CardioWorkout(
                "2026-05-13", 45 ,"Cycling", 350 ,"Medium"
        );

        CardioWorkout w3 = new CardioWorkout(w2);

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);

        w1.setActivityType("Swimming");
        w1.setCaloriesBurned(200);
        w1.setIntensity("High");

        System.out.println("w2 equals w3? " + w2.equals(w3));

        Workout workout = new CardioWorkout(
                "2026-05-13", 30 ,"Running", 250 ,"High"
        );

        System.out.println(workout);
    }
}