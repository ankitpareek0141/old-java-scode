public class String_Test {
    
    public static void main(String[] args){
        String smallest = "";
        String largest = "";
        String str = "welcometojava";
        int x=0;
        while(x<=str.length()-3){
            String s = str.substring(x,x+3);
            if(smallest=="" && largest=="")
                smallest=largest=s;
            else{
                if(s.compareTo(smallest)<0)
                    smallest = s;
                else if(s.compareTo(largest)>0)
                    largest = s;
            }
            // System.out.println(s);
            x++;
        }
        System.out.println(smallest+"\n"+largest);
    }
}
