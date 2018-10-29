import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.*;

// I know that the program has errors and won't run but I figured I would
// at least turn in what I had rather than nothing to show I made some effort
// I don't know how to fix the error that I have with the catch block.

public class savingForRetirement {

	public static void main(String[] args) {
		int years = getNumOfYears();
		Scanner input = new Scanner(System.in); // Sets up a scanner so it can get the users input
		//boolean continueInput = true;
		//do {
		//try {
		//System.out.print("Enter the amount of years before you plan on retiring: ");
		//int years = input.nextInt();
		//System.out.println("The number entered is: ");
		//continueInput = false;
		//if (years <= 0) {													// Error checking to make sure the user does not enter 0 or a negative number
			//System.out.println("You have entered a amount of years that are impossible please try again ");
			//return;
		//}
		//System.out.print("Enter the amount of money you put away annaully per year for retirement: ");
		//double money = input.nextDouble();
		
		//double retirementMoney = calcRetirementMoney(money, years); // Call to the function to do the calculations
	//}
		//catch(savingForRetirement1 ex){
			//System.out.println("You have entered a character not a number please try again");
			//input.nextLine();
		//}
		//} while(continueInput);
		//if (years <= 0) {													// Error checking to make sure the user does not enter 0 or a negative number
			//System.out.println("You have entered a amount of years that are impossible please try again ");
			//return;
		//}
		
		System.out.print("Enter the amount of money you put away annaully per year for retirement: ");
		double money = input.nextDouble();
		
		double retirementMoney = calcRetirementMoney(money, years); // Call to the function to do the calculations
	}
	public static int getNumOfYears() {
		Scanner input = new Scanner(System.in); // Sets up a scanner so it can get the users input
		boolean continueInput = true;
		try {
		System.out.print("Enter the amount of years before you plan on retiring: ");
		int years = input.nextInt();
		System.out.println("The number entered is: ");
		continueInput = false;
		//if (years <= 0) {													// Error checking to make sure the user does not enter 0 or a negative number
			//System.out.println("You have entered a amount of years that are impossible please try again ");
			//return;
		//}
		//System.out.print("Enter the amount of money you put away annaully per year for retirement: ");
		//double money = input.nextDouble();
		
		//double retirementMoney = calcRetirementMoney(money, years); // Call to the function to do the calculations
		}
		catch(savingForRetirement1 ex){
			System.out.println("You have entered a character not a number please try again");
			input.nextLine();
		}
		int years = 0;
		return years;
		}
	public static double calcRetirementMoney(double money, int years) {
		double interestRate = .05;
		double retirementMoney = (money * ((Math.pow(1.05, years) - 1 )/ interestRate)); // Formula for calculating the money the user will have at retirement
		System.out.println("The amount of money you will have at retirement is: $" + String.format("%.2f", retirementMoney)); // Displaying the final amount of money to the user
		return retirementMoney;														// ^^ Used to format the output of the money
	}
}
