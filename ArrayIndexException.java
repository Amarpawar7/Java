import java.util.*;

class ArrayIndexException{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {11,21,51,101,111};


        System.out.println("Enter the index of array : ");
        int Index = sobj.nextInt();

        try
        {
            System.out.println("Inside try block");
            System.out.println("Element at the Index is : "+Arr[Index]);
        }
        catch(ArrayIndexOutOfBoundsException aobj)
        {
            // System.out.println("Inside catch block");
            System.out.println("Enception occured : "+aobj);
        }
        System.out.println("End of application");

        

    }
}
