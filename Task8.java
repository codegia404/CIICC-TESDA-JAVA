public class Task8 {

    public static int sumOfCumulativeSums(int... numbers) {
        int grandTotal = 0;

        for (int num : numbers) {
            // Calculate the cumulative sum from 1 to num using the formula n*(n+1)/2
            int cumulativeSum = (num * (num + 1)) / 2;

            System.out.println("Parameter: " + num + " -> Cumulative Sum (1 to " + num + "): " + cumulativeSum);
            grandTotal += cumulativeSum;
        }

        return grandTotal;
    }

    public static void main(String[] args) {
        // Example test case provided: (4, 5, 10)
        // 4  -> 1 + 2 + 3 + 4 = 10
        // 5  -> 1 + 2 + 3 + 4 + 5 = 15
        // 10 -> 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
        // Total expected = 10 + 15 + 55 = 80

        System.out.println("--- Processing (4, 5, 10) ---");
        int total1 = sumOfCumulativeSums(4, 5, 10);
        System.out.println("Grand Total: " + total1 + "\n");

        System.out.println("--- Processing (3, 6) ---");
        int total2 = sumOfCumulativeSums(3, 6);
        System.out.println("Grand Total: " + total2);
    }
}

    
