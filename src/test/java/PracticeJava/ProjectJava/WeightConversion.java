package PracticeJava.ProjectJava;

import java.util.Scanner;

public class WeightConversion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double weight;
		double newWeight;
		System.out.println("Weight Conversion Program");
		System.out.println("1: Convert lbs to kgs");
		System.out.println("2: Convert kgs to lbs");
		System.out.print("Choose an option: ");
		double choice = scan.nextInt();
		if (choice == 1) {
			System.out.print("Enter the weight in lbs: ");
			weight = scan.nextDouble();
			newWeight = weight * 0.4535922;
			System.out.printf("The new weight in kgs is : %.2f", newWeight);
		} else if (choice == 2) {
			System.out.print("Enter the weight in kgs: ");
			weight = scan.nextDouble();
			newWeight = weight / 0.4535922;
			System.out.printf("The new weight in lbs is : %.2f", newWeight);
		} else
			System.out.println("Enter the valid choice.");
		scan.close();
	}
}
