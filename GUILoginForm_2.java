import javax.swing.*;
import java.awt.event.*;

class DemoLogin extends JFrame
{

    public DemoLogin(String title, int width, int height)
    {
        setTitle(title);
        setSize(width,height);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

class GUILoginForm_2
{
    public static void main(String A[])
    {
        DemoLogin dobj = new DemoLogin("Demo",400,300);
        
    }
}
