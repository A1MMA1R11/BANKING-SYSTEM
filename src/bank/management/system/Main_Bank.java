package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_Bank extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    Main_Bank(String pin){

        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,1080,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image0=new JLabel(i3);
        image0.setBounds(0,0,1550,1080);
        add(image0);

        JLabel l1=new JLabel("Please Select Your Transaction");
        l1.setBounds(320,180,1000,50);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,60));
        image0.add(l1);

        b1=new JButton("Deposit");
        b1.setFont(new Font("System",Font.BOLD,25));
        b1.setForeground(Color.WHITE);
        b1.setOpaque(false);
        b1.setContentAreaFilled(false);
        b1.setFocusPainted(false);
        b1.setBounds(190,407,250,80);
        b1.addActionListener(this);
        image0.add(b1);

        b2=new JButton("Cash Withdrawal");
        b2.setFont(new Font("System",Font.BOLD,25));
        b2.setForeground(Color.WHITE);
        b2.setOpaque(false);
        b2.setContentAreaFilled(false);
        b2.setFocusPainted(false);
        b2.setBounds(1100,407,250,80);
        b2.addActionListener(this);
        image0.add(b2);

        b3=new JButton("Fast cash");
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("System",Font.BOLD,25));
        b3.setOpaque(false);
        b3.setContentAreaFilled(false);
        b3.setFocusPainted(false);
        b3.setBounds(190,523,250,80);
        b3.addActionListener(this);
        image0.add(b3);

        b4=new JButton("Mini Statement");
        b4.setForeground(Color.WHITE);
        b4.setFont(new Font("System",Font.BOLD,25));
        b4.setOpaque(false);
        b4.setContentAreaFilled(false);
        b4.setFocusPainted(false);
        b4.setBounds(1100,523,250,80);
        b4.addActionListener(this);
        image0.add(b4);

        b5=new JButton("PIN Change");
        b5.setForeground(Color.WHITE);
        b5.setFont(new Font("System",Font.BOLD,25));
        b5.setOpaque(false);
        b5.setContentAreaFilled(false);
        b5.setFocusPainted(false);
        b5.setBounds(190,637,250,80);
        b5.addActionListener(this);
        image0.add(b5);

        b6=new JButton("Balance Inquiry");
        b6.setForeground(Color.WHITE);
        b6.setFont(new Font("System",Font.BOLD,25));
        b6.setOpaque(false);
        b6.setContentAreaFilled(false);
        b6.setFocusPainted(false);
        b6.setBounds(1100,637,250,80);
        b6.addActionListener(this);
        image0.add(b6);

        b7=new JButton("EXIT");
        b7.setForeground(Color.WHITE);
        b7.setFont(new Font("System",Font.BOLD,25));
        b7.setOpaque(false);
        b7.setContentAreaFilled(false);
        b7.setFocusPainted(false);
        b7.setBounds(1100,752,250,75);
        b7.addActionListener(this);
        image0.add(b7);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try{

            if(e.getSource()==b1)
            {
                new Deposit(pin);
                setVisible(false);
            } else if (e.getSource()==b2) {

                new Withdrawal(pin);
                setVisible(false);

            }else if (e.getSource()==b3) {

                new Fast_Cash(pin);
                setVisible(false);

            }else if (e.getSource()==b4) {
                new mini_statement(pin);
                setVisible(false);

            }else if (e.getSource()==b5) {
                new pin_change(pin);
                setVisible(false);

            }else if (e.getSource()==b6) {
                new Balance_Inquiry(pin);
                setVisible(false);

            }else if (e.getSource()==b7) {
                System.exit(0);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args){
        new Main_Bank("");
    }
}
