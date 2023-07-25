import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int sum = 0;
        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        sum = largest;

        System.out.println("The largest number is: " + sum);

	//Newly Added Code
	int sum1=num1+num2+num3;
	double avg= sum1/3.0;
	System.out.println("The Average of the three Numbers is: "+ avg);
    }
}