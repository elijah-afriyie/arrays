public class Main {
    public static void main(String[] args) {
        String[][] favCars = new String[3][3];
        favCars[0][0] = "Bugatti";
        favCars[0][1] = "Lamborghini";
        favCars[0][2] = "Ferrari";
        favCars[1][0] = "BMW";
        favCars[1][1] = "Porche"; 
        favCars[1][2] = "F-150";
        favCars[2][0] = "Land Cruiser";
        favCars[2][1] = "Camarro";
        favCars[2][2] = "Bentley";

        for (int i = 0; i < favCars.length; i++) {
            System.out.println();
            for (int j = 0; j < favCars[i].length; j++) {
                System.out.print(favCars[i][j] + " ");
            }
        }
    }
}