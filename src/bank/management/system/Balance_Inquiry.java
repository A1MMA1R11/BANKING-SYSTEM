package bank.management.system;

import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.border.Border;

import static java.awt.Color.black;

public class Balance_Inquiry extends JFrame implements ActionListener {

    JLabel l2;
    JButton b1;
    String pin;

    Balance_Inquiry(String pin)
    {
        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,1080,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image0=new JLabel(i3);
        image0.setBounds(0,0,1550,1080);
        add(image0);

        JLabel l1=new JLabel("Your current balance");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,50));
        l1.setBounds(520,200,600,50);
        image0.add(l1);

        l2=new JLabel();
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System",Font.BOLD,40));
        l2.setVerticalTextPosition(SwingConstants.CENTER);
        l2.setHorizontalAlignment(SwingConstants.CENTER);
        l2.setBounds(580,270,400,50);
        image0.add(l2);

        b1=new JButton("Back");
        b1.setFont(new Font("System",Font.BOLD,25));
        b1.setBounds(1100,750,250,80);
        b1.setOpaque(false);
        b1.setContentAreaFilled(false);
        b1.setFocusPainted(false);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        image0.add(b1);

        int balance=0;
        try {
            Conn c=new Conn();
            ResultSet resultSet=c.statement.executeQuery("select * from bank where pin_no='"+pin+"'");
            while(resultSet.next()){
                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }
                else{
                    balance-=Integer.parseInt(resultSet.getString("amount"));
                }
            }

        }
        catch(Exception E)
        {
            E.printStackTrace();
        }

        l2.setText(("Rs."+balance));

        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        setVisible(false);
        new Main_Bank(pin);

    }

    public static void main(String[] args){
        new Balance_Inquiry("");
    }
}
