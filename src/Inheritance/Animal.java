package Inheritance;

public class Animal
{
    void makeSound()
    {
        System.out.println("make generic animal sound");
    }
}
 //child class inheritance from animal class
class Dog extends Animal  // use extends keyword
 {
     void sound()
     {
         System.out.println("Woof Woof..!");
     }
 }

