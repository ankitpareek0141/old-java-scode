import java.util.Scanner;
class LinearSort{

public static void main(String[]args){
int i,j,temp;
Scanner sc = new Scanner(System.in);
int[] arr = new int[5];
System.out.println("\nEnter some values in Array");
for(i=0;i<arr.length;i++){
System.out.print("----->");
arr[i]=sc.nextInt();

}
for(i=0;i<arr.length;i++)
{
 for(j=i+1;j<arr.length;j++)
  {
  if(arr[j]<=arr[i])
   {
   temp=arr[i];
   arr[i]=arr[j];
   arr[j]=temp;
   }    
  }
 }
System.out.println("After sorting");
for(i=0;i<arr.length;i++){
 System.out.println("------>"+arr[i]);
 }
}  //end of main
} //end of class