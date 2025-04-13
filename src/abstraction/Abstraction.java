package abstraction;
 abstract public class Abstraction
 {
     abstract void makeSound(); // Abstract method (no implementation)
     void sleep() // Concrete method
     {
         System.out.println("Sleeping...");
     }
 }

    // Subclass providing implementation
    class Dog extends Abstraction
    {
        void makeSound()
        {
            System.out.println("Barking...");
        }
    }


