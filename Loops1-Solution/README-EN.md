#Exercises Loops 1
Competence: _I can create a simple while-loop to execute pieces of code multiple times._

The exercises can be found in the different submodules. 

## Summary
During programming you often find yourself in situations where you would like something to be done "more often". Take, for example, something as simple as printing all numbers from 1 to 100. It is of course very easy to type all this yourself, but this is quite a lot of work. 

However, there are programming constructs that allow a programmer to repeat certain lines of code. This is also called a _loop_. In this competence we look at the _while loop_, but there are several different types of loops that you could use. A loop will modify the flow of your program just like an if-statement and is therefore considered to be a _(flow) control statements_.

A basic while loop looks like this:
```java
while(<condition> {
    // This code will be repeated as long as condition yields true.
})
```
When this code is executed, the condition will be checked and as long as this condition yields a "true" value (remember, it should be a boolean!), the code between the curly braces (`{ ... }}`) will be executed repeatedly.

An example:
```java
int counter = 0;

while(counter < 10) {
    SaxionApp.printLine(counter);
    
    counter = counter + 1;
}
```
Note that the counter variable must be increased inside the loop to ensure that the condition will also be "false" and close the program. A loop that never ends is also called a _infinite loop_ (and is usually undesirable in your code). If in the previous example the initial value of counter would be set to 10, _no_ code will be executed. After all, the condition is invalid at the start.

If you want your code to run at least once, it might be advisable to use the `do { ... } while(..)`-loop. This is a variation on the while loop where the evaluation of the condition is done after the code has been executed in the while block.

A `do { .. }  while(..)`-loop looks like this:
```java
do {
    // Your code goes here!
} while(<condition>);
```

An example:
```java
int counter = 10; // Note that this value is different than the previous example!

do {
    SaxionApp.printLine(counter);
    
    counter = counter + 1;
} while (counter < 10);
```
In this last example, the code is just executed once.

## Explanation
Programmers are basically very lazy creatures. They want to get the most impact with their code, while only writing as little as possible. Repeating code that does the same thing (or almost does the same thing) therefore goes against every principle a programmer stands for. It is therefore not difficult to imagine that code constructs have been created with which (identical or very similar) instructions can easily be repeated.

There are a few different ways to repeat code (besides copy-pasting), but now we will look at the `while` loop. The while loop is the simplest way of repeating the execution of code and looks like this:

```java
while(<boolean condition>) {
    // Repeat this code
}
```
Similar to the if-statement, a while loop also uses a condition to execute code multiple times. This condition can be anything, as long as it eventually results in a "yes" or "no" question (or: true / false  - it should be a boolean).

An example:
```java
int nrOfTimes = 0;

while(nrOfTimes < 10) {
    SaxionApp.printLine("This line will be printed 10 times!");
   
    nrOfTimes = nrOfTimes + 1;
}
```
In this example the text is printed 10 times. (Check it out!) As soon as the program is started, the variable `nrOfTimes` contains the value 0, and since `0 < 10` (the condition) the code between the curly braces `{ ... }` will be executed. One of the lines of code between the curly braces will increase the value of the variable `nrOfTimes` by 1. This causes the value `nrOfTimes` inside the second loop to be `1` and since `1 < 10` the code will be repeated again.

This loop repeats itself until the value of `nrOfTimes` becomes `10`. After all, `10 < 10` is not true, so the condition will be "false" at that moment and the loop will be broken. (It is good to realize that the value of `nrOfTimes` actually becomes 10 at the end of the loop).

Confusing about this example may be that the value of nrOfTimes is initialized to 0. This is done intentionally because you will see that in the course of this module (and later in your studies) it is customary to "start counting at 0". We will come back to this later, but get used to it!

Let's check out an example that doesn't use a numerical value as condition:
```java
String someInput = SaxionApp.readString();

while(someInput.equals("quit") == false) {
    // Do some code..
   
    someInput = SaxionApp.readString();
}
```
In this case, the condition of the loop is linked to the value of the `someInput` variable. Since this is a String we have to use the `equals` method to compare the value, but the purpose of the code is to break the loop as soon as the word "quit" is entered. For all other values, the loop may be repeated.

Note that also in this case it is important to renew the value of `someInput` somewhere in the loop. If you don't do this, condition will never change and your loop will never end.

### Different ways of increasing a single value
If you search for loops on the Internet you will often come across other notations to increase a numerical value "by 1". It is good to see these notations together for once to understand what they look like:
```java
int counter = 0;

counter = counter + 1; // This one you have seen before. You can obviously change the 1 to anything you want!
counter += 1; // This is similar to the line above, it also increments the value of counter by 1. You can change the 1 to anything you want!
counter++; // This is really shorthand notation for increment the counter variabele with 1. It's just 1 and only 1. 
```

In reverse the same rules apply!
```java
int counter = 10;

counter = counter - 1; // Counter is now 9
counter -= 1;  // Counter is 8
counter--; // Counter is 7
```
What version you should depends mostly on personal preference, but most programmers use the `++` or `--` notitation to increment / decrement an integer by one.

## Do-while
It is important to realize that in a normal while loop the condition is checked _before_ the code is actually executed. The code below will therefore never be executed.
```java
int counter = 10;

while(counter < 10) {
    SaxionApp.printLine("This line is never printed!")

    counter++;
}
```
Due to the fact that `counter` is already initialized with a value of 10 and `10 < 10` is not true, the entire loop will be skipped.

If you now want your code to be executed _at least **1** time_, you can choose to use a `do-while` loop instead. This looks like this:

```java
do {
    // Your code goes here.
} while (<boolean condition>);
```
And just to fill out an example:

```java
int counter = 0;

do {
    SaxionApp.printLine(counter);
    
    counter += 1;
} while (counter < 10);
```
You may already be able to see from the layout of the loop that the condition has been put "at the bottom" compared to the regular while loop. You will now first read the code and then the condition (this is a good way to remember what is happening here!).  Just run the code above! You will see that the numbers `0` to `10` will be printed (so 11 prints in total), while a normal while loop will only print 10 lines.