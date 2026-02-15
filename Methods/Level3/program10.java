import java.util.Scanner;

public class CollinearPoints {

    // Method 1: Using Slope Formula
    public static boolean checkCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        double slopeBC = (double)(y3 - y2) / (x3 - x2);
        double slopeAC = (double)(y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    // Method 2: Using Area of Triangle Formula
    public static boolean checkCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1 y1:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter x2 y2:");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Enter x3 y3:");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        if (checkCollinearSlope(x1,y1,x2,y2,x3,y3))
            System.out.println("Collinear using Slope Method");
        else
            System.out.println("Not Collinear using Slope Method");

        if (checkCollinearArea(x1,y1,x2,y2,x3,y3))
            System.out.println("Collinear using Area Method");
        else
            System.out.println("Not Collinear using Area Method");

        sc.close();
    }
}