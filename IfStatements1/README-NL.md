#Opdrachten If-statements 1
Competentie: _Ik kan if-else-if-statements gebruiken om meer dan 2 opties te hebben_

De opdrachten kunnen gevonden worden in de losse modulen. 

## Samenvatting
Een if-statement is een constructie dat een programma in staat stelt om verschillende berekeningen of acties uit te voeren, afhankelijk van het resultaat van een bepaalde voorwaarde. Deze voorwaarde moet een soort van _booleaanse uitdrukking_ zijn. Met booleaanse expressie bedoelen we een expressie die met "ja" of "nee" (of waar / niet waar) beantwoord kan worden, zoals `leeftijd > 18` of `voornaam.equals("Tristan")`. Als je naar beide voorbeelden kijkt, zul je zien dat beide kunnen worden beantwoord met een ja of nee, gebaseerd op de waarden van de gebruikte variabelen.

Een if-statement ziet er als volgt uit:
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

## Uitleg
Tijdens het programmeren wil je eigenlijk nooit dat _alle_ regels van je programma _altijd_ wordt uitgevoerd. Vaak is het zo dat je bepaalde regels alleen wilt uitvoeren onder een bepaalde voorwaarde, bijv. `als het antwoord goed is, toon een groen vinkje` of `als het antwoord fout is, maakt de tekst rood`.

Dit is precies de reden waarom if-statements uitgevonden zijn: bepaalde code kan je laten uitvoeren afhankelijk van een of andere voorwaarde. Op deze manier kan je de _flow_ van je applicatie beinvloeden.

Een if-statement heeft de volgende structuur:
```java
if(<condition>) {
    // Some code
}
```

Het stuk waar `<condition>` bij staat moet een of andere vraag zijn die beantwoorden kan worden met "ja" of "nee" (of te wel: het moet een boolean zijn). Als het antwoord "ja" is, zal de code tussen de accolades (``// Some code``) uitgevoerd worden.

Tijd voor een voorbeeld:

```java
int age = 18;

if(age < 18) {
    SaxionApp.printLine("You are younger than 18!")
}
```

Wat gebeurt er? De variabele `age` is gedeclareerd en geinitializeerd en heeft de waarde 18. Aangezien de conditie `age < 18`  nu _false_ oplevert (want het is gewoon niet waar), zal de code nu worden overgeslagen. Er wordt dus niets uitgeprint. 

Dit is natuurlijk een gekke fout aangezien je bij voorbaat al kan weten dat de code niet uitgevoerd gaat worden. De Java compiler (en IntelliJ) zijn echter slim genoeg om dit ook in te zien. Als je code zoals dit schrijft krijg je een waarschuwing te zien dat deze code ook wel _dead code_ wordt genoemd (code die nooit uitgevoerd zal worden).

We passen het voorbeeld aan en baseren de waarde van `age` nu op gebruikersinvoer.

```java
int age = SaxionApp.readInt();

if(age < 18) {
    SaxionApp.printLine("You are younger than 18!")
}
```
In dit geval bepaalt de gebruiker of de code tussen de accolades (`{...}`) wel of niet wordt uitgevoerd. De `readInt()` methode wordt uitgevoerd, het resultaat wordt opgeslagen en vervolgens wordt de code wel of niet uitgevoerd op absis van deze waarde.

Je kan de voorwaarde eenvoudig aanpassen naar wat er precies nodig is. Maar als je met getallen (int of double) werkt, is er een grote kans dat je een van deze operatoren nodig hebt: 

**Conditional operators**    
![Conditional operators](https://i.pinimg.com/originals/5e/f4/f9/5ef4f919c313f4527573ba3cf984c8fe.png)    

Tijd voor een voorbeeld!
 
### Voorbeeld    
Vraag: Stel je hebt 10 apples en 10 sinasappels? Hoe weet de computer nu van welk fruit je het meest hebt? (voor het gemak hebben we de gebruikersinvoer geschrapt.)
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
Deze code maakt twee variabelen aan (`apples` and `oranges`) met gelijke waarde. Het programma zal vervolgens elke conditie stuk voor stuk langsgaan om te kijken welke conditie als eerste "waar" oplevert. Aangezien de waarden gelijk zijn zal de eerste conditie `apples > oranges` "onwaar" opleveren en wordt de volgende conditie bekeken. `oranges > apples` is echter ook onwaar, met als gevolg dat de code in het `else` block wordt uitgevoerd. Het `else` block mag je zien als een soort vangnet in het geval dat geen andere condities van toepassing zijn.

Nu je begint te werken met condities is het goed om gelijk stil te staan bij het vergelijken van _teksten_ (String waarden). Dit werkt namelijk net iets anders dan het vergelijken van getallen.
    
## Tekst vergelijken

De operaties uit de tabel hierboven werken op alle waarden waarden en eigenlijk vrijwel ook alle tekens (characters). Als je echter met Strings wil gaan werken is dit iets ingewikkelder aangezien..
* Een string eigenlijk een lijst van tekens is. Een lijst wordt op een iets andere manier opgeslagen in het geheugen dan de normale variabelen. Zie het als "zakjes" waarbij een String niets anders is dan een zakje met letters. De inhoud van deze zakjes kan je niet met `==` vergelijken.
* een computer onderscheid maakt tussen kleine letters en hoofdletters. Alhoewel `apple` en `Apple` semantisch hetzelfde betekenen, zal de computer het als verschillende woorden zien. Dit komt vooral omdat een letter voor een computer ook een numerieke waarde heeft. (Het karakter A is het ASCII karakter #65 en het karakter a is het ASCII karakter #97. Kijk voor eens [hier](https://computersciencewiki.org/images/3/3d/Ascii_table.png) voor een volledig overzicht.)   
    
Zodra je een String variabele aanmaakt, zeg je eigenlijk tegen de computer om in het geheugen ruimte te reserveren voor een blok tekst. Of dit nu 1 woord is (of zelfs 1 teken) of een volledig boek maakt voor de computer weinig meer uit. En dit maakt het vergelijken ook zo lastig.. Je wil graag de _inhoud_ van de tekst vergelijken en dat is niet zo erg eenvoudig. Gelukkig heeft Java hier twee methoden voor, namelijk:
 * equals(Object anotherObject)
 * equalsIgnoreCase(String anotherString)

(Het verschil is zichtbaar in de naam, maar het komt er dus op neer dat de tweede methode geen onderscheid maakt tussen kleine letters en hoofdletters.)
 
*Voorbeeld*
 ```java
SaxionApp.print("Enter your mode of transport: ");
String transport=SaxionApp.readString();

if (transport.equals("bicycle")) {
    SaxionApp.printLine("It is awesome to cycle in The Netherlands");
}
 ```
Let er op dat als je dit voorbeeld "Bicycle" (met hoofdletter) invult, er dus geen bericht getoond zal worden. Dit komt omdat de 'B' een ander character is dan de 'b '. Wil je wel dat dit als gelij kgezien wordt, gebruik dan `equalsIgnoreCase(String anotherString)`, zoals bijvoorbeeld in:
```java
SaxionApp.print("Enter your mode of transport: ");
String transport=SaxionApp.readString();

if (transport.equalsIgnoreCase("bicycle")) {
  SaxionApp.printLine("It is awesome to cycle in The Netherlands");
}
```
(Als alternatief kan je ook alle letters in de variabele `transport` veranderen naar kleine of hoofdletters, maar dat is een andere discussie.)    
  
*Een else if voorbeeld*
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
**Let op:** Het `else` block is in dit geval toegevoegd om te zorgen dat de computer enige uitvoer geeft als je geen exacte match hebt op een zin.

## Switch-statement
Soms gebruik je een if-statement en heb je erg veel mogelijkheden (dus erg veel if-else-if constructies, denk maar eens aan het gooien van een dobbelesteen of het `transport` voorbeeld hierboven). Voor deze situaties is het "switch-statement" bedacht. Het switch-statement is functioneel volledig gelijk aan het if-statement, maar kan gebruikt worden om de leesbaarheid van je code te verhogen.

Een switch statement ziet er als volgt uit:
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
Het zal je opvallen dat de condities wat anders geschreven zijn. Het switch-statement is "slim genoeg" om Strings te vergelijken met `equals` en getallen met `==`. Je kan op deze manier opsommingen eenvoudig iets netter onder elkaar zetten. Let er wel op dat switch alleen gebruikt kan worden met exacte vergelijkingen, dus als je `<`, `>`, of vergelijkbare operatoren wil gebruiken, dan moet je dus met een normaal if-statement doen.

Let daarbij ook op de `break;` regel. Deze wordt gebruikt om een splitsing te maken tussen de verschillende blokken, vergelijkbaar met de `{...} ` blokken met een normaal if-statement. Als je deze regel weglaat kan je eenvoudig meerdere condities met elkaar combineren, zoals bijvoorbeeld met:

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
Wanneer je precies een if-statement of een switch-statement kan gebruiken is afhankelijk van de leesbaarheid. Hier zal je een eigen inschatting moeten doen, maar onthoudt dat een switch-statement dus alleen maar gebruikt wordt om de leesbaarheid van je code te verbeteren. (En als dit het niet doet, gebruik dan gewoon een if-statement!)