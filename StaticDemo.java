class Demo{

    public int i;
    public int j;
    public static int k;

    static{
        System.out.println("Inside static block");
        k = 51;
    }
    public Demo(){
        System.out.println("Inside constructor");
        this.i = 10;
        this.j = 21;
    }

    public void fun(){
        System.out.println("Inside fun method");
        System.out.println("Value of i : "+this.i);
        System.out.println("Value of j : "+this.j);
        System.out.println("Value of K : "+Demo.k);
    }

    public static void gun(){
        System.out.println("Inside gun method");
        System.out.println("Value of k : "+Demo.k);
    }
}

class StaticDemo{
    public static void main(String A[]){
        
        System.out.println("Inside main");      

        System.out.println("Value of k : "+Demo.k);

        // Demo dobj = new Demo();

        Demo.gun();       //  Static can be accessed without using object 

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.fun();        // need object coz fun is non static method 
        dobj2.fun();

    }
}

