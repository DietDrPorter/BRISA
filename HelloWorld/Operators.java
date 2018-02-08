class Operators {
    public static void main(String args[]) {

//int targetSavingsGoal = -30000;
//int savingPerMonth = -500;

//int monthsUntilGoal = targetSavingsGoal / savingPerMonth;

//System.out.println(monthsUntilGoal);
//System.out.println("Months Until Goal");

//String firstName = "Brisa" ;
//String connect = "and";
//String friendName = "Kim";
//String were = "were";
//String comeBack= "holding on";
//String to = "to";
//String what = "what";
//String we = "we";
//String right = "persume";
//String is = "is";
//String all = "all";
//String that = "that";
//String noun = "worthless";

//String scentenceOne = firstName + " " + connect + " " + friendName + " " + were + " " + comeBack + " " + to + " " + what + " " + we  + " " ;
//System.out.println(scentenceOne);

int loanAmount = 50000;
double interestRate = .08;
int loanPaybackPeriod = 12;
double interestPerMonth = loanAmount * interestRate / loanPaybackPeriod;
double totalLoan = loanAmount + interestPerMonth;

System.out.println(interestPerMonth);
System.out.println("Interest Per Month");
System.out.println(totalLoan);
System.out.println("Total Loan");

    }
}
