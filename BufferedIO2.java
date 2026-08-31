// this will generate error while copilation coz of checked exception, this code must contain try catch block or throws  

import java.io.*;


class BufferedIO2{
    public static void main(String A[]) throws IOException
    {
        //  1 : 
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        // // or 2 :
        // InputStreamReader iobj = new InputStreamReader(System.in);
        // BufferedReader bobj = new BufferedReader(iobj);

        
               
        System.out.println("Enter your name : ");
        String name = bobj.readLine(); //Checked Exception

        System.out.println("Hello "+name);


    }
}
