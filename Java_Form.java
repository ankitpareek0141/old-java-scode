import java.awt.*;
import javax.swing.*;

class JavaForm
{
JFrame jf;
JPanel jp,jp2,jp3;
JTextField t1,t2,t3;
JLabel l1,l2,l3;
JButton b1,b2;

public JavaForm(){

jf = new JFrame("Java Sample GUI");
jp = new JPanel();
jp2 = new JPanel();
jp3 = new JPanel();
t1 = new JTextField(15);
t2 = new JTextField(15);
t3 = new JTextField(15);
l1 = new JLabel("First Name:");
l2 = new JLabel("Last Name:");
l3 = new JLabel("Email:");
b1 = new JButton("Sign In");
b1.setBackground(Color.orange);
b2 = new JButton("Register");
b2.setBackground(Color.orange);

jp.setLayout(null);
jp2.setLayout(null);
jp3.setLayout(null);

jp2.setBounds(90,90,150,220);
l1.setBounds(50,70,70,30);
l1.setForeground(Color.orange);
l2.setBounds(50,100,70,30);
l2.setForeground(Color.orange);
l3.setBounds(50,130,70,30);
l3.setForeground(Color.orange);

jp3.setBounds(245,90,150,220);
t1.setBounds(17,70,120,20);
t1.setForeground(Color.white);
t1.setBackground(Color.blue);
t2.setBounds(17,100,120,20);
t2.setForeground(Color.white);
t2.setBackground(Color.blue);
t3.setBounds(17,130,120,20);
t3.setForeground(Color.white);
t3.setBackground(Color.blue);
b1.setBounds(130,330,90,25);
b2.setBounds(260,330,90,25);

jf.add(jp);
jp.add(jp2);
jp.add(jp3);

jp2.add(l1);
jp3.add(t1);
jp2.add(l2);
jp3.add(t2);
jp2.add(l3);
jp3.add(t3);
jp.add(b1);
jp.add(b2);

jp.setBackground(Color.green);
jp2.setBackground(Color.blue);
jp3.setBackground(Color.yellow);
jf.setSize(500,450);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setVisible(true);
}

public static void main(String[] args){
 new JavaForm(); 
 }


}