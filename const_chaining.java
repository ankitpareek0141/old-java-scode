class Ankit{

public Ankit()
 {
 System.out.println("This is A");
 }
public Ankit(int a){
 this();
 System.out.println("This is A 1");
 }
}

class Pareek extends Ankit{

public Pareek()
 {
 this(4);
 System.out.println("This is B");
 }

public Pareek(int a){
 super(12);
 System.out.println("This is B 1");
 }
}

class Example
{
public static void main(String[] args)
 {
  Pareek pp = new Pareek();
 }
}