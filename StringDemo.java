class StringDemo{
    public static void main(String A[]){
 
        String s1 ="Hello";    // pool - memory allocation in String Constant pool

        String s2 = new String("Engineers");  //  Heap - memory allocation in heap

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.length());      // 5
        System.out.println(s2.length());      // 6




    }
}
