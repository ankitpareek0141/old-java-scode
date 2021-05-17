class Initialization{
private int x;

{   // initialization block 
 System.out.println("Your are in Initialization Block 1 : "+x);
 x = 10;
}

{
 System.out.println("You are in Initialization Block 2");
}

{
 System.out.println("You are in Initialization Block 3");
}

Initialization(){
 System.out.println("You are in Constructor, x : "+x);
}

public static void main(String[] arr){ 
 Initialization obj = new Initialization();
 Initialization obj1 = new Initialization();
 }
}


// compiler compiled the all Initialization block from top to bottom 