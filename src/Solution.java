public class Solution {

    public static void main(String[] args) {
        VehicleWeightCheck(Cars.SECONDCAR, Roads.THIRDROAD);
    }

    public static void VehicleWeightCheck(Cars car, Roads road) {
        int[] carWeights = getCarsWeights();
        int[] roadWeights = getRoadsWeights();

        FirstRoadWeightCheck(road, car, carWeights, roadWeights);
    }

    public static void FirstRoadWeightCheck(Roads road, Cars car, int[] carWeights, int[] roadWeights) {
        try {
            for (int i = 0; i < carWeights.length; i++) {
                int carWeight = carWeights[i];
                int roadWeight = roadWeights[i];

                if (carWeight <= roadWeight && carWeight > 0) {
                    System.out.println("Car " + (i + 1) + " can go on the" + " " + (i + 1) + " " + "road");
                } else {
                    System.out.println("Car " + (i + 1) + " cannot go on the" + " " + (i + 1) + " " + "road");
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static int[] getCarsWeights() {
        int[] carWeights = {
                Cars.FIRSTCAR.getWeight(),
                Cars.SECONDCAR.getWeight(),
                Cars.THIRDCAR.getWeight(),
                Cars.FOURTHCAR.getWeight(),
                Cars.FIFTHCAR.getWeight()
        };
        return carWeights;
    }

    public static int[] getRoadsWeights() {
        int[] roadWeights = {
                Roads.FIRSTROAD.getWeight(),
                Roads.SECONDROAD.getWeight(),
                Roads.THIRDROAD.getWeight(),
                Roads.FOURTHROAD.getWeight(),
                Roads.FIFTHROAD.getWeight()
        };
        return roadWeights;
    }
}