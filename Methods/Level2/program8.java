import java.util.Scanner;

public class FriendsComparison {

    public static int findYoungest(int[] ages) {
        int min = ages[0];
        for (int age : ages) {
            if (age < min) {
                min = age;
            }
        }
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " (cm): ");
            heights[i] = sc.nextInt();
        }

        int youngest = findYoungest(ages);
        int tallest = findTallest(heights);

        System.out.println("Youngest age: " + youngest);
        System.out.println("Tallest height: " + tallest + " cm");

        sc.close();
    }
}