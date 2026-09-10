interface Circle{
    // Charecteristics
    float PI = 3.14f;  // public static final
}


class Demointerface {
    public static void main(String A[]){

        System.out.println(Circle.PI);

        Circle.PI = 7.12f;   // ERROR due to final

    }
    
}
