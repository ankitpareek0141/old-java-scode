class Ankit{

 int x;
static int y;

public void setValue(int n){
y = n;
x = y;
}

public static void showValue(){
System.out.println("Value is = "+y);
}
 
class Pareek
 {
    public void show()
	{
	System.out.println("in Pareek = "+x);
	}
 }
}  //end of class 

class Another{

public static void main(String args[])
{
Ankit aa = new Ankit();
aa.setValue(10);
aa.showValue();
}
}