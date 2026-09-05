abstract class Demo{
    public int i,j;

    public int Add(int a, int b){           //  Concrete method
        return a+b;
    }

    public abstract int Sub(int a, int b) ; 

}

class Hello extends Demo{           // ERROR - Hello is not abstract and does not override abstract method Sub(int,int) in Demo

}

class abstract_demo2{
    public static void main(String A[]) {

        Hello hobj = new Hello();

        
    }
}

