import java.util.*;          // Comparable belongs from java.lang package  

class LengthSort implements Comparator{
   
    public int compare(Object obj1, Object obj2){
        String str1 = obj1.toString();
        String str2 = obj2.toString();
        int x = str1.length();
        int y = str2.length();
        if(x<y)
            return -1;
        else if(x>y)
            return +1;
        else
            return str1.compareTo(str2);
    }
    public static void main(String[] args){
        TreeSet tt = new TreeSet(new LengthSort());
        tt.add("A");
        tt.add(new StringBuffer("AA"));
        tt.add("BB");
        tt.add(new StringBuffer("XYZ"));
        tt.add("WYTD");
        tt.add("XYZ");

        System.out.println(tt);
    }
}