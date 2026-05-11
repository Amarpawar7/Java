import java.util.Scanner;

class DynamicMemory{

    public static void main (String A[]){

        Scanner sobj = new Scanner(System.in);

        int Size = 0;
        
        System.out.println("Enter number of elements : \n");

        Size = sobj.nextInt();    // input

        // Dynamic Memory Allocation 

        float Marks[] = new float[Size];

        // Use the memory
        System.out.println("Enter your Marks : \n");

        
        Marks = null;
        System.gc();


    }
}