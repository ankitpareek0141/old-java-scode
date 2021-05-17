class Pattern1{
public static void main(String[] args){
int i=5,j,n=65;
for(i=0;i<5;i++){
 	for(j=n+i;j>=n;j--)
		System.out.print((char)j+" ");
	System.out.println("");
}
for(i=i-2;i>=0;i--)
	 {
		for(j=n+i;j>=65;j--)
			System.out.print((char)j+" ");
		System.out.println("");
     }
}
}