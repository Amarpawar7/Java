class StringCompare2{
    public static void main(String A[]){
 
        String s1 ="Engineers";    // pool - memory allocation in String Constant pool

        String s2 = new String("Engineers");  //  Heap - memory allocation in heap

        if(s1.equals(s2)){                // it wont compare the reference it compares data 
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        
    }
}

