import javax.swing.*;

class Dialog{

public static void main(String[] args){
 String str1 = JOptionPane.showInputDialog("Enter First Number");
 String str2 = JOptionPane.showInputDialog("Enter Second Number");
 
 int a = Integer.parseInt(str1);
 int b = Integer.parseInt(str2);
 int sum = a + b;
 
 JOptionPane.showMessageDialog(null,"the sum of two number is "+sum,"Sum Successfull",JOptionPane.PLAIN_MESSAGE);
 }
}