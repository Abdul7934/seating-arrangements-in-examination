import java.util.Arrays;

public class ExamSeatingArrangement {

    public static void main(String[] args) {
        int numRows = 5;
        int numColumns = 3;

        // Create a 2D array to represent the seating arrangement
        String[][] seatingArrangement = new String[numRows][numColumns];

        // Fill the seating arrangement with student names or placeholders
        fillSeatingArrangement(seatingArrangement);

        // Display the seating arrangement
        displaySeatingArrangement(seatingArrangement);
    }

    // Method to fill the seating arrangement with placeholders
    private static void fillSeatingArrangement(String[][] arrangement) {
        int studentNumber = 1;

        for (int row = 0; row < arrangement.length; row++) {
            for (int col = 0; col < arrangement[row].length; col++) {
                // For simplicity, using "StudentX" as a placeholder
                arrangement[row][col] = "Student" + studentNumber++;
            }
        }
    }

    // Method to display the seating arrangement
    private static void displaySeatingArrangement(String[][] arrangement) {
        System.out.println("Exam Seating Arrangement:");

        for (int row = 0; row < arrangement.length; row++) {
            for (int col = 0; col < arrangement[row].length; col++) {
                System.out.print(arrangement[row][col] + "\t");
            }
            System.out.println();  // Move to the next row
        }
    }
}
