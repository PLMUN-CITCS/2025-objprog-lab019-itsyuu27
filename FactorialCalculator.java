import java.util.Scanner;

public class FactorialCalculator {

    public static int getNonNegativeInteger()
    {
        Scanner input = new Scanner(System.in);
        int userInput;

        do
        {
            System.out.print("Enter a non-negative integer: ");
            userInput = input.nextInt();

            if(userInput < 0)
            System.err.println("Invalid input, input must be non negative integer.");
        }while(userInput < 0);

        return userInput;
    }

    public static int calculateFactorial(int n)
    {
        int result = 1;

        if(n == 0)
        {
            return 1;
        }

        for(int i = 1; i <= n; i++ )
        {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args)
    {
        for(int i = 0; i < 2; i++)
        {
            int nonNegativeInteger = getNonNegativeInteger();
            
            System.out.println("The factorial of " + nonNegativeInteger + " is: " + calculateFactorial(nonNegativeInteger));
        }
    }
}
