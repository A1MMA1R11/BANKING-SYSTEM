package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    String formno;
    JRadioButton r1, r2, r3, r4;
    JButton cancel,submit;
    JCheckBox c1,c2,c3,c4,c5,c6;

    Signup3(String formno) {

        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image0 = new JLabel(i3);
        image0.setBounds(150, 5, 100, 100);
        add(image0);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 3");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(400, 40, 600, 30);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(350, 60, 200, 30);
        add(l2);

        JLabel l3 = new JLabel("Account Type :");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100, 140, 200, 30);
        add(l3);

        r1 = new JRadioButton("SAVINGS ACCOUNT");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(215, 252, 252));
        r1.setBounds(100, 180, 200, 30);
        add(r1);

        r2 = new JRadioButton("FIXED DEPOSIT ACCOUNT");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(215, 252, 252));
        r2.setBounds(350, 180, 300, 30);
        add(r2);

        r3 = new JRadioButton("CURRENT ACCOUNT");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(new Color(215, 252, 252));
        r3.setBounds(100, 220, 250, 30);
        add(r3);

        r4 = new JRadioButton("RECURRING DEPOSIT ACCOUNT");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(new Color(215, 252, 252));
        r4.setBounds(350, 220, 300, 30);
        add(r4);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);

        JLabel l4 = new JLabel("Card Number :");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100, 270, 200, 30);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway", Font.BOLD, 12));
        l5.setBounds(100, 300, 200, 20);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(300, 270, 300, 30);
        add(l6);


        JLabel l7 = new JLabel("(It would appear on your ATM card/Cheque Book and Statement)");
        l7.setFont(new Font("Raleway", Font.BOLD, 12));
        l7.setBounds(300, 300, 500, 20);
        add(l7);


        JLabel l8 = new JLabel("PIN :");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100, 330, 200, 30);
        add(l8);


        JLabel l9 = new JLabel("XXXX :");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(300, 330, 140, 30);
        add(l9);

        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setFont(new Font("Raleway", Font.BOLD, 12));
        l10.setBounds(100, 350, 180, 30);
        add(l10);


        JLabel l11 = new JLabel("Service Required :");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));
        l11.setBounds(100, 400, 180, 30);
        add(l11);

        c1=new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway", Font.BOLD, 14));
        c1.setBackground(new Color(215, 252, 252));
        c1.setBounds(100,450,200,30);
        add(c1);
        c2=new JCheckBox("INTERNET BANKING");
        c2.setFont(new Font("Raleway", Font.BOLD, 14));
        c2.setBackground(new Color(215, 252, 252));
        c2.setBounds(300,450,200,30);
        add(c2);
        c3=new JCheckBox("MOBILE BANKING");
        c3.setFont(new Font("Raleway", Font.BOLD, 14));
        c3.setBackground(new Color(215, 252, 252));
        c3.setBounds(100,500,200,30);
        add(c3);
        c4=new JCheckBox("E-MAIL ALERTS");
        c4.setFont(new Font("Raleway", Font.BOLD, 14));
        c4.setBackground(new Color(215, 252, 252));
        c4.setBounds(300,500,200,30);
        add(c4);
        c5=new JCheckBox("CHEQUE BOOK");
        c5.setFont(new Font("Raleway", Font.BOLD, 14));
        c5.setBackground(new Color(215, 252, 252));
        c5.setBounds(100,550,200,30);
        add(c5);
        c6=new JCheckBox("E-STATEMENT");
        c6.setFont(new Font("Raleway", Font.BOLD, 14));
        c6.setBackground(new Color(215, 252, 252));
        c6.setBounds(300,550,200,30);
        add(c6);

        JCheckBox c7=new JCheckBox("I Hereby Declare that the above entered details is correct to the best of my knowledge",true);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBackground(new Color(215, 252, 252));
        c7.setBounds(100,650,600,30);
        add(c7);

        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Raleway", Font.BOLD, 20));
        l12.setBounds(650, 10, 100, 30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 20));
        l13.setBounds(760, 10, 60, 30);
        add(l13);

        submit = new JButton("SUBMIT");
        submit.setFont(new Font("Raleway", Font.BOLD, 17));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(450, 700, 150, 30);
        submit.addActionListener(this::actionPerformed);
        add(submit);

        cancel = new JButton("CANCEL");
        cancel.setFont(new Font("Raleway", Font.BOLD, 17));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(250, 700, 150, 30);
        cancel.addActionListener(this::actionPerformed);
        add(cancel);

        setLayout(null);
        setSize(850, 800);
        setLocation(300, 50);
        getContentPane().setBackground(new Color(215, 252, 252));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype=null;
        if(r1.isSelected()){
            atype="SAVINGS ACCOUNT";
        }
        else if (r2.isSelected()){
            atype="FIXED DEPOSIT ACCOUNT";
        }
        else if(r3.isSelected()){
            atype="CURRENT ACCOUNT";
        }
        else if (r4.isSelected()){
            atype="RECURRING DEPOSIT ACCOUNT";
        }

        Random random=new Random();
        long first7=(random.nextLong() % 90000000L) + 1409963000000000L;
        String cardno=""+Math.abs(first7);

        long first3=(random.nextLong() % 9000L) + 1000L;
        String pin=""+Math.abs(first3);

        String fac = "";

        if(c1.isSelected()){
            fac += "ATM CARD, ";
        }
        if(c2.isSelected()){
            fac += "INTERNET BANKING, ";
        }
        if(c3.isSelected()){
            fac += "MOBILE BANKING, ";
        }
        if(c4.isSelected()){
            fac += "E-MAIL ALERTS, ";
        }
        if(c5.isSelected()){
            fac += "CHEQUE BOOK, ";
        }
        if(c6.isSelected()){
            fac += "E-STATEMENT, ";
        }
        if(!fac.isEmpty()){
            fac = fac.substring(0, fac.length() - 2);
        }

        try{
            if(e.getSource()==submit){
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }
                else{
                    Conn c2=new Conn();
                    String q1="Insert into signup3 values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2="Insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c2.statement.executeUpdate(q1);
                    c2.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card No: "+cardno+"\nPin :"+pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==cancel) {
                System.exit(0);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
