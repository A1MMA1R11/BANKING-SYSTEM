package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {

    String pin;

    JTextField textField;
    JButton b1,b2;

    Deposit(String pin){

        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,1080,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image0=new JLabel(i3);
        image0.setBounds(0,0,1550,1080);
        add(image0);

        JLabel l1=new JLabel("Enter Amount To Deposit: ");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,30));
        l1.setBounds(600,200,400,35);
        image0.add(l1);

        textField=new JTextField();
        textField.setOpaque(false);
        //textField.setContentAreaFilled(false);
        //textField.setFocusPainted(false);
        textField.setForeground(Color.WHITE);
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setBounds(610,250,350,40);
        textField.setFont(new Font("Raleway",Font.BOLD,25));
        image0.add(textField);

        b1=new JButton("DEPOSIT");
        b1.setFont(new Font("System",Font.BOLD,25));
        b1.setBounds(1150,637,200,80);
        b1.setOpaque(false);
        b1.setContentAreaFilled(false);
        b1.setFocusPainted(false);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        image0.add(b1);

        b2=new JButton("BACK");
        b2.setFont(new Font("System",Font.BOLD,25));
        b2.setBounds(1150,750,200,80);
        b2.setOpaque(false);
        b2.setContentAreaFilled(false);
        b2.setFocusPainted(false);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        image0.add(b2);



        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textField.getText();
            Date date = new Date();
            if (e.getSource()==b1){
                if(textField.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Please enter Amount to Deposit");
                }
                else{
                    Conn c=new Conn();
                    c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Amount deposited\n Rs."+amount);
                    setVisible(false);
                    new Main_Bank(pin);
                }
            } else if (e.getSource()==b2) {
                setVisible(false);

            }
        }catch (Exception E)
        {
            E.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Deposit("");
    }
}
