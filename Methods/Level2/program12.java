public class RandomArrayStats {

    // Method to generate 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + (int)(Math.random() * 9000);
        }

        return numbers;
    }

    // Method to find average, min, max
    public static double[] findAverageMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;

            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;

        return new double[]{average, min, max};
    }

    public static void main(String[] args) {

        int size = 5;

        int[] randomNumbers = generate4DigitRandomArray(size);

        System.out.println("Generated Numbers:");
        for (int num : randomNumbers) {
            System.out.println(num);
        }

        double[] result = findAverageMinMax(randomNumbers);

        System.out.println("\nAverage: " + result[0]);
        System.out.println("Minimum: " + (int)result[1]);
        System.out.println("Maximum: " + (int)result[2]);
    }
}