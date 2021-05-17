import java.util.Scanner;

class PatternAlpha{
public static void main(String[] args){
		int i,j;
		int k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Limit of Alphabet pattern :- ");
		k = (int)sc.next().charAt(0);
		System.out.print(k);
		for(i=65;i<=k;i++)
		{
			for(j=i;j>=65;j--)
				System.out.print((char)j+" ");
		System.out.println("\n");
		}
		k = i-2;
  		for(i=k;i>=65;i--){
			for(j=i;j>=65;j--)
				System.out.print((char)j+" ");
		System.out.println("\n");
		}
	}
}