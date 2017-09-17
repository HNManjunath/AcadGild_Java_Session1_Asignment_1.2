/**
 * 
 */
package assignment1_2;

/**
 * @author MANJUNATH
 * This class will print the Hello World
 */
public class Assignment1_2 {

	/**
	 * Method to add two variables without using + operator
	 */
	public static int sumOfTwoNumbers(int x, int y) {
		return x - ~y - 1; // ' ~ ' is a complement operator.
	}

	public static void main(String[] args) {
		// Main method starts
		// TODO Auto-generated method stub
		int result = 0;
		System.out.println("Print the Result of two numbers without using + operator\n");
		result = sumOfTwoNumbers(90, -135);
		System.out.println("Result :: " + result);

		result = sumOfTwoNumbers(95, 135);
		System.out.println("Result :: " + result);

		result = sumOfTwoNumbers(-10, -30);
		System.out.println("Result :: " + result);

		result = sumOfTwoNumbers(9, -5);
		System.out.println("Result :: " + result);
	}

}
