import java.util.Scanner;

public class LoanCalculator{
    public static int mode = -1;
    public static double loanAmt = -1;
    public static int loanTerm = -1;
    public static double interestRate = -1;
    public static double totalLoan = -1;
    public static double interesttotal = -1;
    public static double loanLeft = -1;
   

    public static void main(String[] args) {
        //Read in the loan calculation mode
        Scanner scan;
        while(true) { //Loop the mode selection menu until a valid input is provided
            scan = new Scanner(System.in);
            printModeStatement(); //Call a function to print our mode selection statement
            if(scan.hasNextInt()) { //Check if input provided is a valid integer
                mode = scan.nextInt();
                if(0 < mode && mode < 4) { //Check if input provided is 1, 2, or 3
                    break; //Valid input has been provided. Break out of the while loop
                }
            }
            //If it reaches here, the input was invalid. Loop again.
        }

   
        System.out.println("You selected mode " + mode);

    
        if(mode == 1) {
            flatInterest();
        }
        if(mode == 2) {
            cmpndWOInterest();
        }
        if(mode == 3) {
            cmpndWInterest();
        }
        
    }

         public static void printModeStatement() {
         System.out.println(
            "Select an interest calculation mode:\n"
            + "(1) Flat Interest\n"
            + "(2) Compounding Interest Without Monthly Payments\n"
            + "(3) Compounding Interest With Monthly Payments\n"
        );
    }

    public static void flatInterest() {

        Scanner scan;
        while(true) { 
            scan = new Scanner(System.in);
            System.out.println("Enter your loan amount:");
            if(scan.hasNextDouble()) { 
                loanAmt = scan.nextDouble();
                if(0 < loanAmt) { 
                    break; 
                }
            }
            
        }

        while(true) { 
            scan = new Scanner(System.in);
            System.out.println("Enter your loan term (years):");
            if(scan.hasNextInt()) { 
                loanTerm = scan.nextInt();
                if(0 < loanTerm) {

                    break;
                }
            }
            
        }

        
        while(true) { 
            scan = new Scanner(System.in);
            System.out.println("Enter your interest rate (%):");
            if(scan.hasNextDouble()) { 
                interestRate = scan.nextDouble();
                if(0 < interestRate) { 
                    break; 
                }
            }
            
        }

        double interestPercent = interestRate / 100;
        double loanMonths = loanTerm * 12;
        double interesttotal =  interestPercent * loanAmt * loanTerm;
        double totalLoan = loanAmt + interesttotal;
        

        System.out.println("You selected mode " + mode);
        System.out.println("Original Loan Amount:" + loanAmt);
        System.out.println("Loan Term:" + loanTerm);
        System.out.println("Interest Rate:"+ interestRate);
        System.out.println("Interest to be Paid:" + interesttotal);
        System.out.println("Total Loan:" + totalLoan);
    } 

    
    public static void cmpndWOInterest() {

        Scanner scan;
        while(true) { 
            scan = new Scanner(System.in);
            System.out.println("Enter your loan amount:");
            if(scan.hasNextDouble()) { 
                loanAmt = scan.nextDouble();
                if(0 < loanAmt) { 
                    break; 
                }
            }
            
        }

        while(true) { 
            scan = new Scanner(System.in);
            System.out.println("Enter your loan term (years):");
            if(scan.hasNextInt()) { 
                loanTerm = scan.nextInt();
                if(0 < loanTerm) {

                    break;
                }
            }
            
        }

        
        while(true) { 
            scan = new Scanner(System.in);
            System.out.println("Enter your interest rate (%):");
            if(scan.hasNextDouble()) { 
                interestRate = scan.nextDouble();
                if(0 < interestRate) { 
                    break; 
                }
            }
            
        }

        double interestPercent = interestRate / 100;
        double loanMonths = loanTerm * 12;
        double loanTotal = loanAmt * Math.pow(1 + (interestPercent / 12), loanMonths);
        double totalInterest = loanTotal - loanAmt;



        System.out.println("You selected mode " + mode);
        System.out.println("Original Loan Amount:" + loanAmt);
        System.out.println("Loan Term:" + loanTerm);
        System.out.println("Interest Rate:"+ interestRate);
        System.out.println("Interest to be Paid:" + totalInterest);
        System.out.println("Total Loan:" + loanTotal);
    } 

    public static void cmpndWInterest() {

        Scanner scan;
        while(true) { 
            scan = new Scanner(System.in);
            System.out.println("Enter your loan amount:");
            if(scan.hasNextDouble()) { 
                loanAmt = scan.nextDouble();
                if(0 < loanAmt) { 
                    break; 
                }
            }
            
        }

        while(true) { 
            scan = new Scanner(System.in);
            System.out.println("Enter your loan term (years):");
            if(scan.hasNextInt()) { 
                loanTerm = scan.nextInt();
                if(0 < loanTerm) {

                    break;
                }
            }
            
        }

        
        while(true) { 
            scan = new Scanner(System.in);
            System.out.println("Enter your interest rate (%):");
            if(scan.hasNextDouble()) { 
                interestRate = scan.nextDouble();
                if(0 < interestRate) { 
                    break; 
                }
            }
            
        }

        
        double interestPercent = interestRate / 100;
        double ratePerMonth = interestPercent /12;
        double loanMonths = loanTerm * 12;
        double monthlyPayment = 1 + loanAmt * (ratePerMonth / (1 - Math.pow((1 + ratePerMonth), (loanTerm * -12)))); 
        double remainder = loanAmt;
        
        while(remainder > 0) {
            double monthlyInterest = remainder * (interestPercent / 12);
            remainder = remainder + monthlyInterest - monthlyPayment;
            interesttotal = interesttotal + monthlyInterest; 
            if(remainder == 0 ) {
                
                break;
            }
            
        }
        double totalLoan = loanAmt + interesttotal;
        double finalMonth = (monthlyPayment*12*loanTerm) - (monthlyPayment + totalLoan); 
       

        System.out.println("You selected mode " + mode);
        System.out.println("Loan Term:" + loanTerm);
        System.out.println("Monthly Payment:"+ monthlyPayment);
        System.out.println( "Payment made in the final month: " + finalMonth);
        System.out.println("Interest to be Paid:" + interesttotal);
        System.out.println("Total Loan:" + totalLoan);
        
        
      
        



          
    } 

}
