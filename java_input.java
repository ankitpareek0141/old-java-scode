import java.util.Scanner;
class Input{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int x;
String str;
System.out.println("\nEnter any name : ");
str = sc.nextLine();
System.out.println("\nHere is what you've entered : "+str);
System.out.println("\nEnter any Value : ");
x = sc.nextInt();
System.out.println("\nHere is what you've entered : "+x);
}
}