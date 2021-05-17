import java.util.*;

public class Sliding_Window {


    public static String slideWin(int[] arr, int k, int n){
        if(n<k)
            return "Invalid Input!!!";
        int max_SUM = 0, i;
        for(i=0;i<k;i++)
            max_SUM += arr[i];
        int window_SUM = max_SUM;
        for(i=k;i<n;i++){
            window_SUM += arr[i] - arr[i-k];
            max_SUM = Math.max(max_SUM, window_SUM); 
        }    
        return ""+max_SUM;
    }
    public static void main(String[] args){
        int arr[] = {5,2,-1,0,10};

        System.out.println("\nMAX SUM IN AN ARRAY  :  "+slideWin(arr, 3, 5));
    }    
}