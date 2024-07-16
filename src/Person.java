public class Person {
    String name = "kam";
    int age = 5;
    final String nationality = "Turkish";
    public  static  void myMethod(){
        System.out.println("my method is working ");
    }
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
}
