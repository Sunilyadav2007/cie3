class Animal{
    void eat(){
        System.out.println("This animal eats:");
    }
    void sleep(){
        System.out.println("This animal sleeps:");
    }
}
class Dog extends Animal{
    void Bark(){
        System.out.println("This dog barks:");
    }
}
public class SingleInheritance {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.eat();
    d.sleep();
    d.Bark();
  }
}
