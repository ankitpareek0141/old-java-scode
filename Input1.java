import java.io.*;

class Input{

public static void main(String[] args){
String x;
BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
System.out.println("\n Enter any value : ");
x = bb.readLine();
int y = Integer.parseInt(x)+100;
System.out.println("Value in X : "+x);
}
}