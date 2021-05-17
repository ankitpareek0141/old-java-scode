import java.util.Comparator;
import java.util.TreeSet;

class TreeSetDemo17 implements Comparator{

    public int compare(Object obj1, Object obj2){
        String str1 = (String)obj1;
        String str2 = (String)obj2;
        return -str1.compareTo(str2);
    }
    public static void main(String[] args){
        TreeSet tt = new TreeSet(new TreeSetDemo17());
        tt.add("Ankit");
        tt.add("Pullu");
        tt.add("Divisha");
        tt.add("Shobha");
        tt.add("Neeta Maa");
        tt.add("Mahendar");

        System.out.println("Here is the Set : "+tt);   // default natural sorting
    }
}