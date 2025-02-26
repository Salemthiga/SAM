import java.util.Random;

class Main {
    public static void main(String[] args) {
        int rolls = 1000;
        int[] frequency = new int[6]; // Array to store frequency of each face (1-6)
        Random random = new Random();

        // Roll the die 1000 times
        for (int i = 0; i < rolls; i++) {
            int face = random.nextInt(6) + 1; // Generates 1-6
            frequency[face - 1]++;
        }

        // Display results in a table
        System.out.println("-------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s%n", "Face", "Frequency", "Percentage");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < 6; i++) {
            double percentage = (double) frequency[i] / rolls * 100;
            System.out.printf("%-10d %-10d %-10.2f%%%n", (i + 1), frequency[i], percentage);
        }

        // Display totals
        System.out.println("-------------------------------------------------");
        System.out.printf("%-10s %-10d %-10.2f%%%n", "Total", rolls, 100.0);
    }
}