
public class TestDogs {
    public static void main(String[] args) {
        // Creating and displaying dog 1
        DogTriathlonParticipent dog1 = new DogTriathlonParticipent("Bowser", 2, 85, 89, 0);
        dog1.display();

        // Creating and displaying dog2
        DogTriathlonParticipent dog2 = new DogTriathlonParticipent("Rush", 3, 78, 72, 80);
        dog2.display();

        // Creating and displaying dog3
        DogTriathlonParticipent dog3 = new DogTriathlonParticipent("Ginger", 3, 90, 86, 72);
        dog3.display();

}
}


/*  Lesson Description and notes:
  *
 *  The TestDogs class serves as the driver class to test the DogTriathlonParticipant class. 
 *  It demonstrates object creation, usage, and interaction in a Java program.
 *
 *  1. Object Creation: Instances of the DogTriathlonParticipant class (dog1, dog2, dog3) are created using the 'new' keyword.
 *     The constructors for these objects require a name (String), number of events participated in (int), and three scores (int) as parameters.
 *
 *  2. Method Invocation: After creating the DogTriathlonParticipant objects, their 'display()' method is called to print out the details of each dog.
 *
 *  The program is a clear demonstration of how object-oriented programming works in Java. It shows how classes can be designed (DogTriathlonParticipant)
 *  to encapsulate data (name, scores, etc.) and methods (display()). It also demonstrates how these classes can then be used to create objects in another
 *  class (TestDogs).
 *
 *  Key points to remember from this lesson:
 *  1. Classes are blueprints for creating objects. They encapsulate data and the methods that operate on that data.
 *  2. Objects are instances of classes. You create an object using the 'new' keyword followed by the class constructor.
 *  3. A class can contain a 'main' method. This is the entry point for any Java application. When you run the application, 
 *     the code inside the 'main' method is executed.
 *  4. The 'main' method can create and manipulate objects of other classes. In this case, it's creating and manipulating DogTriathlonParticipant objects.
 * 
 */