import java.util.Scanner;
class SpiralDemo{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int n,i,j,count=0;
	
	System.out.println("Enter the dimension of Matrix");
	n = input.nextInt();
	
	int [][]arr = new int[n][n];
	int top=0,down=n-1,left=0,right=n-1,dir=0;
	
	System.out.println("Spiral Traversal : ");
	while(left<=right && top<=down){
		if(dir==0){
			for(i=left;i<=right;i++)
				arr[top][i]=++count;
			top+=1;
		}
		else if(dir==1){
			for(i=top;i<=down;i++)
				arr[i][right]=++count; 
			right-=1;
		}
		else if(dir==2){
			for(i=right;i>=left;i--)
				arr[down][i]=++count;
			down-=1;
		}
		else if(dir==3){
			for(i=down;i>=top;i--)
				arr[i][left]=++count;
			left+=1;
		}
		dir+=1;
	}
	for(i=0;i<n;i++){
		for(j=0;j<n;j++)
			System.out.print("   "+arr[i][j]);
		System.out.println();
	}
} // end main
} // end of class