class Example{
private final int x;
private final static int y;

Example(int a){
y = a;
System.out.println("Value in Y : "+y);
}

/*static {
System.out.println("Value in Y : "+y);
}*/

/*public Example(int a){
x=a;
System.out.println("Value in X : "+x);
}*/

/*{
x = 20;
System.out.println("Value in X : "+x);
}*/

public static void main(String[] args)
{
 Example ee = new Example(560);
 }
}