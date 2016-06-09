import java.util.Scanner;

public class Distance
{
    public static void main(String[] args)
    {
        int x1, y1; 
        int x2, y2;
        float distance;
        final double COST = 0.43; // fixed constant
        float totalCost;
        
        // prompt user to enter distances
        Scanner scan = new Scanner(System.in);
        
        System.out.println ("Enter first X Coordinate: ");
        x1 = scan.nextInt();
        
        System.out.println ("Enter first Y Coordinate: ");
        y1 = scan.nextInt();
        
        System.out.println ("Enter second X Coordinate: ");
        x2 = scan.nextInt();
        
        System.out.println ("Enter second Y Coordinate: ");
        y2 = scan.nextInt();
        
        
        // computing the distance
        distance = (float) Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
        
        // computing the cost
        totalCost = (float) COST * distance;
        
        // printing out all information
        System.out.println();
        System.out.printf ("Distance between the points is: %.3f miles", distance);
        System.out.println();
        System.out.printf ("The travel cost is $%.3f", totalCost);
        System.out.println();
    }
}