import java.util.Random;

public class FootballTeam {

    public static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min)
                min = num;
        }
        return min;
    }

    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random r = new Random();

        for (int i = 0; i < heights.length; i++) {
            heights[i] = r.nextInt(101) + 150; // 150–250
            System.out.println("Player " + (i+1) + " Height: " + heights[i]);
        }

        System.out.println("Sum: " + sum(heights));
        System.out.println("Mean: " + mean(heights));
        System.out.println("Shortest: " + shortest(heights));