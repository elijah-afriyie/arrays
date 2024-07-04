````markdown
# Java 2D Array Example

This project demonstrates a Java program that uses a 2D array to store a predefined list of cars and prints them using nested `for` loops.

## Getting Started

Create a file named `Main.java` and paste the following code:

```java
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
```
````

Open a terminal and navigate to the directory containing `Main.java`. Compile the program using the following command:

```sh
javac Main.java
```

Run the program with the following command:

```sh
java Main
```

## Notes

- The 2D array `cars` is initialized with predefined car names.
- Nested `for` loops are used to iterate over the 2D array and print each car name.
- The outer loop iterates over the rows, and the inner loop iterates over the columns, printing each car name followed by a space.

```

```
