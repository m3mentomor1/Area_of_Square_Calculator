
/*  ------------------------------------------------------
 *	File Name: Area_of_Square.java
 *  ------------------------------------------------------
 *  Date Created: 01-21-2021
 *  ------------------------------------------------------
 *  Description:
 *  This program is a calculator that calculates the 
 *  area of a square based on the side length provided 
 *  by the user.
 *  ------------------------------------------------------ */

import java.util.Scanner;

public class Area_of_Square 
{
	public static void main(String[] args) 
    {
		/*
		 * Formula:
		 * A = (side x side)
		 */

        Scanner length = new Scanner(System.in); 
        System.out.println("Enter side length: "); // Input
        double side_length = length.nextDouble();
        length.close();

		System.out.println("The area of the square is " + (side_length*side_length) + " m^2");
	}
}