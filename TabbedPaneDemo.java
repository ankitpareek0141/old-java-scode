import javax.swing.*;
import java.awt.*;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;

class TabbedPaneDemo extends JFrame{
JTabbedPane tab;
JPanel p1,p2,p3,p4;

public TabbedPaneDemo(){
setTitle("TabbedPane Demo");
setSize(300,400);

tab = new JTabbedPane(); 
p1 = new JPanel();
tab.addTab("Tab 1",null,p1,"this is tab 1st");
tab.setMnemonicAt(0, KeyEvent.VK_1);


p2 = new JPanel();  
tab.addTab("Tab 2",null,p2,"this is tab 2nd");
tab.setMnemonicAt(1, KeyEvent.VK_2);

p3 = new JPanel();
tab.addTab("Tab 3",null,p3,"this is tab 3rd");
tab.setMnemonicAt(2, KeyEvent.VK_3);

p4 = new JPanel();
tab.addTab("Tab 4",null,p4,"this is tab 4th");
tab.setMnemonicAt(3, KeyEvent.VK_4);
add(tab);
setVisible(true);
tab.addChangeListener(new ChangeListener(){
public void stateChanged(ChangeEvent ae){
int i = tab.getSelectedIndex();
System.out.println("You selected tab : "+(i+1));
}
});
}

public static void main(String[] args){
 new TabbedPaneDemo(); 
 }
}