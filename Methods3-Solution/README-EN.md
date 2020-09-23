#Exercises Methods 3
Competence: _I can create (static) methods with arguments and return types._

The exercises can be found in the different submodules.    
## Summary
A method is a collection of statements (lines of code) that combined perform a certain function. Until now you have only used methods to do certains tasks for you, like ```printLine``` or ```pause```.

In general, methods are used to do three things:    
* prevent code duplication (or: make it easy to reuse code)    
* make your code more readable 
* and finally hide implementation details.  

The first two of these benefits (reuse code / prevent code duplication and improve readability), will be covered in this competence. The last one, hiding implementation details, will be covered in a later course.

All methods have a similar structure:
```
public <returnType> methodName(<parameters>) {
      // One or multiple lines of code, including a "return" statement.
}
``` 

(Note that in this course, we'll only use `public` methods.)

An example method could look like this:
```java
/**
 * Method that determines whether a number is even or odd.
 */
public boolean isEven(int number) {
    if(number % 2 == 0) { // The number is even.
        return true;
    } else {
        return false;
    }   
}
```
This method determines whether or not any provided integer (known as `number` inside this method), is odd or even. In this case: if the number is even, the method will return the boolean "true", otherwise "false" will be returned. A method always has a first line that has some information about the method itself, also known as the _method signature_.  (the line before the `{.. }`). 

Parts that **must** be filled from the method signature are the return type (in this case `boolean`) and the method name (e.g. `isEven`).Methods names are written in _camelCase_ (meaning that the first letter of the first word is lowercase, followed by uppercase letters for all remaining words) and must be unique to a certain scope (e.g. within `SaxionApp`). What a method returns can be of any type known to your application, so booleans, int's, doubles and Strings could also be returned. Altneratively, a method can also return `void` which means that it has no return value. 

Any parameters the method may take are between the parentheses (`(...) `). Of each argument, the type must be mentioned, followed by a variable name which will help identify the input parameter within the code of the method. Any method may have 0 or more parameter(s). The data you pass to the parameter is called the argument(s).

It is good to remember that all methods, that do **not** return void, must have a return statement in all possible outcomes. As this piece of code has an if-else statement, two return statements are supplied to handle both situation. There is no maximum to the number of "return" statements that you can have in a method, as long as there is at least one (unless the return type is void, than the return statement is optional).

Note that the method mentioned above can also be abbreviated to just one line (but wasn't for teaching purposes):

```java
public boolean isEven(int number) {
    return number % 2 == 0;
}
```

A method can be used by invoking it as you have seen before:

```java
// From within the run() method or other methods:

int someValue = 3;

boolean someValueIsEven = isEven(someValue);

SaxionApp.printLine("Is " + someValue + " even? " + someValueIsEven);
```
Please note that there is no link between the _names_ of the variables `someValue` (in the run() method) and `number` (within the method `isEven`). Only the actual value (3) is passed to the method, disregarding the name of the variable it might be stored in from any calling methods.

## Introduction
In the field of programming, a lot of code has already been written and made available by other programmers. Most of this code comes in the form of classes (which you'll learn about in this course) and _methods_. And as you are now also a programmer, it's time for you to contribute to the massive world of code as well and we'll start off by teaching you how to create methods.

As you have already learned, methods are _blocks_ of code that combined form a specific function. You have used methods to print text to the screen, draw a line over the screen, create rectangles, etc. etc. You have also used methods to do some calculation for you like random a value or perhaps create a color. 

In this section you'll learn more about how to create methods and what are good practices in creating methods. So let's get going and have a look at how you do this. Weirdly enough however, the first thing we should discuss is a method name and what it should do. 

### On method names and purposes
If you were to ask programmers at _how_ they remember all the methods they would use, you'll get the answer that in general **they won't**. With more experience you'll start to see patterns in method names and at a certain point you can almost guess what a method will do based on it's name. This does however mean you'll have to stick to some good practices.

For now, remember this:
1) A method name is always written in some of camel case (or dromedaris case actually). This means the first letter of a method start with a lower cased letter, followed by every word capitalized. Some examples `printLine`, `drawLine`, `saveImage`, `generateRandomNumber`, etc.
2) Try to get a verb into your method name. `printLine` contains the verb "print" which should give you an idea on what the method does.
3) A method name should be kept as small as possible while still being easy to understand, so keep the method name short: `printLine` is good enough, in comparison to `printLineOnSaxionApp(...)` or `method1(...)`.
4) A method should always try to do _ONE_ thing and do this well. `printLine` is clear: you only expect one thing.. Consider `promptUserForInputCalculateAverageWriteResultToFile` might be a method that takes on too much work. 

Look at the examples below to see how **not** to do it.

```
public void awesome() {...}       // While obvioulsy an awesome method.. what does it do? 
public void makeXAwesome() {...}  // Slightly better, but what does "making something awesome" mean? 
public void exerciseOne() { ... } // Yeah.. what exercise? 
public void partOne() { .. }      // I guess it comes before partTwo()?
```

Choosing a proper method name is difficult at first but will become easier over time. For now: Don't be afraid to change a method name to reflect it's real purpose after you make some changes. Changing a method name in IntelliJ is really easy.. so don't be afraid to do it!

Ok! Now that we have an idea on how to name our creations, let's build a method! But not before *where* we should create them..

### Where to create methods?
Methods always belong to some "Class" (we'll talk more about classes in the future), like the `SaxionApp` or `Application`. For now we'll focus only on creating methods in our own Applications, so let's have a look at the general layout of our Application file and where our methods should go:
```java
import ... // Import statements come ALWAYS first.

public class Application implements Runnable { // This is always the same for this course.. Note the "open" curly bracket. All code between these brackets belong to "our Application".

    public static void main(String[] args) { ...  } // This method is always in your Application file.

    public void run() { ... } // this method is also always in your Application file.

    public void yourMethodGoesHere() { ... } // Your code goes in here !!
   
    public int yourOtherMethodGoesHere() { ... }  // And here.. etc!

} // <-- Note this curly bracket. You need this one to close your program!
```

The curly brackets (`{...}`) in Java are used to form "blocks" (a.k.a. "scopes"), similarly to what you have seen with the if-statements and while-statements. The same goes for methods.. you can just place them "below" (or above, order does not matter) your existing `run` and `main` methods. (You need to keep those two!).

Note that within programming scopes are isolated from each other, meaning you **cannot** access variables created in a different scope. So whenever you create a method, all variables that are used within that method are automatically "hidden" from any other method.

Did you find a nice suitable place for your method and are sure you won't run into scoping issues? Then it's time to create one! Let's look at the layout of all methods.

### General method layout
In essence, every method looks like this:
```java
public <someReturnType> methodName(<listOfParameters>) {
  // Lines of code..
}
```
The first line of the method definition before the curly brackets (`{...} `) is known as the _method signature_. The method signature is used to provide some more information about your newly created method. At the very least it contains the name of the method (that you can use to invoke the method), a list of parameters the method might need and what the method will return (a.k.a. as the return type). We have discussed the naming conventions before, so we'll leave that for now.

The word `public` for this course should be considered mandatory. There are other words you might put here (such as `static`, `private`, `abstract`, etc.) but all these topics are out of the scope for this course. In this course you only need to remember the word `public`. 

Let's focus a bit more on the return type and list of parameters.

#### Return types
Methods are created to be reusable and to improve the structure and readability of your applications. In general you can have two types of methods, methods that perform a specific function and have some immediate effect on your application (like draw a line, print text) or methods that can do some calculations or preprocess some data for you to be used later. In the first situation a method can just do whatever it was instructed to do, such as print a line `printLine`. There is no side-effect of invoking this method, nor do we expect any results from it. It'll just as it is told and print some text.

The other category of methods should be seen as methods that can produce partial results, such as reading an integer `readInt` from the user and using that value to do something else with. In that case you consider a method to be a "robot" (or "worker") that performs one task for you (the programmer) and returns with you with the result of that job. 

Methods that are supposed to return something must declare what type of value they are going to return in their _method signature_. This can be all the types you have seen before (and much more) and you can do this by just entering the type you want to use. An example of a very simple method:
```java
public int plus(int valueOne, int valueTwo) {...}
```
In this example, the `plus` method declares that it will return an integer value. The inner workings are left out, but you can imagine that this method adds the value of the two provided integers. 

Let's see it it in action! You can use a method like this as a statement or even as an expression your code:

```java
SaxionApp.printLine("The result of 3 + 4 is " + plus(3, 4));
```
or
```java
int result = plus(3, 5) + plus (10, 15);
```

In case you have created a method that does not require any return value (e.g. `printLine` or `drawHouse`), you **also** must specify a return type. As you can not leave the return type field open, Java has created a special return type in case you don't want to return anything called `void`.
```java
public void drawHouse(int xCoordinate, int yCoordinate) {...} 
```   
Methods that return void cannot be used in variable assignments or expressions as shown above. They can also be used as separate stand-alone instructions, such as:
```java
SaxionApp.printLine("Hi!");

drawHouse(10, 20);
```

Now that we know what to do with our return types, let's look at the last ingredient: the parameters.

#### Parameters

The last part of the _method signature_ is the list of parameters. For each parameter, you must specify the type and give it a _name_, similar to other variables you have created. This could look like:
```java
public int plus(int valueOne, int valueTwo) {...}
```
In this case, two parameters (valueOne and valueTwo) of type int must be provided during the method invocation, such as:
```java
int result = plus(3, 5);
```
In all other situations (with more or less parameters, parameters of the wrong type, etc.), Java will produce an error.

Methods don't need to have parameters, such as the `pause` or `clear` methods from SaxionApp. In that case, you don't have specify a type nor the name, but still are required the put the structural parantheses in the method signature.
```java
public void run() { ... } 
```
Technically, there is no limit to the amount of parameters can have, however it is quite common to have "at most" 4 parameters. Having more than 4 arguments usually means that your method wants to do "too much" which point 4 mentioned earlier (a method should do _one_ thing and one thing well). Once again, don't worry too much about this in this stage, but try to improve your methods as you go along.

#### Phrasing: Parameters vs. Arguments
If you are reading up on methods, you'll most likely see two words popping up: parameters and arguments. And although they are very close related, there is a (formal) difference. A parameter is a variable in a method definition (as we have shown before), an argument is something you fill in during method invocation. 

So, in this example, valueOne and valueTwo are parameters:
```java
public int plus(int valueOne, int valueTwo) {...}
``` 

and in this case, "3" and "5" are arguments.

```java
int result = plus(3, 5);
```

#### Putting it all together
Time to put all this knowledge together. Let's create a method determines of any three provided integers which value is the highest. We'll call the method `findMax` and provide it with three integer arguments (the values that need to be compared), and the resut of the method will be the value of the highest provided integer.

Step one is to create the skeleton and fill out the method signature as we designed it:
```java
public int findMax(int valueOne, int valueTwo, int valueThree)  {
    // Nothing here yet!
}
```

If you were to add this code to IntelliJ right now, it would produce an error. The method promises to return an integer, but does not return anything just yet. We can change this by using the `return` statement in our code.

```java
public int findMax(int valueOne, int valueTwo, int valueThree)  {
    return 0; // Fixed the compilation issue - The answer isn't correct, but now your program runs!    
}
```
The return statement actually instructs the computer to "end" your method right there and return the provided result. 

Let's fill in the code for a complete overview. There are obviously multiple implementations possible.. but let's assume you have created something like:
```java
public int findMax(int valueOne, int valueTwo, int valueThree)  {
    int maximum = valueOne; // Assume valueOne is the maximum value.
    
    // Check whether or not valueTwo is larger than max.. if so, it becomes the new maximum.
    if(valueTwo > maximum) {
        maximum = valueTwo;
    }

    // Repeat for valueThree
    if(valueThree > maximum) {
        maximum = valueThree;
    }
   
    // Return the found maximum.
    return maximum;
}
```
As you can see, we have applied some (inefficient) code to determine the maximum value and "return" the maximum at the end of the code. Now suppose you got into a debate with a colleague programmer that claims he/she can do better and produces the following code:

```java
public int findMax(int valueOne, int valueTwo, int valueThree)  {
    if(valueOne >=  valueTwo && valueOne >= valueThree) {
        return valueOne; // If valueOne is larger (or equal) to both valueTwo and valueThree, it must be the maximum.
    } else if(valueTwo >= valueOne && valueTwo >= valueThree) {
        return valueTwo; // Similar conclusion, now for valueTwo.
    } else {
        return valueThree;
    }
}
```
This method did require some more "return" statements (which is ok!), but overall it's up to you as a programmer to decide wat version of the `findMax` method you want to include in your program, but you *cannot* include them both at the same time!

Notice that **nothing** changed to the method signature, it just got a different (and possible more efficient) implementation, meaning that all other parts of your application that have used this method, don't have to change as well. This is also what's known as _hiding_ the implementation. For an outisde programmer, you don't need to know how `findMax` works to use it, so swapping out an implementation can be done easily.
