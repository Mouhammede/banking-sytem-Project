import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class gui implements ActionListener{
    public JFrame w;
    public JPanel g,ad;
    public JPanel b;
    public JButton sub;
    public gui()
    {
        w=new JFrame("My Wallet");
        g=new JPanel();
        b=new JPanel();
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(500,500);
        w.setLayout(new GridLayout(1,2));
        w.setResizable(false);
        g.setSize(250,50);
        b.setSize(250,50);
        g.setBackground(new Color(31,57,32));
        b.setBackground(Color.WHITE);
        w.add(b);
        w.add(g);
        g.setLayout(new BorderLayout());
        JLabel un=new JLabel("user name : ");
        JLabel up=new JLabel("user password : ");
        JLabel wel=new JLabel("welcome back");
        wel.setBackground(new Color(31,57,32));
        wel.setForeground(Color.WHITE);
        wel.setFont(new Font("Eras Bold ITC", 0,30));
        wel.setHorizontalAlignment(JLabel.CENTER);
        wel.setVerticalAlignment(JLabel.CENTER);
        g.add(wel,BorderLayout.CENTER);
        JTextField n=new JTextField();
        JTextField p=new JTextField();
        p.setPreferredSize(new Dimension(200,25));
        n.setPreferredSize(new Dimension(200,25));
        JPanel pn=new JPanel();
        JPanel pp=new JPanel();
        ad=new JPanel();
        ad.setPreferredSize(new Dimension(250,150));
        ad.setBackground(Color.WHITE);
        pn.setLayout(new BoxLayout(pn,BoxLayout.Y_AXIS));
        pp.setLayout(new BoxLayout(pp,BoxLayout.Y_AXIS));
        pn.setBackground(Color.WHITE);
        pp.setBackground(Color.WHITE);
        sub=new JButton("Sumit");
        pn.add(up);
        pn.add(p);
        pn.add(un);
        pn.add(n);
        b.add(ad);
        b.add(pn);
        b.add(pp);
        b.add(sub);
        w.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
