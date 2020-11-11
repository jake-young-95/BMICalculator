/** In this program, we will allow the user to enter their weight, height in feet followed by inches, 
 * and display the BMI to the user followed by if the BMI is normal or otherwise
 * Step 1.) Import Scanner
 * Step 2.) Create the Scanner within the program
 * Step 3.) Prompt the user to enter the values weight and height
 * Step 4.) Calculate BMI using the entered values
 * 			a.) To do this we need to convert the weight from pounds to kilograms (1 kilogram = 2.20462 pounds)
 * 			b.) We will then convert height from feet to inches and add the additional inches
 * 			c.) We will then convert the centimeters to meters
 * 			d.) We will then divide the weight in kilograms by height in meters squared. 
 * Step 5.) Display these values to the user as well as if it is normal or not
 * 
 */

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		
		// Create the Scanner
		Scanner in = new Scanner(System.in);
		
		// Prompt the user to enter their weight
		System.out.println("Enter your weight in pounds: ");
		double weight = in.nextDouble();
		
		// Prompt the user to enter their height in feet followed by inches
		System.out.println("Enter your height in feet followed by inches: ");
		double heightFeet = in.nextDouble();
		double heightInches = in.nextDouble();
		
		// Calculate BMI
		double weightKilograms = weight * 0.45359237; // convert pounds to kg
		double heightCentimeters = (heightFeet * 12 + heightInches) * 2.54; // Convert height to inches then to centimeters
		double heightMeters = heightCentimeters / 100; // Convert height in Centimeters to meters
		double bodyMassIndex = weightKilograms / Math.pow(heightMeters, 2); // Calculate BMI
		
		// Display BMI to the User
		System.out.println("Your BMI is: " + bodyMassIndex);
		
		// Determine if the BMI is 
		if (bodyMassIndex < 18.5)
			System.out.println("Underweight");
			else if (bodyMassIndex < 24.9)
				System.out.println("Normal Weight");
			else if (bodyMassIndex < 30)
				System.out.println("Overweight");
			else
				System.out.println("Obese");
		}
	
	}

