class Demo{
    public void demo1(){
        System.out.println("Inside Demo demo1");
    }

    public final void demo2(){
        System.out.println("Inside final Demo demo2");
    }
}

class Hello extends Demo{
    public void demo2(){             // ERROR - cannot override final method from Demo
        System.out.println("Inside Hello demo2");
    }

}



class final_method{
    public static void main(String A[]) {

        Hello hobj = new Hello();

        

    }

}