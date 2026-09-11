class Demo extends Thread
{
    public void first(){
        System.out.println("Inside first method");
    }

}


class ThreadScenario_1
{
    public static void main(String A[])
    {
        System.out.println("Main thread is running");
        
        Demo dobj = new Demo();

        dobj.start();



    }    
}
