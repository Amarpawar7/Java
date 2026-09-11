class MainThreadPriority{
    public static void main(String A[]){

        System.out.println("Inside main method");

        Thread tobj = Thread.currentThread();

        String name = tobj.getName();

        System.out.println("Naeme of current thread : "+name);                            // O/P -> main
        System.out.println("Priority of current thread is : "+tobj.getPriority());        // O/P -> 5

    }    
}
