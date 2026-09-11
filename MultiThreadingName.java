class Demo extends Thread
{
    public void hello(){
        System.out.println("Inside hello method of : "+Thread.currentThread().getName());
    }

}


class MultiThreadingName
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
        
        

    }    
}
