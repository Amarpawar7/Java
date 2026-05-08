class SuperDemo2{   
    public static void main(String A[]) {

            // Base bobj = new Base(11);
            // bobj.fun();

            Derived dobj = new Derived(); 

            dobj.gun();
    }
}

class Base {
    public int i;

    public Base(int no){
        System.out.println(" Inside Base Constructor");    
        this.i = no;                         // here, use of 'this' is optional
    }

    public void fun(){
        System.out.println("Inside Base fun");
    }
}


class Derived extends Base{
    public int i;

    public Derived(){

        super(11);          // Explicit call to Base Constructor      ,    can cause error if its not on the first line (error depends on version of java)

        System.out.println(" Inside Derived Constructor");    
        this.i = 21;                         // use of this is optional

    }
    
    public void gun(){
        System.out.println("Inside Derived gun");
        System.out.println("Value of i = "+i);
        System.out.println("Value of i from Base = "+super.i);
        
    
    }

}

