public class DistanceCalculator {


    public void  calculateDistance(Double avarage) {
        Double oneStep = 0.000762;
        Double  distance = (avarage * oneStep);
        System.out.println("You walked " + distance + " kilometer.");
    }
}
