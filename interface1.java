interface Vehicle
{
void changeGear(int a);
void speedUp(int a);
void applyBreak(int a);
default void fun(){
System.out.println("This just a default fun() in Vehicle interface after JDK 1.8");
}
static void fun1(){
System.out.println("This just a static fun1() after JDK 1.8");
}
}

class Bicycle implements Vehicle{
int gear;
int speed;

public void changeGear(int newGear){
gear = newGear;
}

public void speedUp(int increment){
speed = speed + increment;
}

public void applyBreak(int decrement){
speed = speed - decrement;
}

public void printState(){
System.out.println("State of Bicycle -> ");
System.out.println("Speed is : "+speed+", Gear is : "+gear+"th");
}
} //end of class

class Bike implements Vehicle{
int gear;
int speed;

public void changeGear(int newGear){
gear = newGear;
}

public void speedUp(int increment){
speed = speed + increment;
}

public void applyBreak(int decrement){
speed = speed - decrement;
}

public void printState(){
System.out.println("State of Bike -> ");
System.out.println("Speed is : "+speed+", Gear is : "+gear+"th");
}
} //end of class

class Implementation{
public static void main(String[] args){

Bicycle obj = new Bicycle();
obj.changeGear(4);
obj.speedUp(30);
obj.applyBreak(4);
obj.printState();
obj.fun();

System.out.println("\n");

Bike obj1 = new Bike(); 
obj1.changeGear(3); 
obj1.speedUp(20);
obj1.applyBreak(4);
obj1.speedUp(20);
obj1.applyBreak(4);
obj1.printState();
obj1.fun();
Vehicle.fun1();
}
}