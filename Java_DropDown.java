import javax.swing.*;

class DropDown{

JFrame f;
JComboBox c;
JTextField t;

public DropDown(){
String[] str={"Apple","Orange","Mango","Banana","Pineapple"};

f = new JFrame("Drop Down List");
c = new JComboBox();
t = new JTextField(10);
for(int i=0;i<str.length;i++)
    c.addItem(str[i]);
t.setEditable(false);
f.add(c);
f.add(t);
f.setSize(300,300);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public static void main(String[] args)
{
new DropDown();
}

}