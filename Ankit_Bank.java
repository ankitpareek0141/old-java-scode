import java.util.Scanner;

class Bank{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

int withdrawl;
int balance = 10000;

System.out.print("Enter the Withdrawl Amount : ");
withdrawl = sc.nextInt();
 
 try{
 if(balance<withdrawl)
    throw new ArithmeticException("Insufficient Balance");
 balance = balance - withdrawl;
 System.out.println("Transaction Successfull...!");
 }
 catch(ArithmeticException exp){
  System.out.println("Exception : "+exp.getMessage());
  }
 }    //end of main
}  //end of class