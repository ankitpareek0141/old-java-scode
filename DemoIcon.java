import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Demo extends JFrame {
ImageIcon img;
JPanel p;
JLabel ll;

public Demo(){
 setTitle("Image Icon");
 setSize(300,300);
 p = new JPanel();
 java.net.URL imgURL = getClass().getResource("Next.png");
 img = new ImageIcon(imgURL,"Next");
 ll = new JLabel("",img,JLabel.CENTER);
 ll.addMouseListener(new MouseAdapter(){
 public void mouseClicked(MouseEvent ae){
   JOptionPane.showMessageDialog(null,"You just clicked next");
}
 });
 p.add(ll);
 add(p);
 setVisible(true);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public static void main(String[] args){
  new Demo();
 }
}