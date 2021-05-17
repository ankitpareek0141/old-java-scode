import java.util.Scanner;
class Sorting{

public void bubbleSort(int arr[],int n){
  int i,j,temp,flag=0;
  
  for(i=0;i<n-1;i++){
    for(j=0;j<n-i-1;j++){
       if(arr[j]>arr[j+1]){
          flag = 1;
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
       }
    }
   if(flag==1)
	break;
  }  // end of outer loop
  for(i=0;i<n;i++){
    System.out.println(" "+arr[i]);
  }
} // end of function

public static void main(String[] args){
 Sorting ss = new Sorting(); 
 int arr[] = {20,15,25,40,16,19,23,27};
 //int arr[] = new int[8];
 Scanner input = new Scanner(System.in);
 ss.bubbleSort(arr,8);
 }
}