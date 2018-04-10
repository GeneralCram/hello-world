package helloWorld;
public class Dog
{
       private static int count;     //static member
  
       public Dog()
       {       count++;
       }
       
       public static void main(String a[])
       {   Dog d=new Dog();
           Dog dd=new Dog();
           new Dog();
           Dog.display();     
        }
private static void display()
{
      System.out.println(count);
}
}