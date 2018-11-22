//Matilda, Hansel and Derek were using a pedometer during the hike and they know how many steps they gave over the full hike. And they are curious about the average amount of steps and the final average distance.
//        Have the following points into consideration:
//        . The AverageCalculator has a calculateAverage method that receives a list of Integer and returns a Double that is the average.
//        . The StepGatherer asks three times for the number of steps and returns a list with those three Integers.
//        . The DistanceCalculator has a calculateDistance method that receives a number of steps as Double and returns the distance in kilometers as Double.
//        . The PedometerApplication has the main method and uses the other classes.
//        Develop that application.
//        Hints:
//        > One step is considered to be exactly 0.000762 kilometers.

        import java.util.List;

public class PedometerApplication {
    public static void main(String[] args) {
        AverageCalculator averageCalculator = new AverageCalculator();
        StepGatherer stepGatherer = new StepGatherer();
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        List <Integer> steps = stepGatherer.stepGatherer();
        Double average = averageCalculator.calculateAverage(steps);
        distanceCalculator.calculateDistance(average);


    }
}
