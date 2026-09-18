import javax.swing.*;

class GUIClose
{
    public static void main(String A[])
    {
        JFrame fobj = new JFrame("Demo Frame");
        
        fobj.setSize(400,300);

        fobj.setVisible(true);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}