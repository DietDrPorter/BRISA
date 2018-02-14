//import java.util.Scanner;



//class ValidationUtils {

    //public static void main(String args[]) {

        //System.out.print("Enter an integer: ");

        //Scanner scan = new Scanner(System.in);

        //if(isValidInt(scan)) {

           // System.out.println("Integer Success!");

       // }

      //  else {

          //  System.out.println("Integer Failure!");

       // }

   // }



    

   // public static Boolean isValidInt(Scanner scan) {

       // try {

           // int i = scan.nextInt();

       // }

       // catch(Exception e) {

           // return false; //An error was raised. The user input could not be read as a String.

       // }

      //  return true; //No error was raised. The scanner read it successfully as a String.

    //}

//}

//import java.util.Scanner;

//class ValidationUtils {
   // public static void main(String args[]) {
      //  System.out.print("Enter a double: ");
      //  Scanner scan = new Scanner(System.in);
        //if(isValidDouble(scan)) {
            //System.out.println("Double Success!");
        //}
        //else {
            //System.out.println("Double Failure!");
       // }
   // }

    
   // public static Boolean isValidDouble(Scanner scan) {
     //   try {
          //  double d = scan.nextDouble();
       // }
       // catch(Exception e) {
          //  return false; //An error was raised. The user input could not be read as a String.
       // }
       // return true; //No error was raised. The scanner read it successfully as a String.
   // }
//}



import java.util.Scanner;

class ValidationUtils {
    public static void main(String [] args) {
       
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Boolean: ");
        
        if(isValidBoolean(scan)) {
            System.out.println("Boolean Success!");
        }
        else {
            System.out.println("Boolean Failure!");
        }
    }

    
   // public static Boolean isValidBoolean(Scanner scan) {
        try {
            String s = scan.nextLine();
            
    
             
        }
        catch(Exception e) {
            return false; //An error was raised. The user input could not be read as a String.
        }
        return true; //No error was raised. The scanner read it successfully as a String.
    }
public static Boolean isValidBoolean(Scanner scan) {
     String s = scan.nextLine();
       return (

         

         s.toLowerCase().equals("t")||
         s.toLowerCase().equals("f")||
         s.toLowerCase().equals("true")||
         s.toLowerCase().equals("false")||
         s.toLowerCase().equals("0")||
         s.toLowerCase().equals("1"));
    }
             
}


