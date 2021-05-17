import java.util.*;

class StackDemo{

public static void main(String[] args){
Scanner input = new Scanner(System.in);
Stack ss = new Stack();
int num,i;
String str;

for(i=0;i<5;i++){
ss.push(input.next());
}
System.out.println("Data is : "+ss);
System.out.println("Top Element : "+ss.peek());

ListIterator li = ss.listIterator();
System.out.println("\nForward Traversing in ListIterator...");
	while(li.hasNext()){
		str = (String)li.next();
		System.out.print(str+"  ");
	}
li.add("Anku");
li.add("Pullu");
System.out.println("\nBackward Traversing in ListIterator...");
while(li.hasPrevious()){
str = (String)li.previous();
System.out.print(str+"  ");
}
}
}