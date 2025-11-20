## 📄 Description - Exercise Statement

This is the sixth task for **Sprint 1 Java Language** in the **Backend Java Course** in ITAcademy (Barcelona, Spain).
There are 3 levels with exercises.

### Level 1

#### Exercise 1

Create a class named **NoGenericMethods** that stores three arguments of the same type, along with methods to store and extract these objects, and a constructor to initialize the three. Ensure that the arguments can be placed in any position in the constructor call.

#### Exercise 2

Create a class named **Person** with the attributes **name**, **surname**, and **age**. Then, create a class named **GenericMethods** with a generic method that accepts three arguments of a generic type. This method should only print the arguments it has received to the screen. In the main() of the main class, call the generic method with different types of parameters.

**Example**: an object of the **Person** class, a **String**, and a primitive type.

This way, you have verified that any type of parameter can be passed in any order.

* * *

### Level 2

#### Exercise 1

Modify the previous exercise so that one of the arguments of the generic method is not generic.

#### Exercise 2

Modify the previous section so that the arguments of the generic method are a list of arguments of indefinite variables.

* * *

### Level 3

#### Exercise 1

For this exercise, you need an interface named **Phone** and three classes: **Smartphone**, **Generic**, and **Main**.

The **Phone** interface should have a method named **call()**. The **Smartphone** class must implement **Phone**, and in addition to the **call()** method, it should also have a method **takePhotos()**.

The **Generic** class should have two generic methods; the first must accept an argument type limited by the **Phone** interface, and the second must accept an argument limited by the **Smartphone** class. From these two methods, call the appropriate methods of **Phone** and **Smartphone**. In the main() of the **Main** class, pass an object of the **Smartphone** class to both generic methods of the **Generic** class.

Can the method limited by the **Phone** interface in the **Generic** class call the **takePhotos()** method?

## 📋 Requirements

Developed with:
- *IDE* : IntelliJ IDEA 2025.2.4 (Community Edition)
- *Java version* : openjdk 21.0.8 2025-07-15

## 🛠️ Installation

Fork or download this repo.

## ▶️ Execution

Run with *IntelliJ IDEA 2025.2.4* or import to your favorite IDE.

This code has been only tested under *Java version* : openjdk 21.0.8 2025-07-15.


