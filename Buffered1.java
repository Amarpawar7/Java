// this will generate error while copilation coz of checked exception, this code must contain try catch error

import java.io.*;


class Buffered1{
    public static void main(String A[])
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
               
        System.out.println("Enter your name : ");
        String name = bobj.readLine(); //Checked Exception

        System.out.println("Hello "+name);


    }
}
