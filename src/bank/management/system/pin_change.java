package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pin_change extends JFrame implements ActionListener {

    JButton b1,b2;
    JPasswordField p1,p2;
    String pin;

    pin_change(String pin){

        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,1080,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image0=new JLabel(i3);
        image0.setBounds(0,0,1550,1080);
        add(image0);

        JLabel l1=new JLabel("Change Your PIN");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,60));
        l1.setBounds(550,200,600,80);;
        image0.add(l1);

        JLabel l2=new JLabel("NEW PIN");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System",Font.BOLD,40));
        l2.setBounds(190,407,300,80);
        image0.add(l2);

        p1=new JPasswordField();
        p1.setOpaque(false);
        //textField.setContentAreaFilled(false);
        //textField.setFocusPainted(false);
        p1.setForeground(Color.WHITE);
        p1.setHorizontalAlignment(SwingConstants.CENTER);
        p1.setBounds(190,523,250,80);
        p1.setFont(new Font("Raleway",Font.BOLD,25));
        image0.add(p1);

        JLabel l3=new JLabel("RE-Enter NEW PIN");
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("System",Font.BOLD,40));
        l3.setBounds(190,637,500,80);
        image0.add(l3);

        p2=new JPasswordField();
        p2.setOpaque(false);
        p2.setForeground(Color.WHITE);
        p2.setHorizontalAlignment(SwingConstants.CENTER);
        p2.setBounds(190,750,250,80);
        p2.setFont(new Font("Raleway",Font.BOLD,25));
        image0.add(p2);

        b1=new JButton("SUBMIT");
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

        try{

            String pin1=new String(p1.getPassword());
            String pin2=new String(p2.getPassword());
            if(!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Entered PIN does not Match");
                return;
            }
            if(e.getSource()==b1)
            {
                if(pin1.equals("")){
                    JOptionPane.showMessageDialog(null,"Enter New PIN");
                    return;
                }
                if(p2.equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Enter New PIN");
                    return;
                }

                Conn c=new Conn();
                String q1="update bank set pin_no='"+pin1+"' where pin_no='"+pin+"'";
                String q2="update login set PIN='"+pin1+"' where PIN='"+pin+"'";
                String q3="update signup3 set Pin_No='"+pin1+"' where Pin_No='"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);
                pin=pin1;

                JOptionPane.showMessageDialog(null,"PIN Changed Successfully");
                setVisible(false);
                new Main_Bank(pin);
            } else if (e.getSource()==b2) {
                new Main_Bank(pin);
                setVisible(false);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args){
        new pin_change("");
    }

}
