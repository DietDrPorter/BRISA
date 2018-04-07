import java.util.ArrayList;
import java.util.Arrays;

public class Substring 
{
    public static void main(String[] args) 
    {

    /* 1)
     String s = "I'd go, but I'm broke.";

    char c1 = s.charAt(7);
    System.out.println(c1); //space

    char c2 = s.charAt(10);
    System.out.println(c2); //t

    int idx1 = s.indexOf(',');
    System.out.println(idx1); //6

    int idx2 = idx1 + 3;
    System.out.println(idx2); //9

    char c3 = s.charAt(idx1);
    System.out.println(c3); // comma

    char c4 = s.charAt(s.indexOf(c2) + 2);
    System.out.println(c4); // I

    char c5 = s.charAt(s.length() - 1);
    System.out.println(c5); //.

    int idx3 = s.indexOf('\'');
    System.out.println(idx3); //1

    int idx4 = s.indexOf("go");
    System.out.println(idx4); //4
     */

    //2)
    
        String s = "Given the circumstances, I'm not sure if it was a success, but it certainly seems promising.";
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        ArrayList<Integer> array3 = new ArrayList<Integer>();
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == ' ') 
            {
                array1.add(i);
            }
            if(s.charAt(i) == ',' || s.charAt(i) == '.')
            {
                array2.add(i);
            }
            if(s.charAt(i) == 'i') 
            {
                if(s.charAt(i+1) == 't') {
                    array3.add(i);
                }
            }
        }
        System.out.println(array1);
        System.out.println(array2);
        for(int idx : array3) 
        {
            System.out.println(s.charAt(idx));
        }
        System.out.println(array3); 

    //3)
    String[] words = s.split(" ");
    ArrayList<String> wordsList = new ArrayList<String>(Arrays.asList(words));
     System.out.println(wordsList);



    }
}