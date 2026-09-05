class Demo{
    public final int i;
    public int j;
    public Demo(int a, int b){
        this.i = a;
        this.j = b ;
    }

}



class final_data2{
    public static void main(String A[]) {

        Demo dobj = new Demo(10,21);

        dobj.j = 21;

        dobj.j++;


    }

}