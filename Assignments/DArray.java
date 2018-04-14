import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.Math.pow;

class DArray {
    public static void main(String[] args) 
    {
    /*   //Example - Contents of a 3x3 array of zeros
    //[0,0,0]
    //[0,0,0]
    //[0,0,0]

    int[][] arr1 = new int[3][3];

    for(int i = 0; i < arr1.length; i++) {
        for(int j = 0; j < arr1[i].length; j++) {
            arr1[i][j] = (i * 2) * (j * 2);
        }
    }
    //[0,0,0]
    //[0,4,8]
    //[0,8,16]

    int[][] arr2 = new int[3][3];
    for(int i = 0; i < arr2.length; i++) {
        for(int j = 0; j < arr2[i].length; j++) {
            arr2[i][j] = arr1[i][j] * arr1[i][j];
        }
    }
    //[0,0,0]
    //[0,1,4]
    //[0,2,16]
    int[][] arr3 = new int[4][4];

    int num = 1;
    for(int i = 0; i < arr3.length; i++) {
        for(int j = 0; j < arr3[i].length; j++) {
            arr3[i][j] = num; 
            num *= 2;
        }
    }
    //[2,4,8]
    //[16,32,64]
    //[2,2,2]
    //[2,2,2] 

        int num = 3;
    for(int i = 0; i < arr3.length; i++) {
        for(int j = 0; j < arr3[i].length; j++) {
            arr3[i][j] = num; 
            num *= 3;
        }
    }
   int[][] arr2 = new int[5][5];
    for(int i = 0; i < arr2.length; i++) {
        for(int j = 0; j < arr2[i].length; j++) {
            arr3[i][j] = num; 
            num -= 1; */
        }
    }
    //2] mat = matrix
        int s = 1;
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat[i].length; j++)
            {
                mat[i][j] = s;
                s++;
            }
        }
        reverseMatrix(mat);
    }


    public static int[][] reverseMatrix(int[][] mat) 
    {
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++) {
                int t = mat[i][j];
                mat[i][j] = mat[i][mat[i].length - i - 1];
                mat[i][mat[j].length - i - 1] = t;
            }
        }
        return mat;
    }

}    

