#Opdrachten Variables 1
Competentie: _Ik kan primitieve type variabelen gebruiken_

De opdrachten kunnen gevonden worden in de losse modulen.  

## Samenvatting
Variables are used to _store data_ in any computer program. What can or should be stored depends on the program. In this competence you have learned how storing data actually works.
  
Each variable that you use in your program has a type, a name and preferably a value. In Java it is mandatory for each variable to be _declared_ before using it, meaning that this
```java
SaxionApp.printLine("Hello " + firstName)
String firstName = "Tristan";
``` 

**won't** work. You must declare the variable `firstName` before you can actually use it.

The name of a variable is written is commonly written in camel case (e.g. firstName or lastName).
We discussed four primitive types: integer, double, char and (the not-so primitive) String.


Variabelen worden gebruikt om informatie vast te leggen die relevant is voor je computer programma. Wat je precies wil opslaan en in welke vorm deze informatie beschikbaar moet zijn, hangt af van het soort programma dat je schrijft.

Een variabele heeft een type, een naam en (het liefst onmiddelijk) een waarde. Het is in Java verplicht om een variabele te _declareren_ voordat je deze kan gebruiken in je code. Dus bijvoorbeeld
```java
SaxionApp.printLine("Hello " + firstName)
String firstName = "Tristan";
``` 

zal **niet** gaan werken. De variabele `firstName` bestaat namelijk nog niet voordat deze gebruikt wordt.

Een naam van een variabele wordt geschreven in camel case, zoals bijv. `firstName` en `lastName` (let op het hoofdlettergebruik).

In deze module leren we vier primitieve types: integer, double, char en (het officieel niet zo primitieve-type) String.

## Inleiding
Een applicatie die telkens precies hetzelfde doet, heeft geen zin. We willen dat de applicatie iets doet met gebruikersinput of andere input zoals input van sensoren.
Er is informatie die niet vast staat, iets dat variabel is. En met de input die wordt gegeven, dus informatie die vooraf niet bekend was, wordt het programma uitgevoerd.

Een eenvoudig voorbeeld is een gebruiker Jane die haar naam ingeeft en de reactie van de applicatie met een begroeting.
De begroeting moet niet zo gecodeerd worden:

```
SaxionApp.printLine("Hallo Jane"); 

```
Waarom? Omdat de volgende keer Willy inlogt en er dus een andere begroeting nodig is.
Dus we hebben iets nodig om deze onbekende informatie op te slaan, zodat het later in de code kan worden gebruikt. Daar zijn variabelen voor.
In deze submodule leren we werken met de primitieve variabelen integer, double, char en String.

Om je een idee te geven, zie je in het volgende voorbeeld dat de begroeting gecodeerd is met een variabele ```firstName```
```
String firstName = "Jane";

SaxionApp.printLine("Hallo " + voornaam); 

```
In de volgende submodule leer je hoe je daadwerkelijk informatie van de gebruiker kunt verzamelen, zodat we die in deze variabelen kunnen opslaan.
Voorlopig geven we deze informatie zelf, zoals je in de eerste regel van het voorbeeld ziet.

## Uitleg 

**Variabele types**

Een variabele is stukje geheugenruimte met een label, de variabelenaam. Je kunt het zien als een doos die informatie kan bevatten. De doos heeft een naam, zodat we kunnen verwijzen naar de doos. In technische termen is het gealloceerd geheugen toegewezen aan een specifiek label.

Wanneer je een variabele aanmaakt, moet je beslissen welk type informatie in de doos komt. Wordt het een nummer of een tekst of iets anders? In professionele toepassingen kan een variabele een hele kast zijn, gevuld met dozen waarin andere dozen staan. En alle dozen kunnen gevuld worden met informatie. Maar voor nu houden we het bij de meest elementaire _variabele types_:
1. integer - elk heel getal, positief of negatief
2. double - elk getal met decimalen achter de komma, positief of negatief
3. char - een enkel karakter
4. String - elke tekst

Het aanmaken van een variabele wordt _declareren van een variabele_ genoemd. Een declaratie begint met het type variabele, gevolgd door de naam van de variabele. Bijvoorbeeld: 

```int StudentsInGroup;```

De naam van de variabele staat in _camel case_ wat betekent dat de naam begint met een kleine letter en dat extra woorden die zijn toegevoegd om de betekenis van de variabele te verduidelijken, beginnen met een hoofdletter. De naam van een variabele kan lang zijn, geen probleem, zolang het maar duidelijk is waarvoor je de variabele wilt gebruiken. In dit geval waarschijnlijk om het aantal studenten in een klas op te slaan. 

Na het declareren van een variabele is er een doos, een stuk geheugenruimte, beschikbaar. Het hoeft niet per se leeg te zijn, er kan van alles in staan, wie weet waarvoor dit stukje geheugen is gebruikt voordat het deel uitmaakte van deze variabele. Het is dus een zeer goede gewoonte om de variabele direct na declaratie te _initialiseren_.

```int StudentsInGroup = 0;```

Het declareren en initialiseren van een double:

```double kamerTemperatuur = 21.0```

Het declareren en initialiseren van een char: 

```char groupNumber = 'a'```

Het declareren en initialiseren van een String:

```String studentName = "John Johnson"```

Let op het volgende:
1. Het ```=``` teken betekent niet "staat gelijk aan" maar "wordt". Met behulp van ```=```
wordt een waarde toegekend aan de variabele (met andere woorden, de doos wordt gevuld).
2. Waarden voor een char worden gegeven tussen enkele aanhalingstekens, waarden voor Strings worden gegeven tussen dubbele aanhalingstekens.
3. We initialiseren Strings vaak met een lege tekst: ```""```. De doos is gevuld met tekst, hoewel het een lege tekst is.

**Berekeningen en typen**

Je kunt rekenen met int en dubbel. Je kunt niet rekenen met char of String, ookal is de waarde '2'. Het wordt gezien als een teken net als de 'a', niet als een getal.
De operatoren die gebruikt worden om de basisberekeningen uit te voeren zijn niet verrassend:
```
int a = 15;
int b = 5;
int c = 0;

c = a+b // c wordt 20 
c = a-b // c wordt 10 
c = a/b // c wordt 3  
c = a*b // c wordt 75  
```

Maar misschien is het wel een verrassing voor je wanneer een deling niet resulteert in een geheel getal:
```
int a = 9;
int b = 5;
int c = 0;

c = a/b // c wordt 1 !!!

```
Als we deze deling zelf zouden uitvoeren, zou het resultaat 1,8 zijn. Maar dat is een getal met decimalen, en de variabele c is gedeclareerd als integer. Er is geen ruimte voor cijfers na de komma, dus Java snijdt gewoon alles weg wat niet past.
```
int a = 9;
int b = 5;
double c = 0;

c = a/b // c wordt 1,8 

```
Een andere operator die heel nuttig blijkt te zijn bij het programmeren is modulo ```%```. Precies voor deze situaties waarin we willen delen met gehele getallen. Modulo is de rest na het delen van twee gehele getallen.
```
int a = 9;
int b = 5;
int c = 0;
int d = 0;

c = a/b // c wordt 1
d = a%b // d wordt 4

```

**Variabelen in een String samenvoegen**
In de inleiding gaven we een stukje code om de gebruiker te begroeten:
```
SaxionApp.printLine ("Hallo" + voornaam); 
```
Wat gebeurt hier? Eerst hebben we een vaste String (geen variabele, maar toch een String). En deze moet samengevoegd worden met de variabele voor de naam, die ook een String is. De Strings worden met de operator ```+``` aan elkaar vastgemaakt.
Alles wat je print kan op deze manier worden geconstrueerd.

Wat gebeurt er nu als we dit doen met variabelen die integer of double zijn? Waar staat de ```+``` voor? Optellen of samenvoegen? Java ziet het als optellen als er alleen getallen zijn en zodra er een char of String bij betrokken is wordt het teken geïnterpreteerd als samenvoeging. We raden je aan om zelf uit te proberen hoe dat er uit ziet. 
```
int a = 7;
int b = 3;
String tekst = " resulteert in ";

SaxionApp.printLine(a + " + " b + tekst + (a + b));
```
Dit zal ```7 + 3 resulteert in 10``` afdrukken.

**Typecasting**
Variabelen kunnen worden doorgegeven aan een methode. Soms willen we dat een variabele als een ander type dan het oorspronkelijke type wordt doorgegeven. 
Dit kunnen we doen met typecasting.

Stel dat we een double variabele hebben en deze als integer moeten doorgeven aan een methode. Dan kunnen we de variabele vooraf laten gaan door ```(int)```.
Of we hebben een double nodig en hebben een integer. Dan kunnen we de variabele vooraf laten gaan door ```(double)```.

Laten we de methode ```SaxionApp.drawPoint(x, y);``` nemen, waarbij x en y de coördinaten zijn van het punt dat wordt getekend. De methode vereist dat de coordinaten gehele getallen zijn. Stel dat je de coördinaten hebt als double, laten we zeggen doubleX en doubleY. Misschien omdat ze het resultaat zijn van berekeningen die decimalen vereisen. Je kunt de variabelen niet doorgeven zoals ze nu zijn, maar je kunt ze wel typecasten: 

```SaxionApp.drawPoint((int)doubleX, (int)doubleY);```

Nu zal de methode drawPoint ze als gehele getallen ontvangen. Maar let op, in deze casting worden alle cijfers na de komma weggelaten. ```(int)3.9``` zal worden doorgegeven als ```3```.

Andersom is ook mogelijk. Het casten van een int naar double resulteert in een getal met .0 erachter. ```(double)3``` zal worden doorgegeven als ```3.0```. Meestal is het echter niet nodig om dit zo expliciet te doen. Java zal zelf vaak snappen hoe je van een integer waarde een double maakt.