// import javax.naming.spi.DirStateFactory.Result;
import javax.swing.*;
import java.awt.event.*;
// import java.sql.ResultSet;

class DemoLogin //implements ActionListener
{
    public JFrame fobj;
    public JButton bobj;
    public JTextField tobj;
    public JPasswordField pobj;
    public JLabel UserLabel, PassLabel, ResultLabel;


    public DemoLogin(String title, int width, int height)
    {
        fobj = new JFrame();
        
        UserLabel = new JLabel("Username");
        UserLabel.setBounds(50,50,100,30);

        tobj = new JTextField();
        tobj.setBounds(150,50,150,30);
        // tobj.setBounds(155,50,100,30);

        PassLabel = new JLabel("Password");
        PassLabel.setBounds(50,100,150,30);

        pobj = new JPasswordField();
        pobj.setBounds(150,50,150,30);
        // pobj.setBounds(155,50,100,30);

        bobj = new JButton("SUBMIT");
        bobj.setBounds(150,150,100,30);
        // bobj.setBounds(100,150,100,30);

        ResultLabel = new JLabel();
        ResultLabel.setBounds(150,200,250,30);

        fobj.add(bobj);
        fobj.add(tobj);
        fobj.add(pobj);
        fobj.add(UserLabel);
        fobj.add(PassLabel);
        fobj.add(ResultLabel);

        fobj.setTitle(title);
        fobj.setSize(width,height);
        fobj.setVisible(true);

    }
}

class GUILoginForm_2
{
    public static void main(String A[])
    {
        DemoLogin dobj = new DemoLogin("Demo Login",400,300);
        
    }
}
