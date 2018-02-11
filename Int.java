import java.util.Scanner;



class ValidationUtils {

    public static void main(String args[]) {

        System.out.print("Enter an integer: ");

        Scanner scan = new Scanner(System.in);

        if(isValidInt(scan)) {

            System.out.println("Integer Success!");

        }

        else {

            System.out.println("Integer Failure!");

        }

    }



    

    public static Boolean isValidInt(Scanner scan) {

        try {

            int i = scan.nextLine();

        }

        catch(Exception e) {

            return false; //An error was raised. The user input could not be read as a String.

        }

        return true; //No error was raised. The scanner read it successfully as a String.

    }

}
