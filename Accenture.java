class Accenture{

    public static int NumberOfCarries(int num1, int num2){
        int mod, sum, count=0,pow=0;
        while(num1>10 && num2>10){
            int mod1 = num1%10;
            int mod2 = num2%10;
            sum=mod1+mod2+pow;          
            pow=0;                     
            if(sum>9){                   
                count++;                 
                pow=1;
            }                           
            num1/=10;
            num2/=10;
        }
        return count;
    }
    public static void main(String[]args){
        System.out.println("No. of carries are : "+Accenture.NumberOfCarries(9999, 9999));
    }
}