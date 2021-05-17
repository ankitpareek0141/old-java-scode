import java.util.*;

class TreeSetDemo18 implements Comparable, Comparator{

    private int id;
    private String name;

    TreeSetDemo18(){}

    TreeSetDemo18(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return id+"  "+name;
    }

    
    public int compareTo(Object obj2){
        int id1 = this.id;
        TreeSetDemo18 t = (TreeSetDemo18)obj2;
        int id2 = t.id;
        if(id1<id2)
            return -1;
        else if(id1>id2)
            return +1;
        else
            return 0;
    } 

    public int compare(Object obj1, Object obj2){
        TreeSetDemo18 tt1 = (TreeSetDemo18)obj1;
        TreeSetDemo18 tt2 = (TreeSetDemo18)obj2;
        String str1 = tt1.name;
        String str2 = tt2.name;

        return str1.compareTo(str2);
    }

    public static void main(String[] args){
        TreeSetDemo18 e1 = new TreeSetDemo18(105,"Pullu");
        TreeSetDemo18 e2 = new TreeSetDemo18(102,"Himanshu");
        TreeSetDemo18 e3 = new TreeSetDemo18(101,"Ankit");
        TreeSetDemo18 e4 = new TreeSetDemo18(104,"Akhil");
        TreeSetDemo18 e5 = new TreeSetDemo18(106,"Simran");
        TreeSetDemo18 e6 = new TreeSetDemo18(107,"Sumit");
        TreeSetDemo18 e7 = new TreeSetDemo18(103,"Shiya");
        TreeSet tt = new TreeSet(new TreeSetDemo18());
        tt.add(e1);
        tt.add(e2);
        tt.add(e3);
        tt.add(e4);
        tt.add(e5);
        tt.add(e6);
        tt.add(e7);
        System.out.println(tt);
    }
}