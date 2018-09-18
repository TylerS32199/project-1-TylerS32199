import java.text.DecimalFormat;
import java.util.Scanner;

public class savingForRetirement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Sets up a scanner so it can get the users input
		
		System.out.print("Enter the amount of years before you plan on retiring: ");
		int years = input.nextInt();
		if (years <= 0) {													// Error checking to make sure the user does not enter 0 or a negative number
			System.out.println("You have entered a amount of years that are impossible please try again ");
			return;
		}
		
		System.out.print("Enter the amount of money you put away annaully per year for retirement: ");
		double money = input.nextDouble();
		
		double retirementMoney = calcRetirementMoney(money, years); // Call to the function to do the calculations
	}
	public static double calcRetirementMoney(double money, int years) {
		double interestRate = .05;
		double retirementMoney = (money * ((Math.pow(1.05, years) - 1 )/ interestRate)); // Formula for calculating the money the user will have at retirement
		System.out.println("The amount of money you will have at retirement is: $" + String.format("%.2f", retirementMoney)); // Displaying the final amount of money to the user
		return retirementMoney;														// ^^ Used to format the output of the money
	}
}
