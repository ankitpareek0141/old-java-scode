import java.util.*;
class Collection_Java{

public void display(){
ArrayList l = new ArrayList();
l.add("C");
l.add("D");
l.add("D");
l.add(null);
l.add("1");
l.add("4");
l.add("1");
System.out.println(l);
l.remove(1);
System.out.println(l);
l.add(1,"O");
l.add("Game");
System.out.println(l);
}
public static void main(String[] args){
//Collection_Java jj = new Collection_Java();
jj.display();
}
}