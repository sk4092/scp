package com.scp.OverrideMain;

public class Application {
    public static void main( String[] args )    {
        System.out.println("Application class main method");
    }
}
 class AnotherApp extends Application{
   public static void main(String[] args) {
  System.out.println("AnotherApp main method");
   }
}
 class TestClass {
    public static void main(String[] args) {
  Application application = new Application();
  application.main(new String[1]);
  Application application1 = new AnotherApp();
  application1.main(new String[1]);
 }
}
