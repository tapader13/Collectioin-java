package bankmanegment;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Transactions extends JFrame implements ActionListener {

    JLabel l1;
    JButton b1, b2, b3, b4, b5, b6, b7, baddacu, bDelacc, choose,
            interest, acc, trns, log, loan, upinfo, alltrn, apply, claim, del, pay, intr;
    String pin, formno;

    Transactions(String pin) {
        this.pin = pin;
        this.formno = formno;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bankmanegment/icons/transection.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(50, 50, 100, 100);
        add(l2);

        l1 = new JLabel("Select Your Service Type: ");
        l1.setForeground(Color.darkGray);
        l1.setFont(new Font("System", Font.BOLD, 16));

        choose = new JButton("Choose Bg Color");
        choose.setBackground(Color.DARK_GRAY);
        choose.setForeground(Color.WHITE);

        choose.setFont(new Font("Arial", Font.BOLD, 14));
        choose.setBounds(210, 150, 180, 30);
        add(choose);

        b1 = new JButton("DEPOSIT");
        b2 = new JButton("WITHDRAW");
        b3 = new JButton("CHECK DETAILS");
        b4 = new JButton("CONVERT MONEY");
        b5 = new JButton("RESET PASSWORD");
        b6 = new JButton("CHECK BALANCE");
        b7 = new JButton("EXIT");
        baddacu = new JButton("ADD ACCOUNT");
        bDelacc = new JButton("DELETE ACCOUNT");
        interest = new JButton("CHECK INTEREST");
        acc = new JButton("ALL ACCOUNT");
        trns = new JButton("TRANSFER MONEY");
        log = new JButton("BACK LOGIN");
        loan = new JButton("APPLY LOAN");
        upinfo = new JButton("UPDATE DETAILS");
        alltrn = new JButton("ALL TRANSICTIONS");
        apply = new JButton("APPLY POLICY");
        claim = new JButton("CLAIM POLICY");
        del = new JButton("DELETE POLICY");
        pay = new JButton("PAY LOAN");
        intr = new JButton("INTEREST");

        setLayout(null);

        l1.setBounds(180, 80, 500, 35);
        l1.setFont(new Font("Arial", Font.ITALIC, 29));
        add(l1);

        b1.setBounds(60, 240, 140, 35);
        add(b1);

        b2.setBounds(220, 240, 145, 35);
        add(b2);

        // System.out.println(this.formno);
        b3.setBounds(380, 240, 145, 35);
        add(b3);

        b4.setBounds(60, 290, 144, 35);
        add(b4);

        b5.setBounds(216, 290, 155, 35);
        add(b5);

        b6.setBounds(383, 290, 145, 35);
        add(b6);

        b7.setBounds(60, 340, 145, 35);
        b7.setBackground(Color.cyan);
        add(b7);

        baddacu.setBounds(220, 340, 145, 35);
        add(baddacu);

        bDelacc.setBounds(380, 340, 145, 35);
        add(bDelacc);

        interest.setBounds(60, 390, 145, 35);
        add(interest);

        acc.setBounds(220, 390, 145, 35);
        add(acc);

        trns.setBounds(380, 390, 148, 35);
        add(trns);

        log.setBounds(60, 440, 145, 35);
        add(log);

        loan.setBounds(220, 440, 145, 35);
        add(loan);

        upinfo.setBounds(380, 440, 148, 35);
        add(upinfo);

        alltrn.setBounds(60, 490, 150, 35);
        add(alltrn);

        apply.setBounds(220, 490, 145, 35);
        add(apply);

        claim.setBounds(380, 490, 148, 35);
        add(claim);

        del.setBounds(60, 540, 150, 35);
        add(del);

        pay.setBounds(220, 540, 145, 35);
        add(pay);

        intr.setBounds(380, 540, 145, 35);
        add(intr);

        intr.addActionListener(this);
        pay.addActionListener(this);
        del.addActionListener(this);
        claim.addActionListener(this);
        apply.addActionListener(this);
        alltrn.addActionListener(this);
        upinfo.addActionListener(this);
        loan.addActionListener(this);
        acc.addActionListener(this);
        interest.addActionListener(this);
        choose.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        baddacu.addActionListener(this);
        bDelacc.addActionListener(this);
        trns.addActionListener(this);
        log.addActionListener(this);

        setSize(600, 600);
        setLocation(300, 30);
        setUndecorated(true);
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            setVisible(false);
            new Deposite(pin).setVisible(true);
        } else if (ae.getSource() == b2) {
            setVisible(false);
            new Withdrow(pin).setVisible(true);
        } else if (ae.getSource() == b3) {
            setVisible(false);
            new AccountDetails(pin).setVisible(true);
        } else if (ae.getSource() == b4) {
            setVisible(false);
            new ConvertTaka(pin).setVisible(true);
        } else if (ae.getSource() == b5) {
            setVisible(false);
            new ChangePassword(pin).setVisible(true);
        } else if (ae.getSource() == b6) {
            this.setVisible(false);
            new CheckBalance(pin).setVisible(true);
        } else if (ae.getSource() == b7) {
            System.exit(0);
        } else if (ae.getSource() == baddacu) {
            this.setVisible(false);
            new SignUpOne().setVisible(true);
        } else if (ae.getSource() == choose) {
            Color color = JColorChooser.showDialog(null, "Choose any color ", Color.yellow);
            getContentPane().setBackground(color);
        } else if (ae.getSource() == bDelacc) {
            this.setVisible(false);
            new DeletAccount(pin).setVisible(true);
        } else if (ae.getSource() == interest) {
            this.setVisible(false);
            new Interest(pin).setVisible(true);

        } else if (ae.getSource() == acc) {
            this.setVisible(false);
            new AllAccount(pin).setVisible(true);

        } else if (ae.getSource() == trns) {
            this.setVisible(false);
            new Transfer(pin).setVisible(true);

        } else if (ae.getSource() == log) {
            this.setVisible(false);
            new Login().setVisible(true);

        } else if (ae.getSource() == loan) {
            this.setVisible(false);
            new ApplyLoan(pin).setVisible(true);

        } else if (ae.getSource() == upinfo) {
            this.setVisible(false);
            new UpdateInfo(pin).setVisible(true);

        } else if (ae.getSource() == alltrn) {
            this.setVisible(false);
            new AllTransiction(pin).setVisible(true);

        } else if (ae.getSource() == apply) {
            this.setVisible(false);
            new ApplyIncu(pin).setVisible(true);

        } else if (ae.getSource() == claim) {
            this.setVisible(false);
            new Claim(pin).setVisible(true);

        } else if (ae.getSource() == del) {
            this.setVisible(false);
            new DeletePol(pin).setVisible(true);

        } else if (ae.getSource() == pay) {
            this.setVisible(false);
            new Pay(pin).setVisible(true);

        } else if (ae.getSource() == intr) {
            this.setVisible(false);
            new MoneyWithInterest(pin).setVisible(true);

        }
    }

    public static void main(String[] args) {
        new Transactions("").setVisible(true);

    }
}
