class A{

static int y = 5;
}

class B extends A{

static{
y=4;
}
}

class Demo{

public static void main(String[] args){
 System.out.println("Value in y : "+B.y);
 }
}