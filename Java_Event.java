import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Java_Event extends JFrame{

JLabel l1,l2;
JTextField t1,t2;
JPasswordField jp;
JButton b1;

public Java_Event(){
	l1 =  new JLabel("Enter Firstname : ");
	add(l1);
	t1 = new JTextField("Username",10);
	add(t1);
	l2 =  new JLabel("Enter Lastname : ");
	add(l2);
	t2 = new JTextField(10);
	t2.setEditable(false);
	add(t2);
	jp = new JPasswordField(10);
	add(jp);
	b1 = new JButton("Click");
	add(b1);
	setLayout(new FlowLayout());
	setSize(300,200);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args){
	new Java_Event();
 }
}