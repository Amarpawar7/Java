class StringCompare1{
    public static void main(String A[]){
 
        String s1 ="Engineers";    // pool - memory allocation in String Constant pool

        String s2 = new String("Engineers");  //  Heap - memory allocation in heap

        if(s1 == s2){                                        // this is wrong - using == operator is wrong , in java there is a method called as "equals" ,coz == compares the refernece and not the data
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

    }
}
