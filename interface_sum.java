interface Sum{

public int sum(int a,int b);
default int multiply(int a, int b){
return (a*b);
}
}


class Addition implements Sum{

public int sum(int a, int b){
return(a+b);
}

public static void main(String []args){
Sum aa = new Addition();
Addition bb = new Addition();
 int c;
 c = aa.sum(10,20);
 System.out.println("Sum of two numbers : "+c);
 c = bb.multiply(50,50);
 System.out.println("Multiply of two numbers : "+c);
 }
}