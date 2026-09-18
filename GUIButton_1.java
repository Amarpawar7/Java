import javax.swing.*;

class GUIButton_1
{
    public static void main(String A[])
    {
        JFrame fobj = new JFrame("Demo Frame");
        
        fobj.setSize(400,300);

        JButton bobj = new JButton("OK");

        fobj.add(bobj);

        fobj.setLayout(null);

        fobj.setVisible(true);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}