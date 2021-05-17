import javax.swing.*;
import java.awt.event.*;

class ComboDemo extends JFrame{
private JComboBox box;
private JPanel pp;

public ComboDemo(){
setTitle("ComboBox Demo");	
setSize(300,300);
pp = new JPanel();
box = new JComboBox();
box.addItem("C Language");
box.addItem("C++");
box.addItem("Core Java");
box.addItem("Python");
box.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
	JComboBox bb = (JComboBox)e.getSource();
	String str = (String)bb.getSelectedItem();
	if(str == "C Language")
		JOptionPane.showMessageDialog(null,"You Selected "+str);
	if(str=="C++")
		JOptionPane.showMessageDialog(null,"You Selected "+str);
	if(str=="Core Java")
		JOptionPane.showMessageDialog(null,"You Selected "+str);
	if(str=="Python")
		JOptionPane.showMessageDialog(null,"You Selected "+str);
}
});
pp.add(box);
add(pp);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public static void main(String[] args){
new ComboDemo();
}
}