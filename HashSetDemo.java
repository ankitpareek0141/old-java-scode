import java.util.*;

class HashSetDemo
{
public static void main(String[] args)
 {
 LinkedHashSet hh = new LinkedHashSet();
 hh.add("a");
 hh.add("a");
 hh.add('b');
 hh.add('f');
 hh.add('e');
 hh.add('y');
 hh.add('t');
 hh.add(null);
 hh.add(null);
 System.out.println(hh);
 System.out.println(hh.size());
 }
}