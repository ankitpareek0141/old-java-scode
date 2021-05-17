public class Accenture2 {

    public static String replaceCharacter(String str, char a, char b){
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a')
                arr[i] = 'p';
            else if(arr[i]=='p')
                arr[i] = 'a';
        }
        str="";
        for(int i=0;i<arr.length;i++){
            str+=arr[i];
        }
        return str;
    }
    
    public static void main(String[] args){
        System.out.println("String are : "+replaceCharacter("apples",'a','p'));
    }
}
