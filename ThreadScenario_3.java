class Demo implements Runnable
{
    public void first(){
        System.out.println("Inside first method");
    }

}


class ThreadScenario_3
{
    public static void main(String A[])
    {
        System.out.println("Main thread is running");
        
        Demo dobj = new Demo();

        Thread tobj = new Thread(dobj);

        tobj.start();

        

    }    
}
