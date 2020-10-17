package ArrayCollege;

import java.util.Scanner;

// Write a program to store the elements in 1-D array and performed the operations like searching, sorting, and reversing the
// element .[Menu Driven]
public class One_A {
   static Scanner in=new Scanner(System.in);
   static int array[];
    public static void main(String[] args) {
        System.out.print("Enter The Size of array");
        int Size=in.nextInt();
         array=new int[Size];
    }
    static void insertValues(int Size)
    {
        System.out.println("Enter The values to Array");
        for(int i=0;i<Size;i++)
        {
            int tempvalue=in.nextInt();
            array[i]=tempvalue;
        }
    }
    static void printarray()
    {

    }
}
