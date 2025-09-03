package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {

    JLabel label1,label2,label3;

    JTextField text2;

    JPasswordField text3;

    JButton button1,button2,button3;

    Conn c=new Conn();

    Login(){
        super("Bank Management System");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image0=new JLabel(i3);
        image0.setBounds(350,10,100,100);
        add(image0);

        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image i5=i4.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image1=new JLabel(i6);
        image1.setBounds(630,350,100,100);
        add(image1);

        label1=new JLabel("Welcome To ATM");
        label1.setForeground(Color.black);
        label1.setFont(new Font("Avantgarde",Font.BOLD,38));
        label1.setBounds(270,125,450,40);
        add(label1);

        label2=new JLabel("Card No:");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setForeground(Color.black);
        label2.setBounds(150,190,375,30);
        add(label2);

        text2=new JTextField(15);
        text2.setBounds(325,190,230,30);
        text2.setFont(new Font("Arial",Font.BOLD,14));
        add(text2);

        label3=new JLabel("PIN NO:");
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setForeground(Color.black);
        label3.setBounds(150,250,375,30);
        add(label3);

        text3=new JPasswordField(15);
        text3.setBounds(325,250,230,30);
        text3.setFont(new Font("Arial",Font.BOLD,14));
        add(text3);

        button1=new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.BLACK);
        button1.setBounds(340,300,100,30);
        button1.addActionListener(this);
        add(button1);

        button2=new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.BLACK);
        button2.setBounds(450,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3=new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.BLACK);
        button3.setBounds(345,350,200,30);
        button3.addActionListener(this);
        add(button3);

        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image i8=i7.getImage().getScaledInstance(854,480,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel image2=new JLabel(i9);
        image2.setBounds(0,0,854,480);
        add(image2);


        setLayout(null);
        setSize(854,480);
        //setUndecorated(true);
        setLocation(375,200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try
        {
            if(e.getSource()==button1)
            {
                String card_no=text2.getText();
                String pin_no=new String(text3.getPassword());
                String q="select * from login where Card_No = '"+card_no+"' and Pin = '"+pin_no+"'";
                ResultSet resultSet=c.statement.executeQuery(q);

                if(resultSet.next()){
                    setVisible(false);
                    new Main_Bank(pin_no);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Invalid Card Number or PIN");
                    text2.setText("");
                    text3.setText("");
                }
            }
            else if(e.getSource()==button2)
            {
                text2.setText("");
                text3.setText("");
            }
            else if (e.getSource()==button3) {
                new Signup();
                setVisible(false);
            }
        }
        catch(Exception E)
        {
            E.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Login();

    }
}
