class Demo extends Thread
{
    public void hello()
    {
        int i = 0;

        for (i = 1 ;i <= 100; i++)
        {
            System.out.println("Inside hello method of : "+Thread.currentThread().getName()+" : "+i);
        }
       
    }

}


class MultiThreadingLoop_2
{
    public static void main(String A[])
    {
        System.out.println("Main thread is running");
        
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        
        dobj1.setName("First");
        dobj2.setName("Second");

        dobj1.start();
        dobj2.start();

        System.out.println("End of main thread");

    }    
}
