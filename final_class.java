final class Demo{
    public void demo1(){
        System.out.println("Inside Demo demo1");
    }

    public void demo2(){
        System.out.println("Inside Demo demo2");
    }
}

class Hello extends Demo{         // Error final class cannot be inherited
    public void demo2(){  
        System.out.println("Inside Hello demo2");
    }

}



class final_class1{
    public static void main(String A[]) {

        Demo dobj = new Demo();    // Allowed 

        Hello hobj = new Hello();

        

    }

}