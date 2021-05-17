class Ankit{

int a;
public Ankit(int x){
a=x;
System.out.println("Constructor of Ankit...");
System.out.println("a: "+a);
}

}


class Pareek extends Ankit{
public Pareek(){
super(10);
System.out.println("Anku");
}
}



class Demo{

public static void main(String[] args){
 Pareek aa = new Pareek();
 }
}

