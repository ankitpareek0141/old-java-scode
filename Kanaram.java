class Kanaram{

public static void main(String[] args){
int []arr={6,2,3,3,4};
int count=0,i,j;
for(i=0;i<arr.length-1;i++){
 for(j=i+1;j<arr.length;j++){
    if(arr[i]==arr[j]){
      count++;
      break;
    }
   }
  }
if(count==0)
  System.out.println("Yes Unique");
else
  System.out.println("Not Unique");
}

}