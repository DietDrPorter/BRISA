 import java.util.Scanner;

class Plinko {
    public static final int SINGLE_DISC = 1;
    public static final int MULTI_DISC = 2;
    public static final int TERMINATE = 3;

    public static final int[] VALUES = {1, 3, 2, 0, 5, 0, 2, 3, 1};
    public static int[] results = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    public static int mode = -1;
    public static int position = -1;
    public static int discs = -1;
    

    public static void main(String[] args) {
        Scanner scan;
        while(true) {
            //Loop to select mode.
            //This loop is infinite until the user selects the "Quit" option (3)
            scan = new Scanner(System.in);
            printModeStatement();
            if(scan.hasNextInt()) {
                mode = scan.nextInt();
                if(mode == SINGLE_DISC) {
                    singleDisc();
                }
                else if(mode == MULTI_DISC) {
                    multiDisc();
                }
                else if(mode == TERMINATE) {
                    System.out.println("Goodbye");
                    break;
                } else {
                    continue;
                }
            }
        }
    }
        public static void userInput() {
           while (true) {
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Select a number 0-8:");
                if(scan1.hasNextInt()) {
                       position = scan1.nextInt();
                       position *= 2;
                    if (position > 8 || position < 0) {
                            break;
                        }
                      
                }
            }    
        }

        public static void discAmount() {
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Enter the number of disks:");
            int discs = scan2.nextInt();
        }

    public static int runEvenRow(int position) {
       System.out.println("|");
       for(int i = 0; i <= 16; i++) {
             if(position == i) {
                System.out.print("O");
             }
            else if(isEven(i)) {
                System.out.print(" ");
             }
             else {
                System.out.print(".");
            }
        }
        System.out.print("\n");

        return position;
    }

    public static int runOddRow(int position) {
        System.out.print("|");
        for(int i = 0; i <= 16; i++) {
             if(position == i) {
                System.out.print("O");
             }
            else if(isEven(i)) {
                System.out.print(" ");
             }
             else {
                System.out.print(".");
            }
        }
        System.out.print("|");
        System.out.print("\n");


        return position;
    }

    public static Boolean isEven(int x) {
        return x % 2 == 0;
    }
    
    public static void discRun() {
        runEvenRow(position);
        for(int i =1; i <13; i++){
            if(position ==16) {
                position--;
            }
            else if(position ==0){
                position++;
            }
            else if(Math.random()> .5){
                position++;
            }
            else {
                position --;
            }
            if(isEven(i)){
                runEvenRow(position);
            }
            else {
                runOddRow(position);
            }
        }
    }

        public static void multiProb() { //Runs the Multi Disc to achieve statistics 

        for(int n = 1; n <= discs; n++) {
            for(int i = 1; i < 13; i++) {
                if(position == 16) {
                    position--;
                }
                 else if(position == 0) {
                    position++;
                }
                 else if(Math.random() > .5) {
                    position++;
                } else {
                    position--;
                }
            }
            results[position/2]++;
        }

    }

     public static void singleDisc() {
       
         userInput();
         discRun();

         System.out.println("Disc results:" +position/2);
        }
 
    public static void multiDisc() {

        userInput();
        discAmount();
        multiProb();

        System.out.println("You landed in position 1: "+results[0]+" times.");
        System.out.println("You landed in position 2: "+results[1]+" times.");
        System.out.println("You landed in position 3: "+results[2]+" times.");
        System.out.println("You landed in position 4: "+results[3]+" times.");
        System.out.println("You landed in position 5: "+results[4]+" times.");
        System.out.println("You landed in position 6: "+results[5]+" times.");
        System.out.println("You landed in position 7: "+results[6]+" times.");
        System.out.println("You landed in position 8: "+results[7]+" times.");
        System.out.println("You landed in position 9: "+results[8]+" times.");
        System.out.println("Total points earned: " + VALUES[position/2]);

    }    

    public static void printModeStatement() {
        System.out.print(
            "Select a mode:\n"
            + "\t(1) Single disc\n"
            + "\t(2) Multiple discs\n"
            + "\t(3) Quit\n"
        );
    }
 
    
}


