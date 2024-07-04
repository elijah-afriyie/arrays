public class Main {
    public static void main(String[] args) {
        String[][] cars = {
            {"G-Wargon", "Range-Rover", "Rolls-Royce"},
            {"Bentley", "F-150-Raptor", "Porche"},
            {"Land-Cruiser", "Bugatti", "BMW-M4-Competition"}
        };
        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}