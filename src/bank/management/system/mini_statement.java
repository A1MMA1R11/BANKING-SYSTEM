package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class mini_statement extends JFrame implements ActionListener {
    String pin;
    JButton button;
    mini_statement(String pin){
        this.pin = pin;

        getContentPane().setBackground(new Color(255,204,204));
        setSize(400,600);
        setLocation(600,100);
        setLayout(null);

        JTextArea label1 = new JTextArea();
        label1.setEditable(false);
        label1.setFont(new Font("Monospaced", Font.PLAIN, 12));

        JScrollPane scrollPane = new JScrollPane(label1);
        scrollPane.setBounds(8, 100, 380, 360);
        add(scrollPane);

        JLabel label2 = new JLabel("APNA BANK ");
        label2.setFont(new Font("System", Font.BOLD,30));
        label2.setBounds(120,20,200,30);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(10,80,300,20);
        label3.setFont(new Font("System", Font.BOLD,15));
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(10,470,300,20);
        label4.setFont(new Font("System", Font.BOLD,15));
        add(label4);

        try{
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from login where Pin= '"+pin+"'");
            while (resultSet.next()){
                label3.setText("Card Number:  "+ resultSet.getString("Card_No").substring(0,4) + "XXXXXXXX"+ resultSet.getString("Card_No").substring(12));
            }
        }catch (Exception e ){
            e.printStackTrace();
        }

        try{
            int balance =0;
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin_no = '"+pin+"'");
            while (resultSet.next()){

                String date = resultSet.getString("date");
                String type = resultSet.getString("type");
                String amount = resultSet.getString("amount");

                label1.append(String.format(" %-30s %-12s %s\n\n", date, type, amount));

                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            label4.setText("Your Total Balance is Rs."+balance);
        }catch (Exception e){
            e.printStackTrace();
        }

        button = new JButton("BACK");
        button.setBounds(150,500,100,25);
        button.addActionListener(this);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        add(button);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Main_Bank(pin);
    }

    public static void main(String[] args) {
        new mini_statement("");
    }
}