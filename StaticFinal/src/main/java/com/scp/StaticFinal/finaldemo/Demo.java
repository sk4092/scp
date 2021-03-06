package com.scp.StaticFinal.finaldemo;

class Test
{
  public final void display()		// it is final method and cannot be overridden
  {
    System.out.println("From super class final display() method");
  }
  public void show()		        // it is non-final method and can be overridden
  {
    System.out.println("From super class non-final show() method");
  }
}
public class Demo extends Test
{
  // public void display() {  }         // gives error, see the next screenshot
  public void show()
  {
    System.out.println("From subclass show() method");
  }
/*  public final void display()		// it is final method and cannot be overridden
  {
    System.out.println("From super class final display() method");
  }*/
  public static void main(String args[])
  {
    Demo d1 = new Demo();
    d1.display();                       // calls super class display()
    d1.show();		                // calls subclass show();    see the next screenshot
  }
}