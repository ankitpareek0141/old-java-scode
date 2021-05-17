import java.util.Scanner;

class FactorSum{



    public static boolean checkFactor(int a, int b, int c){
        if(a==0 && b!=0 && c!=0)
            return false;
        else if(a==0 && b==0 && c!=0)
            return true;
        else if(a<=(b+c))
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        int t;
        int n;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(t>0){
            n = sc.nextInt();
            int c1=0,c2=0,c3=0;
            int []arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                arr[i] = arr[i]%3;
                if(arr[i]==0)
                    c1++;
                else if(arr[i]==1)
                    c2++;
                else if(arr[i]==2)
                    c3++;
            }
             if(checkFactor(c1,c2,c3))
                 System.out.println("Yes");
             else
                 System.out.println("No");
            t--;
        }
    }                // end of main()
}       // end of class