abstract class Demo{
    public int i,j;

    public int Add(int a, int b){           //  Concrete method
        return a+b;
    }

}


class abstract_demo1{
    public static void main(String A[]) {

        Demo dobj = new Demo(); // Demo is abstract; cannot be instantiated
        
    }
}
