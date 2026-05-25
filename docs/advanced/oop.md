# Object-Oriented Programming

## The Four Pillars

### 1. Encapsulation
Hide internal details, expose only necessary methods.

```java
public class BankAccount {
    private double balance;  // Private field
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public double getBalance() {
        return balance;
    }
}
```

### 2. Inheritance
Reuse code by extending classes.

```java
public class Animal {
    public void eat() {
        System.out.println("Eating...");
    }
}

public class Dog extends Animal {
    public void bark() {
        System.out.println("Woof!");
    }
}
```

### 3. Polymorphism
One interface, multiple implementations.

```java
Animal myDog = new Dog();
myDog.eat();  // Works!
```

### 4. Abstraction
Simplify complex systems by modeling classes.

```java
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private double radius;
    
    double area() {
        return Math.PI * radius * radius;
    }
}
```

## Benefits of OOP

✅ **Reusability** - Write once, use many times  
✅ **Maintainability** - Easy to update and debug  
✅ **Scalability** - Build larger applications  
✅ **Security** - Data hiding with encapsulation  

!!! success "Congratulations!"
    You've completed the basics! Keep practicing to master Java.
