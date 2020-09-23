#Exercises Variables 1
Competence: _I can use primitive typed variables_

The exercises can be found in the different submodules. 

## Summary
Variables are used to _store data_ in any computer program. What can or should be stored depends on the program. In this competence you have learned how storing data actually works.
  
Each variable that you use in your program has a type, a name and preferably a value. In Java it is mandatory for each variable to be _declared_ before using it, meaning that this
```java
SaxionApp.printLine("Hello " + firstName)
String firstName = "Tristan";
``` 

**won't** work. You must declare the variable `firstName` before you can actually use it.

The name of a variable is written is commonly written in camel case (e.g. firstName or lastName).
We discussed four primitive types: integer, double, char and (the not-so primitive) String.

## Introduction
An application that does exactly the same every time it runs, is of no use. We want application to do something with user input or other input like input from sensors.
This means that in every program there is something that is not fixed, something that is variable. And with the input that is given, information that was not known beforehand, the program will be executed.

A very simple example is where a user called Jane can enter her name and the application respons with a greeting.
The greeting should not be coded like this:

```
SaxionApp.printLine("Hello Jane"); 

```
Why? Because the next time a guy named Willy is logging in and we want another greeting.
So we need something to store this unknown information, so that it can be used later on in the code. That's what variables are for.
In this submodule we will learn to work with the primitive variables integer, double, char and String.

To give you some idea, in the next example you see that the greeting is coded using a variable ```firstName```
```
String firstName = "Jane";

SaxionApp.printLine("Hello " + firstName); 

```
In the next submodule you will learn how to actually collect information from the user so we can store that in these variables.
For now, we give this information ourselves, as you see in the first line of the example.

## Explanation 

**Variable types**

A variable is some free space with a label, the variable name. You can look at is as a box, that can hold information. The box has a name, so that we can refer to that specific box. In technical terms it is memoryspace assigned to a specific label.

When you create a variable, you have to decide what type of information is going into the box. Will it be a number or a text or something else? In professional applications one variable ccould be a whole cupboard filled with boxes that have other boxes in them. And all the boxes can be filled with information. But for now we stick to the for most basic _variable types_:
1. integer - any whole number, positive or negative
2. double - any floating point number, positive or negative
3. char - any single character
4. String - any text

Creating a variable is called _declaring a variable_. A declaration starts with the variable type, followed by the variable name. For instance: 

```int numberOfStudentsInGroup;```

The name of the variable is in _camel case_ which means that the name starts with in small caps and that extra words added to clarify the meaning of the variable are added with capital letters. The name of a variable can be long, no problem, as long as it is clear what you want to use the variable for. In this case, probably to store the number of students in a group. 

After declaring a variable there is a box, a memory space. It is not necessarily empty, there could be anything in there, who knows what this piece of memory has been used for before it was part of this variable. So it is a very good practice to _initialize_ your variable directly after declaration.

```int numberOfStudentsInGroup = 0;```

Declaring and initializing a double:

```double roomTemperature = 21.0```

Declaring and initializing a char: 

```char groupNumber = 'a'```

Declaring and initializing a String:

```String studentName = "John Johnson"```

Note the following:
1. The ```=``` sign does not mean "equals to" but "becomes". Using the ```=```
assigns a value to the variable (in other words, fills the box).
2. Values for a char are given between single quotes, values for Strings are given between double quotes.
3. We often initialize Strings with an empty string: ```""```. The box is filled with a String, although it is an empty String.

**Calculations and types**

You can calculate with int and double. You cannot calculate with char or String, even is the variable is '2'. It will be treated as a character, not as a number.
The operators used to perform the basic calculations are not surprising:
```
int a = 15;
int b = 5;
int c = 0;

c = a+b // c becomes 20 
c = a-b // c becomes 10 
c = a/b // c becomes 3  
c = a*b // c becomes 75  
```

But there might be a surprise when a division does not result in an integer:
```
int a = 9;
int b = 5;
int c = 0;

c = a/b // c becomes 1 !!!

```
If we would perform this division ourself, the result would be 1.8. But that is a floating point number, and the variable c has been declared as an integer. There is no room for any digits after the comma, so Java just cuts of everything that doesn't fit.
```
int a = 9;
int b = 5;
double c = 0;

c = a/b // c becomes 1.8 

```
Another operator that turns out quite useful in programming is modulo ```%```. Exactly for these situations where we want to divide, but are working with whole numbers. Modulo results in the remainder after dividing two integers.
```
int a = 9;
int b = 5;
int c = 0;
int d = 0;

c = a/b // c becomes 1
d = a%b // c becomes 4

```

**Concatinating variables into a String**
In the introduction we gave a bit of code to greet the user:
```
SaxionApp.printLine("Hello " + firstName); 
```
What is happening here? First we have a given String (not a variable, but still a String). And this needs to be concatinated with the variable for the name, which is also a String. Strings are attached to eachother with the operator ```+```.
Everything you print can be constructed this way.

Now what happens if we do this with variables that are integers or doubles? What does the ```+``` stand for? Addition or concatination? Java uses addition if there are only numbers, and as soon as there is a char or String involved the sign is interpreted as concatination. We encourage you to find out yourself what that looks like. 
```
int a = 7;
int b = 3;
String text = " results in ";

SaxionApp.printLine(a + " + " b + text + (a + b));
```
This will print ```7 + 3 results in 10```.

**Typecasting**
Sometimes we want a variable to be transferred to a method as a different type than it originally has. 
We can do this with typecasting.

Suppose we have a double and need to pass it on to a method as integer. Than we can precede the variable with ```(int)```.
Or we need a double and have an int. Then we can precede the variable name with ```(double)```

Let's take method ```SaxionApp.drawPoint(x, y);``` where x and y are the coordinates of the point and the method requires them to be integers. Suppose you have the coordinates as doubles, let's say doubleX and doubleY. Maybe because the are the result of calculations that required floating point variables. You cannot pass the variables on as they are now, but you can typecast them: 

```SaxionApp.drawPoint((int)doubleX, (int)doubleY);```

Now, the method drawPoint will receive them as integers. But be aware, in this casting all the digits after the point will be left out. ```(int)3.9``` will be passed on as ```3```.

The other way around is also possible. Casting a variable from int to double, results in that same number with .0 added. ```(double)3``` will be passed on as ```3.0```. Note that it is usually not neccessary to explicitly cast an integer to a double. Java is generally "smart enough" to do this for you.