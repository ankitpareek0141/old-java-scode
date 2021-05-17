import java.util.TreeSet;

class TreeSetDemo{

public static void main(String[] args){
    TreeSet t = new TreeSet();
    //t.add("Z");	
	//t.add("A");
	//t.add("T");
	//t.add("B");
	//t.add("Z");
	//t.add(1);  throws exception
	t.add(new StringBuffer("A"));
	t.add(new StringBuffer("B"));
	t.add(new StringBuffer("C"));
	t.add(new StringBuffer("D"));
	t.add(new StringBuffer("E"));
 	System.out.println("Values in Set : "+t);
 }
}