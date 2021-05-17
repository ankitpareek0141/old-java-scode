class Ankit{
int x;

public Ankit(){
System.out.println("A");
}

public Ankit(int a){
x = a;
System.out.println("Parameterised Constructor...");
}

}

class Pareek extends Ankit{
int y;

public Pareek(){
super();
System.out.println("B");
}

public Pareek(int x){
super(5);
y = x;
System.out.println("another constructor...");
}

}

class Demo{
public static void main(String[] args)
 {
  Pareek pp = new Pareek();
  Pareek p = new Pareek(4);
 }
}