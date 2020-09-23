# If-Statements 1    
**Competece:** *I can use if-else-if-statements to have more than just two options*

The exercises can be found in the different submodules.

## Summary
A conditional statement is a construct that allows the program to preform different computations or actions depending on the result of some  condition. This condition must be some kind of boolean expression. With boolean expression, we mean an expression that will yield either a "true" or "false" value, such as `age > 18` or `firstName.equals("Tristan")`. If you look at both of these examples, you'll notice both can be answered by a yes-or-no answer, based on the values of the used variables.

In general, an if-statement must comply to the following syntax:
```java
if (<boolean condition>) {
    // Code to be executed whenever previous condition is true
} else if(<other boolean condition>) {
    // Code if the previous condition is true. Note that this condition must be different than the first condition
    // otherwise the code in this segment will never be executed.
} else if(...) {
    // Etc. Etc.
} else {
    // This code gets executed if none of the conditions have resulted "true".
}
```

## Explanation
In programming, you'll rarely want a program to execute *all* the statements that you have written in a program. Usually there are certain conditions imposed on certain statements, such as `if the answer is correct, show a green mark` and `if the answer is incorrect, show the answer in red`.

If-statements will allow you to do just that: create sections of code that will only be executed based on some kind of condition. They are also known as statements that _control the flow of your application_ (because you can skip code if need be!).

The most simplefied version of an if-statement looks like this:
```java
if(<condition>) {
    // Some code
}
```

Where <condition> can be any question that can be answered with a "yes or no" answer (a.k.a. a boolean type). If the answer for that specific condition is yes (e.g. the boolean expression returns true), the code at ``// Some code`` will be executed.

Let's have a look at a very simple if-statement as demo:

```java
int age = 18;

if(age < 18) {
    SaxionApp.printLine("You are younger than 18!")
}
```
So what happens here? The variable `age` has been declared as an integer and holds the value of 18. Since the condition `age < 18` will return false (because it's just not true), the code between the `{ .. }` will never be executed.

Luckily, if you program stuff like this, your compiler / IntelliJ will be smart enough to see that this code will never be executed. This example is also known as _dead code_.

Let's see the example again, but this time we'll allow the user to input a value.

```java
int age = SaxionApp.readInt();

if(age < 18) {
    SaxionApp.printLine("You are younger than 18!")
}
```
In this case, it's all up to the user whether or not the code gets executed. The `readInt()` method is executed, the value is stored and depending on that value the line of code is executed (or not).

Obviously you can change the condition, but while working with integers (or doubles), you'll most likely need any of these conditional operators:

**Conditional operators**    
![Conditional operators](https://i.pinimg.com/originals/5e/f4/f9/5ef4f919c313f4527573ba3cf984c8fe.png)    

Time for an example!
 
### Example    
Question: You have 10 apples and 10 oranges. How can the computer determine of which you have the most? The code that you use could look something like this. To keep things simple, we have left out user interaction.    

```java
int apples = 10;
int oranges = 10

if (apples > oranges) { 
     SaxionApp.printLine("You have more apples than oranges");
} else if (oranges > apples) {
     SaxionApp.printline("You have more oranges than apples");
} else {
     SaxionApp.printline("You have the same number of oranges as apples");
}
```

In short, this code will declare and intialize two variables (`apples` and `oranges`) which have identical values (in this case). Next, the programm will execute each individual if-condition one by one to find a condition that matches the situation. The first condition, `apples > oranges`, is not true (since 10 > 10 will return false). The printLine stating that you have more apples than oranges will therefor be skipped. Similarly, the second printLine is skipped because `oranges > apples` is also false.

Because none of the conditions are valid, the code inside the `else` block is executed.

When learning to work with conditions, it's good to know that comparing _texts_ (String values) needs to a different approach.
    
## Comparing text
The operators mentioned above work for any numerical value and characters. When working with Strings however, things become a little more complicated, because..
* A String is actually a list of characters and is stored differently than a regular (primitive) variable. We'll look at that in following courses on programming, but you should consider a String to be a "bag" that holds characters and you **cannot** compare two "bags" using the `==` operator.
* Although sementically `apple` and `Apple` mean the same thing, computers will differentiatie between lower and upper case letters. (i.e. The character A is the ASCII character #65 and the character a is the ASCII character #97.   
*You can find the full ASCII table [here](https://computersciencewiki.org/images/3/3d/Ascii_table.png) or just type Alt + 065 or any 3 numbers between 32 and 254 in your code editor to find out more ASCIO. **PS** Alt + 0128 (Uses a different character set) is the € symbol if your keyboard does not have it.*   
    
 When you create a String variable, you are actually telling the computer to reserve `memory space` for text. Whether this text is just 1 character or an entire book's worth of characters makes no difference. You are however interested in comparing the _contents_ of a String and for this you need to use methods that the String class offers:  
 * equals(Object anotherObject)
 * equalsIgnoreCase(String anotherString)

(The difference hides in the name, but in case you didn't notice: The second method does not consider lowercase and uppercase characters differently. So `"HELLO".equals("hello")` yields true.)
 
 *Example*
 ```java
SaxionApp.print("Enter your mode of transport: ");
String transport=SaxionApp.readString();

if (transport.equals("bicycle")) {
    SaxionApp.printLine("It is awesome to cycle in The Netherlands");
}
 ```
Note that if the user entered "Bicycle" as their mode of transport nothing would be displayed because the first character in the transport variable 'B' (character #66) does not equal the first character of the literal "bicycle" which is 'b' (character #98)

To avoid this issue, we can use the `equalsIgnoreCase(String anotherString)` method shown in the example below.
```java
SaxionApp.print("Enter your mode of transport: ");
String transport=SaxionApp.readString();

if (transport.equalsIgnoreCase("bicycle")) {
  SaxionApp.printLine("It is awesome to cycle in The Netherlands");
}
```
(You could also choose to convert all the characters in the `transport` variable to lowercase or uppercase characters, but that is a different discussion.)    
  
*An else if example*
```java
if (transport.equalsIgnoreCase("bicycle")) {
    SaxionApp.printLine("It is awesome to cycle in The Netherlands");
} else if(transport.equalsIgnoreCase("car")) {
    SaxionApp.printLine("I have owned some cool cars in my time");
} else if(transport.equalsIgnoreCase("motorbike")) {
    SaxionApp.printLine("Nice, as braveheart says FREEDOM");
} else if(transport.equalsIgnoreCase("boat")) {
    SaxionApp.printLine("NICE!!!!!");
} else {
    SaxionApp.printLine("Does not compute");
}
```
**Note:** The `else` block as added just to give some feedback in case no other options matched the input provided by the user.

## Switch-statement
Because sometimes an if-statement has a lot of different options (consider the transport example earlier or consider the throw of a die), the "switch-statement" was introduced that could make your code look cleaner. In terms of function, the switch-statement is identical to the if-statement, the differences are purely focussed on readability.    

A switch-statement looks like this:
```java
switch (transport) {
    case "bicycle":
        SaxionApp.printLine("It is awesome to cycle in The Netherlands");
            // Other lines of code can be inserted here..
        break;
    case "car":
        SaxionApp.printLine("I have had some cool cars in my day");
            // Other lines of code can be inserted here..
        break;
    default:
        SaxionApp.printLine("Does not compute");
}
```
The switch-statement is smart enough to compare Strings using the equals method. When working with integers, the `==` operator will be used instead. Notice that **no other** operators can be used inside the switch-statement. So if you want to use operators like `>`, `<`, etc. use the normal if-statement.

Also notice the `break` line. This is used to separate each block of code, similarly to the use of `{ ... }` in the if-statements. By omitting this `break;` statement you can group up different conditions together. This looks like:

```java
int someValue = SaxionApp.readInt();

switch(someValue) {
    case 1:
    case 2:
    case 3:
        SaxionApp.printLine("This happens whenever someValue is 1, 2 or 3..");
        break;
    default:
        SaxionApp.printLine("And this happens in all other situations!");
}
```

Exactly when and why you use an if-statement or a switch-statement depends solely on the readability of your code. This is a judgement call on the programmers behalf, nothing more, nothing less. If you have any doubts whether or not a switch statement could improve your readability, try it! And if it doesn't help: stick to if-statements!