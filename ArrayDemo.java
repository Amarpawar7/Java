class ArrayDemo {
    public static void main(String A[]) {

        // 3 ways in which we can create an array : 
        // 1.
        int Arr[] = {10,20,30,40};
        // 2.
        int [] Brr = {10,20,30,40};
        // 3.
        int Crr[] = new int[4];

        Crr[0] = 10;
        Crr[1] = 20;
        Crr[2] = 30;
        Crr[3] = 40;

        System.out.println(Arr.length);
        System.out.println(Brr.length);
        System.out.println(Crr.length);

    }
}
