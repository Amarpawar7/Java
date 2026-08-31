class Base{
    public int i,j;

    public void demo(){
        System.out.println("Inside Base demo");
    }
    
    public void demo1(){
        System.out.println("Inside Base demo1");
    }

    public void demo3(){
        System.out.println("Inside Base demo3");
    }

}

class Derived extends Base{
    public int x,y;

    public void demo1(){
        System.out.println("Inside Derived demo1");
    }

    public void demo3(){
        System.out.println("Inside Derived demo3");
    }

    public void run(){
        System.out.println("Inside Derived run");
    }


}


class RMD_Overriding2{
    public static void main(String A[]){
    
        Base bobj = new Derived(); // Upcasting

        bobj.demo(); // Base demo
        bobj.demo1(); // Derived demo1
        bobj.demo3(); // Derived demo3

    }
}