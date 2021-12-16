## Due Date : Decembber 16 2021  Submitted date: December 16 2021
# Write a program to demonstrate all three types of constructors in java
```
class Constructors{
	String msg;
	public Constructors(){
		System.out.println("Default Constructor");
	}
	public Constructors(String msg){
		this.msg = msg;
		System.out.println("Parameterized Constructor by:"+msg);
	}
	public Constructors(Constructors c){
		System.out.println("This is Copy Constructor by: "+c.msg);
	}
	public static void main(String[] args){
		Constructors defaultConstructor = new Constructors();
		Constructors parameterizedConstructor = new Constructors("Prashant");
		Constructors copyConstructor = new Constructors(parameterizedConstructor);
	}	
}
```
# Write a program to implement stack using array
```
 // Stack implementation in Java

class Stack {

  // store elements of stack
  private int arr[];
  // represent top of stack
  private int top;
  // total capacity of the stack
  private int capacity;

  // Creating a stack
  Stack(int size) {
    // initialize the array
    // initialize the stack variables
    arr = new int[size];
    capacity = size;
    top = -1;
  }

  // push elements to the top of stack
  public void push(int x) {
    if (isFull()) {
      System.out.println("Stack OverFlow");

      // terminates the program
      System.exit(1);
    }

    // insert element on top of stack
    System.out.println("Inserting " + x);
    arr[++top] = x;
  }

  // pop elements from top of stack
  public int pop() {

    // if stack is empty
    // no element to pop
    if (isEmpty()) {
      System.out.println("STACK EMPTY");
      // terminates the program
      System.exit(1);
    }

    // pop element from top of stack
    return arr[top--];
  }
```
# Write a program to implement uses of Abstract Class .
```
AbstractClass.java
abstract class AbstractClass{
	abstract void help();
}

AbsDemo.java
class AbsDemo extends AbstractClass{
	public void help(){
	System.out.println("Abclass methode overide....");
	}
	public static void main(String[] args) {
		AbstractClass abClass = new AbsDemo();
		abClass.help();
	}
}

```
# Write a program to achieve multiple inheritance in java.
```
package Inheritance;

interface Child1 {

    default void show()
    {
        System.out.println("Hello from child 1");
    }
}
 
interface Child2 {

    default void show()
    {
        System.out.println("Hello form Child 2 ");
    }
}
 
class MultipleInheritance implements Child1, Child2 {
 
    public void show()
    {
        Child1.super.show();
        Child2.super.show();
    }
 
    public static void main(String args[])
    {
        MultipleInheritance childern = new MultipleInheritance();
        childern.show();
    }
}
```
# Write a program to find sum and difference of two numbers using command line arguments
```
class SumDiff{
	public static void main(String[] args){
	int a,b;
	a = Integer.parseInt(args[0]);
	b = Integer.parseInt(args[1]);
	int sum = a+b;
	int diff = a-b;
	System.out.println("The sum is :"+sum);
	System.out.println("The difference is :"+diff);
	}
}
```
# Write a program to demonstrate use of this, super and final
```
class Super {
    int value = 20;
   }
   
   class Example extends Super {
    int value = 10;
    void display() {
     System.out.println(super.value);// prints super value 
    }
    void display2(int value){
     this.value = value;//changes to new value 
     System.out.println(this.value);// prints new value
    }
   
    public static void main(String args[]) {
     Example e = new Example();
     e.display();//this returns value from the super class that is parent class Super.
     e.display2(45);//new value is displayed
    }
   }
   ```
   ```
   final class Final{  //thid ensures that it cannot be extended to other class.
    public static void main(String[] args) {
        final double PI = 3.1415;//this value cannot be changed to another because this must be constant throughout the program.
        int radius = 7;
        double area = PI*radius*radius;
        System.out.println("The area of circle is:"+area);
    }
   }
   ```
# Write a program to demonstrate the use of default method in the interface.
```

interface Example{

    default void display()
    {
        System.out.println("Hello from Default Method");
    }
}

 
class Interface implements Example{
 
    public static void main(String args[])
    {
        Interface i1 = new Interface();
        i1.display();
    }
}
```
# Write a program to demonstrate the use of static methos and static variable
```
class Static
{
	static int counter;
	static int count;
	public void increment()
	{
		counter++;
	}
	public static int getCounter()
	{
		count++;
		return counter;
	}
    public static void main(String[] args)
	{
		Static count1 = new Static();
		Static count2 = new Static();
		count1.increment();
		System.out.println(Static.getCounter());//we can use the classname directly when the method and variables are static
		count2.increment();
		System.out.println(Static.getCounter());
	}
}
```
