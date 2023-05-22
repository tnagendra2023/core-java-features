- Here are the SOLID principles in Java:

1. Single Responsibility Principle (SRP):
   A class should have only one responsibility.
   Example: A `UserRepository` class should be responsible for database operations related to users, such as creating, updating, and retrieving user data.

2. Open-Closed Principle (OCP):
   Software entities should be open for extension but closed for modification.
   Example: Instead of modifying the existing `Calculator` class to add new operations, you can create a new class that extends `Calculator` and adds the new functionality.

3. Liskov Substitution Principle (LSP):
   Subtypes should be substitutable for their base types without affecting the correctness of the program.
   Example: If you have a `Vehicle` interface, any implementation such as `Car` or `Motorcycle` should be able to replace the `Vehicle` interface without breaking the behavior expected from the `Vehicle` interface.

4. Interface Segregation Principle (ISP):
   Clients should not be forced to depend on interfaces they do not use.
   Example: Instead of having a single interface with multiple methods, split it into smaller interfaces. For instance, separate a general `Animal` interface into `Swimmable`, `Flyable`, and `Runnable` interfaces.

5. Dependency Inversion Principle (DIP):
   High-level modules should not depend on low-level modules. Both should depend on abstractions.
   Example: Instead of directly creating an instance of a specific implementation class, use an interface or an abstract class as the dependency and inject the implementation at runtime.

These SOLID principles help in designing maintainable and extensible code by promoting separation of concerns, modularity, and abstraction. They facilitate code reuse, testability, and flexibility in adapting to changes. Applying these principles can lead to cleaner and more robust Java code.