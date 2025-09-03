package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawal extends JFrame implements ActionListener {

    String pin;

    JTextField textField;
    JButton b1,b2;

    Withdrawal(String pin){

        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,1080,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image0=new JLabel(i3);
        image0.setBounds(0,0,1550,1080);
        add(image0);

        JLabel l1=new JLabel("Maximum Withdrawal is Rs.10000");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,30));
        l1.setBounds(515,200,490,35);
        image0.add(l1);

        JLabel l2=new JLabel("Please Enter Your AMOUNT");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System",Font.BOLD,30));
        l2.setBounds(550,240,450,35);
        image0.add(l2);

        textField=new JTextField();
        textField.setOpaque(false);
        textField.setForeground(Color.WHITE);
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setBounds(575,290,350,40);
        textField.setFont(new Font("Raleway",Font.BOLD,25));
        image0.add(textField);

        b1=new JButton("CASH WITHDRAW");
        b1.setFont(new Font("System",Font.BOLD,25));
        b1.setBounds(1100,637,250,80);
        b1.setOpaque(false);
        b1.setContentAreaFilled(false);
        b1.setFocusPainted(false);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        image0.add(b1);

        b2=new JButton("BACK");
        b2.setFont(new Font("System",Font.BOLD,30));
        b2.setBounds(1100,750,250,80);
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
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            try
            {

                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please Enter the Amount you want to Withdraw");
                } else
                {
                    Conn c = new Conn();
                    ResultSet resultSet = c.statement.executeQuery("select * from bank where pin_no='" + pin + "'");
                    int balance = 0;
                    while (resultSet.next())
                    {
                        if (resultSet.getString("type").equals("Deposit"))
                        {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else
                        {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount))
                    {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }

                    c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','Withdrawal','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs." + amount + " Debited Successfully");
                    new Main_Bank(pin);
                }

            }
            catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
        else if(e.getSource()==b2)
        {
            setVisible(false);
            new Main_Bank(pin);
        }

    }

    public static void main(String[] args){
        new Withdrawal("");
    }
}
