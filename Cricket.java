import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  Scanner input = new Scanner(System.in);
    int tb, tr, run, ball; 
    tb = input.nextInt();
    tr = input.nextInt();
    run = input.nextInt();
    ball = input.nextInt();

    int p = ball/6;
    int q = ball%6;
    float over = ((float)p+(float)q/10);
    float CRR = run/over;

    float RR = (float)tr/50;

    System.out.println("\n50\n"+over+"\n"+String.format("%.2f", CRR)+"\n"+RR);
    if(CRR>=RR)
    	System.out.println("Eligible to Win");
  	else 
    	System.out.println("Not Eligible to Win");
  }
}