import java.util.Scanner;

public class Methods_Exercise {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        //1 - Write a Java method to find the smallest number among three
        //numbers.
        System.out.println("Please Enter three numbers to find the smallest number of them: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        System.out.println("The smallest value is " + sumOfThreeNumbers(number1, number2, number3));

        //2 - Write a Java method that check if the entered number is negative or
        //positive or zero.
        System.out.println("Please, Enter a number to check if its positive, negative or zero: ");
        int checkNumber = input.nextInt();
        checkNumber(checkNumber);
        input.nextLine();

        //3 - Write a Java method to check whether a string is a valid password.
        System.out.println("Password rules: \n 1. A password must have at least eight characters. "
                + "\n 2. A password consists of only letters and digits. "
                + "\n 3. A password must contain at least two digits." +
                "\n Input a password (You are agreeing to the above Terms and\n" +
                "Conditions.): ");
        String password = input.nextLine();
        if(validPassword(password))
            System.out.println("password is valid");
        else
            System.out.println("password is invalid");

    }

    //Method 1
    public static int sumOfThreeNumbers(int number1, int number2, int number3){
        int min;
        if(number1 <number2 && number1 <number3)
            min = number1;
        else if(number2 <number1 && number2<number3)
            min = number2;
        else
            min = number3;
        return min;
    }

    //Method 2
    public static void checkNumber(int number){
        if(number < 0)
            System.out.println("Number " + number + " is negative ");
        else if(number > 0)
            System.out.println("Number " + number + " is positive ");
        else
            System.out.println("Number " + number + " is negative ");
    }

    //Method 3
    public static boolean validPassword(String password){
        int isDigitCount  = 0;
        if(password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                if(Character.isLetterOrDigit(password.charAt(i)))
                    if (Character.isDigit(password.charAt(i)))
                        isDigitCount++;
            }
        }
        return isDigitCount >= 2;
    }
}
