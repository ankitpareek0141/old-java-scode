import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Gui extends JFrame{

JTextField tf;
JCheckBox cb1,cb2;

public Gui(){
setTitle("JCheckBox");
setLayout(new FlowLayout());
tf = new JTextField("This is a sample text");
tf.setFont(new Font("Serif",Font.PLAIN,14));
add(tf);
cb1 = new JCheckBox("Bold");
cb2 = new JCheckBox("Italic");
add(cb1);
add(cb2);

HandlerClass hh = new HandlerClass();
cb1.addItemListener(hh);
cb2.addItemListener(hh);

setSize(300,300);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

class HandlerClass implements ItemListener{     // inner class

public void itemStateChanged(ItemEvent ee){
Font f=null;
if(cb1.isSelected() && cb2.isSelected())
	f = new Font("Serif",Font.BOLD + Font.ITALIC,14);
else if(cb1.isSelected())
	f = new Font("Seif",Font.BOLD,14);
else if(cb2.isSelected())
	f = new Font("Seif",Font.ITALIC,14);
else
	f = new Font("Serif",Font.PLAIN,14);
tf.setFont(f);
 }		
}

public static void main(String[] args)
 {
   new Gui();
 }

}