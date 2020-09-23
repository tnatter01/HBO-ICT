#Exercises Methods 1
Competence: _I can use methods with arguments_.

The exercises can be found in the different submodules. 

## Summary
A method is a pre-defined piece of code with which you can quickly use to get certain functionality. A method must have a unique method name and also belongs to a certain object (the part before the dot (`.`)). This object often determines the behaviour of any given method.

Each method may have 0 or more arguments of different types and must be closed with a semicolon (`;`).

An example of a method call is:
```java
SaxionApp.printLine("This is how you invoke a method!", Color.YELLOW); 
```

What a certain method call does can be found in the official Java documentation (or `javadoc`) of said method.

## General introduction
The ultimate goal of programming is to force the computer to do _something_ that you (the programmer) want it to do. Computers however, are very stupid devices and can actually only do very few things of their own (mostly just arithmetic). Any further functionality you want to use as a programmer will almost always have to be written by yourself or other programmers. Fortunately for us, Java is now very mature and contains a lot of code that we can now use to (quickly) develop a program. These pre-developed pieces of code are also called _methods_ in Java. And whenever you start to learn how to program, the first thing you should learn is how to use these _methods_.

To make your first effforts even easier we have developed the _SaxionApp_. In this framework you can easily print text, draw lines, figures and even show images. We will use this framework in this module to introduce most programming concepts. It is especially _not_ the intention that you'll learn this framework by heart... It is a tool to learn programming.

However, it will take some getting used to using this framework. So this module (Methods1) has one big objective: to get to know the SaxionApp better!

## Explanation 
The simplest example of a method in Java is one that lets you display something on the screen. In the case of the SaxionApp this looks like this:

```java
SaxionApp.printLine("This will be printed"); 
```

All method calls follow the same structure. The last word before the brackets (in this case `printLine`) is the method name with which you can invoke the code. The method name (in this case `SaxionApp`) is a reference to the object on which the method is called. (So: We will use the method `printLine` that belongs to SaxionApp.)

The part between the brackets (`"This will be printed"`) is called the method argument. In general, the argument can be anything, a number, a piece of text and more. Also, a method can have several arguments. In this case, the different arguments will be separated with a comma. 

See the example below:

```java 
SaxionApp.printLine("This will be written in RED", Color.RED);
```

The method above has 2 arguments, namely the text `This will be written in RED` (between quotation marks) and the color `Color.RED`.

The last thing to pay attention to when using methods is that you always end a method call with a semicolon (`;`). With this character you indicate that the instruction for the computer is finished and no other information follows.

What a method does is sometimes difficult to estimate based on the method name. You can get most of the time an idea based on it's name, but sometimes you want to know more. In this case you will need to read the documentation that a programmer has written for a method. The official way you write documentation in Java is also called `javadoc`. In this module you will learn to read this kind of documentation.

For now, however, it is useful to know that IntelliJ can also help you find the right methods quickly. Just type (in your run-block) `SaxionApp.` (note the dot at the end). You will see that IntelliJ will automatically suggest what you can do. This is also called _auto completion_ and is a feature you will appreciate in this module.