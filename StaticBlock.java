class StaticBlock{
static int i=10;

static
{
i = 10;
System.out.println("static block called..!");
}

public static void main(String[] args){
 System.out.println("Main called...!");
 }
}