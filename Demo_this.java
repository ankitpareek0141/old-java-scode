class Demo_this{
int l,b,h;

public void fun(int l,int b,int h){
this.l = l;
this.b = b;
this.h = h;

System.out.println("l : "+this.l+"b : "+this.b+"h : "+this.h);
}
public static void main(String[] args){
 Demo_this dd = new Demo_this();
 dd.fun(120,230,340);
 }
}