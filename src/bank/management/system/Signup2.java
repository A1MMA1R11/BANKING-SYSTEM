package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    String formno;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textPan,textAadhar;
    JRadioButton r1,r2,r3,r4;
    JButton next1;

    Signup2(String formno){

        super("APPLICATION FORM");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image0=new JLabel(i3);
        image0.setBounds(150,5,100,100);
        add(image0);

        this.formno=formno;

        JLabel l1=new JLabel("Page 2");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(400,40,600,30);
        add(l1);

        JLabel l2=new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(350,60,600,30);
        add(l2);

        JLabel l3=new JLabel("Religion :");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[]={"Hindu","Muslim","Sikh","Christian","Others"};
        comboBox=new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4=new JLabel("Category :");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String category[]={"General","OBC","SC","ST","Others"};
        comboBox2=new JComboBox(category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5=new JLabel("INCOME :");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String income[]={"Null",">=1,50,000",">=2,50,000",">=5,00,000",">=10,00,000","<10,00,000"};
        comboBox3=new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6=new JLabel("EDUCATION :");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,270,140,30);
        add(l6);

        String education[]={"Non-Graduate","Graduate","Post-Graduate","Docatrate","Others"};
        comboBox4=new JComboBox(education);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7=new JLabel("OCCUPATION :");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,320,140,30);
        add(l7);

        String occupation[]={"Salaried","Self-Employed","Business","Student","Retired","Others"};
        comboBox5=new JComboBox(occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);

        JLabel l8=new JLabel("PAN No :");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,140,30);
        add(l8);

        textPan=new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,18));
        textPan.setBounds(350,370,320,30);
        add(textPan);

        JLabel l9=new JLabel("AADHAR No :");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,420,140,30);
        add(l9);

        textAadhar=new JTextField();
        textAadhar.setFont(new Font("Raleway",Font.BOLD,18));
        textAadhar.setBounds(350,420,320,30);
        add(textAadhar);

        JLabel l10=new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway",Font.BOLD,20));
        l10.setBounds(100,470,180,30);
        add(l10);

        r1=new JRadioButton("YES");
        r1.setFont(new Font("Raleway",Font.BOLD,18));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,470,80,30);
        add(r1);

        r2=new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,18));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(450,470,100,30);
        add(r2);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);

        JLabel l11=new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway",Font.BOLD,20));
        l11.setBounds(100,540,180,30);
        add(l11);

        r3=new JRadioButton("YES");
        r3.setFont(new Font("Raleway",Font.BOLD,18));
        r3.setBackground(new Color(252,208,76));
        r3.setBounds(350,540,80,30);
        add(r3);

        r4=new JRadioButton("No");
        r4.setFont(new Font("Raleway",Font.BOLD,18));
        r4.setBackground(new Color(252,208,76));
        r4.setBounds(450,540,100,30);
        add(r4);

        ButtonGroup buttonGroup2=new ButtonGroup();
        buttonGroup2.add(r3);
        buttonGroup2.add(r4);

        JLabel l12=new JLabel("Form No :");
        l12.setFont(new Font("Raleway",Font.BOLD,20));
        l12.setBounds(650,10,100,30);
        add(l12);

        JLabel l13=new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,20));
        l13.setBounds(760,10,60,30);
        add(l13);

        next1=new JButton("Next");
        next1.setFont(new Font("Raleway",Font.BOLD,17));
        next1.setBackground(Color.BLACK);
        next1.setForeground(Color.WHITE);
        next1.setBounds(620,700,80,30);
        next1.addActionListener(this::actionPerformed);
        add(next1);

        setLayout(null);
        setSize(850,800);
        setLocation(300,50);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel=(String) comboBox.getSelectedItem();
        String cat=(String) comboBox2.getSelectedItem();
        String inc=(String) comboBox3.getSelectedItem();
        String edu=(String) comboBox4.getSelectedItem();
        String occ=(String) comboBox5.getSelectedItem();
        String pan=textPan.getText();
        String aadhar=textAadhar.getText();

        String scitizen="null";
        if(r1.isSelected()){
            scitizen="YES";
        }
        else if (r2.isSelected()){
            scitizen="NO";
        }

        String Eacc="null";
        if(r3.isSelected()){
            Eacc="YES";
        }
        else if (r4.isSelected()){
            Eacc="NO";
        }

        try{
            //add all the text fields cases in if statement incase user does not fill any other field
            if(textPan.getText().isEmpty() || textAadhar.getText().isEmpty() ){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Conn con2=new Conn();
                String q="insert into signup2 values('"+formno+"','"+rel+"','"+cat+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+Eacc+"')";
                con2.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Signup2("");
    }
}
