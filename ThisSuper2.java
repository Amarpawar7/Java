class ThisSuper2{   
    public static void main(String A[]) {
            Derived dobj = new Derived();

            dobj.gun();
    }
}

class Base {
    public int i;
    public int j;

    public Base(){
        System.out.println(" Inside Base Constructor");    
        this.i = 11;                         // here, use of 'this' is optional
        this.j = 21;
    }

    public void fun(){
        System.out.println("Inside Base fun");
    }
}


class Derived extends Base{
    public int x;

    public Derived(){
        System.out.println(" Inside Derived Constructor");    
        this.x = 51;                         // use of this is optional
    }
    
    public void gun(){
        System.out.println("Inside Derived gun");
        
        System.out.println("Value of i = "+i);
        System.out.println("Value of j = "+j);
        System.out.println("Value of x = "+x);
    
    }

}

