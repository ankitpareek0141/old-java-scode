public class MergeArray {
    
    public static void main(String[] args){
        int arr1[] = {1,3,6,7,9};
        int arr2[] = [2,4,6,8,10,12,14];
        int arr3[] = new int[ arr1.length + arr2.length];

        int p=0,q=0,i=0;

        while(p <arr1.length && q<arr2.length){
                if(arr1[p]<arr2[q]){
                    arr3[i++] = arr1[p];
                    p++;
                }
                else if(arr1[p]>arr2[q]){
                    arr3[i++] = arr2[q];
                    q++;
                }
        }
        for(int j=i;j<arr3.length;j++){
                arr3[j] = arr2[++q];
            }
        }
    }
