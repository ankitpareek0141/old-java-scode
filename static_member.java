class Ankit{
static int y=5;
public static void display(){
System.out.println("This is Hello World....");
}

public void print(){
System.out.println("This is Print function");
}
}

class Pareek extends Ankit{

static{
y=4;
}
public static void display(){
System.out.println("This is 2nd Hello World....");
}

public void print(){
System.out.println("This is 2nd Print function");
}
}


class Demo{

public static void main(String[] args){
Ankit aa = new Pareek();
//aa.display();
//aa.print();
System.out.println("Y:"+Pareek.y);
}
}