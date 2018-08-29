public class Greeting {
  public void sayHello() { System.out.println("Hello!"); }
  private String greeting;

  public Greeting(String greeting) {
    this.greeting = greeting;
  }

 public void greet() {
   System.out.println(greeting);
 }

}
