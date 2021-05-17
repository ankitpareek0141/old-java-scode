public class AccentureString {
    
    public static void hyphenString(String str){
        String a = "", b = "";
        char arr[] = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='-')
                a+=arr[i];
            else
                b+=arr[i];
        }
        System.out.println("=====> "+(a+b));
    }

    public static void main(String[] args){
        AccentureString.hyphenString("Move-Hyphens-to-Front");
    }
}
