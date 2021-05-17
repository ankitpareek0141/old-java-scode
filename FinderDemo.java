class FinderDemo{
int total=0;
public int calc(int x,int y){
 for(int i=1;i<1000;i++){
   if(i%x==0 || i%y==0)
     total = total + i; 
  }
 return total;
 }
public static void main(String[] args){
 FinderDemo ff = new FinderDemo();
 int result;
 result = ff.calc(3,5);
 System.out.println("Sum is : "+result);
 }
}