#Exercises If-statements 2
Competence: _I can apply boolean logic in my conditions._

The exercises can be found in the different submodules. 

## Summary
Boolean logic uses the operators NOT, AND and OR to combine multiple booleans or conditions. NOT (! in Java) takes the value of the boolean and returns the opposite value (called flipping). AND (&& in Java) looks at both values and returns true if and only if both values are true. OR (|| in Java) returns true if one (or both) is true.

The truth table for the operators can be found below.

| cond1 | cond2 | !cond1 | !cond2 | cond1 && cond2 | cond1 &#124;&#124; cond2 |
|---|---|---|---|---|---|
|true|true|false|false|true|true
|true|false|false|true|false|true
|false|true|true|false|false|true
|false|false|true|true|false|false

## Preface
As you have seen in the assignments for if-statements 1, booleans can only contain one of two values: true or false. Conditions are expressions that will resolve into a boolean value. An example is `age < 18` which should be read as the question _"Is the value of the variable age less than 18?"_. Depending on the actual value stored inside the `age` variable this answer can either be answered with "yes" (true) or "no" (false) . The usage of booleans and conditions in if-statements is pretty powerful by itself, but it gets really interesting once we combine booleans and conditions!

## Explanation
Combining booleans and conditions and doing some calculations with them belongs to the field of _Boolean logic_ and is done by using operators. An operator is a fancy term for a symbol representing a certain operation.. and is something you have also seen many times before. Consider the `+` operator. The plus operator takes two values (one on the left side and one on the right side), adds the two values and returns the result. You can probably come up with other examples of (math) operators by yourself.

As stated before, Boolean logic also uses these kind of operators. The operators Boolean logic uses are NOT (written as `!`), AND (written as `&&`) and OR (written as `||`).

### But first a shorthand notation
Before we dive into the field of boolean logic, we first should introduce a very well known and commonly used practice of abbreviating boolean notations. This looks like this..

Untill now, you have most likely written lines that involve booleans and look like this:
```java
boolean someExpression = ...; // It can either be true or false

if(someExpression == true) { // <--- Notice this line!
    // Do something when someExpression is true
} else {
    // Do something when someExpression is false.
}
```

This can be abbreviated to:
```java
boolean someExpression = ...; // It can either be true or false

if(someExpression) { // <--- Notice this line!
    // Do something when someExpression is true
} else {
    // Do something when someExpression is false.
}
```
When working with boolean expressions in your code (e.g. with if-statements or loops), the `== true` (or `== false`) part of the equation can be **omitted**. It makes your code a lot more readable!

With that in mind, let's have a look at the regular boolean conditions.

#### NOT
The NOT operator takes the value of a boolean or a condition and will produce the opposite boolean value. This is also called flipping the boolean or _negating_ it. Please note that the initial value will not be changed. In Java, the NOT operator is written with an exclamation mark (!) and you use it by placing it in front of the boolean or condition: 

```Java
boolean isRaining = false; // Good! It's not raining!

if (!isRaining) { // Take the value of isRainning and flip it - Read this as "If it is NOT raining"...
    SaxionApp.print("It's not raining!!");
}

SaxionApp.print("The value of isRaining is: " + isRaining); // This will produce "false" because the initial value is not changed!
```

Note that the `if(!isRaining) {..}` condition is functionally equal to `if(isRaining == false)` or `if(isRanining != true)`. It's just shorthand notation!

You can try the code above in one of the assignments to see what happens.

#### AND
The AND operator tries to combine two values and checks whether or not both individual values will yield `true`. If and only if that is the case, the AND operator will produce an overall value of true. In all other cases (so either of the values return false, or both of them do), the combined boolean value will return `false`. In Java, the AND operator is used by typing && in between the two boolean expressions or variables. Again, both values that are used by the AND operator are not actually changed when using the `&&` operator. 

Below another example:

```Java
boolean isRaining = true; // It's raining...
boolean isSunny = true; // The sun is shining too. This can only mean one thing:

if (isRaining && isSunny) { // Check if both values are true - Read this as: "If it is raining AND it is sunny"..
    SaxionApp.print("RAINBOW!!");
}
```

#### OR
The OR operator also takes two values, but in contrast to the AND operator (where both values must be true), the OR operator produces true when either one of the two values yields true (including if both are true!). In Java, the OR operator is used by typing || in between two booleans or conditions. Once again, the variables themselves are not changed.

An example:
```Java
boolean isRaining = true; // It's raining...
boolean isColdOutside = true; // It's cold outside..

if (isRaining || isColdOutside) { // Checks whether either of this conditions are true. If both are true, we should *definately* bring a jacket.
    SaxionApp.print("I better bring a jacket!");
}
```

## Combining operators
It is also very possible to combine multiple boolean logic operators and this happens quite often. As with more things, this allows for ambiguous conditions (conditions that can be interpreted in multiple ways). Just like in regular maths, you can use parentheses to structure your conditions and make sure you have formtulated the right boolean expression.

```Java
boolean needToGoOutside = true; // I have to go outside!
boolean isRaining = false; // It's not raining...
boolean isStorming = true; // ... but it's storming!

if (needToGoOutside && (isRaining || isStorming)) { // "If I need to go outside AND it's raining OR storming..."
    SaxionApp.print("Take an umbrella and jacket!!");
}
```
In the example above, an expression is given to an if-statement. This expression contains parentheses to combine boolean logic. First of all, the expression `(isRaining || isStorming)` will be evaluated. This evaluates to true, because `isStorming` is true. After that, the expression `needToGoOutside && true` will be evaluated (it says true because the other expression was already evaluated!). This evaluates to true too, because both `needToGoOutside` and `true` (remember, it was `(isRaining || isStorming)` before!) are true. Thus, the code within the if-statement will be executed!

**Note:** The parentheses around `(isRaining || isStorming)` aren't there just for show! Similar to math, logical operator have a certain precendence, meaning that some will take "priority" over others. (Just like multiplication goes before addition in math!). 

The order of this precendence is: `!` followed by `&&` and finally `||`. (So negation is "stronger" than AND which is "stronger" than OR.)

So if the previous example would be:
```java
if (needToGoOutside && isRaining || isStorming)
```
The evaluation order would be *first* `needToGoOutside && isRaining` (that can either return true or false), after which _that value_  will be OR'red with `isStorming`.