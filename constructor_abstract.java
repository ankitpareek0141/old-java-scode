class Ankit{

Ankit(){
System.out.println("This is Constructor....");
}
}

class Pareek extends Ankit{

}

class Demo{

public static void main(String[] args){
Ankit aa = new Pareek();
}
}