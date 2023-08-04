
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class JLabel extends JFrame {
    private Container c;
    private JLabel userLabel;

    JLabel() {
        incom();
    }

    public void incom() {
        c = this.getContentPane();
        c.setBackground(Color.pink);
        userLabel = new JLabel();
        userLabel.SetText("Enter Your name");
        c.add(userLabel);

    }

    public static void main(String[] args) {
        JLabel f=new JLabel();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(200, 100, 300, 100);
        f.setTitle("JLabel");
    }
