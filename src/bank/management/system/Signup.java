package bank.management.system;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JTextField textname,textfName,textemail,textaddress,textcity,textpin,textstate;
    JRadioButton r1gender,r2gender,textms1,textms2,textms3;
    JButton next;

    JDateChooser dateChooser;

    Random rand= new Random();
    long first4=(rand.nextLong()%9000L) +1000L;
    String first= " "+Math.abs(first4);

    Signup(){

        super("APPLICATION FORM");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image0=new JLabel(i3);
        image0.setBounds(25,10,100,100);
        add(image0);

        JLabel label1=new JLabel("Application Form No:"+first);
        label1.setBounds(200,20,680,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);



        JLabel label3=new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(350,90,600,30);
        add(label3);

        JLabel labelName=new JLabel("Name : ");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,200,100,30);
        add(labelName);

        textname=new JTextField();
        textname.setFont(new Font("Raleway",Font.BOLD,14));
        textname.setBounds(300,200,400,30);
        add(textname);

        JLabel labelfName=new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway",Font.BOLD,20));
        labelfName.setBounds(100,250,200,30);
        add(labelfName);

        textfName=new JTextField();
        textfName.setFont(new Font("Raleway",Font.BOLD,14));
        textfName.setBounds(300,250  ,400,30);
        add(textfName);

        JLabel DOB=new JLabel("Date Of Birth :");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,300,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,300,400,30);
        add(dateChooser);

        JLabel labelG=new JLabel("Gender :");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,350,200,30);
        add(labelG);

        r1gender=new JRadioButton("Male");
        r1gender.setFont(new Font("Raleway",Font.BOLD,20));
        r1gender.setBackground(new Color(222,255,228));
        r1gender.setBounds(300,350,80,30);
        add(r1gender);

        r2gender=new JRadioButton("Female");
        r2gender.setFont(new Font("Raleway",Font.BOLD,20));
        r2gender.setBackground(new Color(222,255,228));
        r2gender.setBounds(450,350,100,30);
        add(r2gender);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1gender);
        buttonGroup.add(r2gender);

        JLabel labelemail=new JLabel("Email Address :");
        labelemail.setFont(new Font("Raleway",Font.BOLD,20));
        labelemail.setBounds(100,400,200,30);
        add(labelemail);

        textemail=new JTextField();
        textemail.setFont(new Font("Raleway",Font.BOLD,14));
        textemail.setBounds(300,400,400,30);
        add(textemail);


        JLabel labelms=new JLabel("Marital Status : ");
        labelms.setFont(new Font("Raleway",Font.BOLD,20));
        labelms.setBounds(100,450,200,30);
        add(labelms);

        textms1=new JRadioButton("Married");
        textms1.setFont(new Font("Raleway",Font.BOLD,20));
        textms1.setBounds(300,450,100,30);
        textms1.setBackground(new Color(222,255,228));
        add(textms1);
        textms2=new JRadioButton("Single");
        textms2.setFont(new Font("Raleway",Font.BOLD,20));
        textms2.setBackground(new Color(222,255,228));
        textms2.setBounds(405,450,95,30);
        add(textms2);
        textms3=new JRadioButton("Other");
        textms3.setFont(new Font("Raleway",Font.BOLD,20));
        textms3.setBackground(new Color(222,255,228));
        textms3.setBounds(500,450,100,30);
        add(textms3);

        ButtonGroup buttonGroup1 =new ButtonGroup();
        buttonGroup.add(textms1);
        buttonGroup.add(textms2);
        buttonGroup.add(textms3);

        JLabel labeladdress=new JLabel("Address : ");
        labeladdress.setFont(new Font("Raleway",Font.BOLD,20));
        labeladdress.setBounds(100,500,200,30);
        add(labeladdress);

        textaddress=new JTextField();
        textaddress.setFont(new Font("Raleway",Font.BOLD,14));
        textaddress.setBounds(300,500,400,40);
        add(textaddress);

        JLabel labelcity=new JLabel("City : ");
        labelcity.setFont(new Font("Raleway",Font.BOLD,20));
        labelcity.setBounds(100,550,200,30);
        add(labelcity);

        textcity=new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD,14));
        textcity.setBounds(300,550,400,40);
        add(textcity);

        JLabel labelpin=new JLabel("PinCode : ");
        labelpin.setFont(new Font("Raleway",Font.BOLD,20));
        labelpin.setBounds(100,600,200,30);
        add(labelpin);

        textpin=new JTextField();
        textpin.setFont(new Font("Raleway",Font.BOLD,14));
        textpin.setBounds(300,600,400,40);
        add(textpin);

        JLabel labelstate =new JLabel("State : ");
        labelstate.setFont(new Font("Raleway",Font.BOLD,20));
        labelstate.setBounds(100,650,200,30);
        add(labelstate);

        textstate=new JTextField();
        textstate.setFont(new Font("Raleway",Font.BOLD,14));
        textstate.setBounds(300,650,400,40);
        add(textstate);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,17));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,700,80,30);
        next.addActionListener(this::actionPerformed);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno=first;
        String name=textname.getText();
        String fname=textfName.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1gender.isSelected()){
            gender="Male";
        }
        else if (r2gender.isSelected()){
            gender="Female";
        }
        String email=textemail.getText();
        String marital="null";
        if(textms1.isSelected()){
            marital="Married";
        } else if (textms2.isSelected()) {
            marital = "Single";
        } else if (textms3.isSelected()) {
            marital="Others";
        }
        String address=textaddress.getText();
        String city=textcity.getText();
        String pincode=textpin.getText();
        String state=textstate.getText();

        try{
            //add all the text fields cases in if statement incase user does not fill any other field
            if(textname.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Conn con1=new Conn();
                String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Signup();
    }
}
