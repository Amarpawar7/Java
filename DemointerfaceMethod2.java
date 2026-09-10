
class DemoInterfaceMethod2
{
    public static void main(String A[])
    {
        // Circle cobj = new Circle();  - Not allowed

        Demo dobj = new Demo();
        float Ret = 0.0f;

        Ret = dobj.Area(10.5f);
        System.out.println("Area is : "+Ret);

        Ret = dobj.Circumfarance(10.5f);
        System.out.println("Circumfarance is : "+Ret);
    }
}
interface Circle
{
    // Characteristics  (public static final )
    float PI = 3.14f;    
    
    // Behaviours   (public abstract)
    float Area(float Radius);
    float Circumfarance(float Radius);
}

class Demo implements Circle
{
    public float Area(float Radius)
    {
        return Circle.PI * Radius * Radius;
    }

    public float Circumfarance(float Radius)
    {
        return 2 * Circle.PI * Radius;
    }  
}