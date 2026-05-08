class ThisSuper3{   
    public static void main(String A[]) {
            Derived dobj = new Derived();

            dobj.gun();

            System.out.println(dobj.i);           // calls whose reference is there
            
    }
}

class Base {
    public int i;

    public Base(){
        System.out.println(" Inside Base Constructor");    
        this.i = 11;                         // here, use of 'this' is optional
    }

    public void fun(){
        System.out.println("Inside Base fun");
    }
}


class Derived extends Base{
    public int i;

    public Derived(){
        System.out.println(" Inside Derived Constructor");    
        this.i = 21;                         // use of this is optional
    }
    
    public void gun(){
        System.out.println("Inside Derived gun");
        
        System.out.println("Value of i = "+i);
        System.out.println("Value of i from Base = "+super.i);
        

    
    }

}

