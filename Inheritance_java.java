class First{
int age;

First(){
age = 0;
}

First(int a){
age = a;
}
First(First ff){
age = ff.age;
}

void show(){
System.out.println("Your Age : "+age);
} // end of function
}


class Second extends First{

float marks;

Second(){
marks = 0.0f;
}

Second(int x,float m){
super(x);
marks = m;
}

Second(Second ss){
super(ss);
marks = ss.marks;
}

void show(){
super.show();
System.out.println("Your Marks : "+marks);
}
}


class Third extends Second{
String name;

Third(){
name = "Unknown";
}

Third(int r,float m,String n){
super(r,m);
name = n;
}

Third(Third ss)
{
super(ss);
name = ss.name;
}

void show(){
super.show();
System.out.println("Your Name : "+name+"\n");
}
}

class Student{
public static void main(String args[]){
Third ss = new Third(21,72.0f,"Sumit");
Third ss2 = new Third(ss);
ss.show();
ss2.show();
}
} 