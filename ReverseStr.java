import java.util.Scanner;

public class ReverseStr {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B="";
        B = A.substring(0,0).toUpperCase();
        System.out.println(B);
    }
}