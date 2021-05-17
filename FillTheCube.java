import java.util.Scanner;

public class FillTheCube {
    
    public static void main(String[] args){
        int n,count=0, i, j;
        char qq;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        char arr[][] = new char[n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                qq = sc.next().charAt(0);
                arr[i][j] = qq;
            }
        }

        for(j=0;j<n;j++){
            for(int k=0;k<n;k++){
                if(arr[j][j] == 'D')
                    count+=1;
            }
        }

        float jj = (float)Math.sqrt(count);
        int br = Math.round(jj);
        System.out.println(br);
    }
}