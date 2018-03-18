import java.util.*; 
class Lists {

   
   public static ArrayList<Integer> toDoList = new ArrayList<Integer>();
        


    public static final int Add = 1;

    public static final int Remove = 2;

    public static final int Quit = 3;

    public static String item = "";
    public static int removeItem = -1;
    public static int mode = -1;

    public static void main(String[] args) {
        //ArrayList<Integer> toDoList = new ArrayList<Integer>();
        Scanner scan;
        while(true) {
            //Loop to select mode.
            //This loop is infinite until the user selects the "Quit" option (3)
            scan = new Scanner(System.in);
            printModeStatement();
            if(scan.hasNextInt()) {
                mode = scan.nextInt();
                if(mode == Add) {
                    addItem();
                }
                else if(mode == Remove) {
                    removeItem();
                }
                else if(mode == Quit) {
                    System.out.println("Goodbye");
                    break;
                } else {
                    continue;
                }
            }
        }
    }

    public static void addItem() {
        Scanner scan2;
        while(true) {
            scan2 = new Scanner(System.in);
            System.out.println("Add an item");
            item = scan2.nextLine();
            toDoList.add(item);
            break;
        }
     }
            
    public static void removeItem() {
        Scanner scan3;
        while(true){
            System.out.println("Which item would you like to remove?");
            removeItem = scan3.nextInt();
            if(-1 < removeItem && removeItem < toDoList.size()) {
                 toDoList.remove(removeItem);
                 break;
            }
        }
    }
        
    




    
    
    public static void printModeStatement() {
        System.out.print(
            "Select a mode:\n"
            + "\t(1) Add Item\n"
            + "\t(2) Remove Item\n"
            + "\t(3) Quit\n"
        );
       
        Scanner scan1;
        while(true) { 
            scan1 = new Scanner(System.in);
             for(int i = 0; i < toDoList.size(); i++) {
                System.out.println("[" + i + "] " + toDoList.get(i));
            }
            
        }
    }





       /*  System.out.print(list);
            numList.add(5);
            numList.add(0,10);
            numList.add(1,15);
            numList.remove(1);
            numList.add(20);
            numList.add(1,5);
            numList.add(0, 30);
            numList.add(3, 35);
            numList.remove(2);
            list.size()-1; */

    } 



