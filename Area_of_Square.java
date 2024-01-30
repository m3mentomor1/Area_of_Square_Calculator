import java.util.Scanner;

public class Area_of_Square 
{
	public static void main(String[] args) 
    {
		/*
		 * Formula:
		 * A = side x side
		 */

        Scanner length = new Scanner(System.in); 
        System.out.println("Enter side length: "); // Input
        double side_length = length.nextDouble();
        length.close();

		System.out.println("The area of the square is " + (side_length*side_length) + " m^2");
	}
}
