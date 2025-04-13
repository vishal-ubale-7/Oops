package polymorphism;

public class Animal
{
   void  makeSound()
   {
       System.out.print("some animal sound");
   }
}
class Dog extends Animal
{
    @Override
    void makeSound()
    {
        System.out.println("woof woof...!");
    }
}
