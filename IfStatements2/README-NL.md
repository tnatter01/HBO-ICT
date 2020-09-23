#Exercises If-statements 2
Competentie: _Ik kan boolean logic toepassen in mijn condities._

De opdrachten kunnen gevonden worden in de losse modulen. 

## Samenvatting
Boolean logic gebruikt de operators NOT, AND en OR om meerdere booleans of condities te koppelen. NOT (! in Java) draait de waarde van een boolean of conditie om ("flippen"). AND (&& in Java) kijkt of beide waarden true zijn en OR (|| in Java) kijkt of 1 van de 2 waarden true is.

Hieronder de waarheidstabel voor de drie operators:

| cond1 | cond2 | !cond1 | !cond2 | cond1 && cond2 | cond1 &#124;&#124; cond2 |
|---|---|---|---|---|---|
|true|true|false|false|true|true
|true|false|false|true|false|true
|false|true|true|false|false|true
|false|false|true|true|false|false

## Introductie
Zoals jullie gezien hebben in de opdrachten van if-statements 1, kunnen booleans slechts twee waarden bevatten: true of false. Condities zijn expressies die uiteindelijk een boolean waarde opleveren. Denk hierbij bijvoorbeeld aan `age < 18`, wat je zou kunnen lezen als de vraag: _"Is de waarde van de variabele age lager dan 18?"_. Een dergelijke vraag kan je vervolgens dan beantwoorden met "ja" (true) of "nee" (false). Het gebruik van booleans en condities in if-statements is natuurlijk al best krachtig, maar het wordt pas echt leuk wanneer we booleans en condities gaan combineren!

## Uitleg 
Het combineren van booleans (of te wel "je gaat er mee rekenen") valt onder een vakgebied dat zich richt op _Boolean logic_. Wij gaan naar een klein stukje van dit vakgebied kijken en met name kijken naar de _operatoren_  die gebruikt worden in het programmeren. Een _operator_  is een symbool waarmee je een bepaalde operatie (of functie) kan aanduiden. Hier ken je er al enorm veel van, bijvoorbeeld het `+`-teken uit de wiskunde. Deze plus operator neemt twee waarden (eentje aan de linkerkant en eentje aan de rechterkant) en telt de waarden bij elkaar op. Andere voorbeelden kunnen jullie zelf vast en zeker verzinnen.

Boolean logic gebruikt, zoals gezegd, dus ook operatoren. De operatoren die Boolean logic gebruikt zijn NOT (geschreven als `!`, AND (`&&`) en OR (`||`).

In de rest van dit document zullen we de functie van deze operatoren in meer detail bespreken. Het is echter goed om te weten dat je boolean condities ook iets eenvoudiger kan schrijven dan dat jullie dat tot nu toe gedaan hebben. Laten we eerst hier even bij stil staan! 

### Een kortere notatiewijze voor boolean expressies

Tot nu toe heb je waarschijnlijk if-statements geschreven die, als ze gebruik maken van een boolean, er als volgt uit zien:
```java
boolean someExpression = ...; // It can either be true or false

if(someExpression == true) { // <--- Notice this line!
    // Do something when someExpression is true
} else {
    // Do something when someExpression is false.
}
```
Let vooral op het `== true` gedeelte. Dit kan afgekort worden, tot:
```java
boolean someExpression = ...; // It can either be true or false

if(someExpression) { // <--- Notice this line!
    // Do something when someExpression is true
} else {
    // Do something when someExpression is false.
}
```
Het stuk `== true` mag weggelaten worden omdat je dit eigenlijk altijd impliceert. Het is zo gebruikelijk om dit te doen, dat uitschrijven niet meer per se noodzakelijk is. Je mag dit onderdeel dus ook gerust weglaten! Je code wordt hierdoor nog leesbaarder.

Hetzelfde gaat ook op voor `== false` maar hier komen we zo wel op terug!

#### NOT
De NOT operator pakt de waarde van een boolean of van een conditie en zal als resultaat precies de tegenovergestelde waarde teruggeven. Dit noemen ze ook wel de waarde "flippen". Let hierbij op dat de oude waarde niet beïnvloed wordt. In Java is de NOT operator een uitroepteken (!) en je gebruikt hem door hem voor de waarde te zetten van de boolean of de conditie:
```Java
boolean isRaining = false; // Fijn, het regent niet!

if (!isRaining) { // Neem de waarde van isRaining en "flip" deze waarde.
    SaxionApp.print("Het regent niet!");
}

SaxionApp.print("De waarde van isRaining is: " + isRaining); // Dit zal "false" printen omdat de originele waarde niet aangepast is!
```
In het bovenstaande voorbeeld zie je hoe het `== false` zinsdeel weggelaten is. De conditie `!isRaining` is namelijk inhoudelijk gelijk aan `isRaining == false` or `isRaining != true`.  

Probeer gerust bovenstaande code eens uit in een van de opdrachten en overtuig je er van dat al deze schrijfwijzen hetzelfde zijn. (Het gaat hier dus vooral om leesbaarheid!)

#### AND
De AND operator pakt twee waarden en kijkt of beide waarden true zijn. Als dat het geval is, is de uitkomst van de operator ook true. In alle andere gevallen is de uitkomst false. In Java gebruik je de AND operator door && te typen tussen twee booleans of condities. Ook hierbij is het belangrijk om te vermelden dat de oude waarden niet aangepast worden. Hieronder een voorbeeld:

```Java
boolean isRaining = true; // Het regent...
boolean isSunny = true; // De zon schijnt ook... Dat kan maar 1 ding betekenen:

if (isRaining && isSunny) { // Kijk of beide waarden waar zijn.
    SaxionApp.print("REGENBOOG!!");
}
```

#### OR
De OR operator pakt ook twee waarden, maar in tegenstelling tot de AND operator waar beide waarden waar moeten zijn, is het voor de OR operator genoeg dat 1 van de 2 waarden waar is. Hier is echter een detail belangrijk: Als beide waarden waar zijn, is de uitkomst van de OR operator ook nog steeds waar. In Java gebruiken we de OR operator door || te typen tussen twee booleans of condities. En jullie raden het al: De oude waarden worden niet aangepast! Hier een voorbeeld:

```Java
boolean isRaining = true; // It's raining...
boolean isColdOutside = true; // It's cold outside..

if (isRaining || isColdOutside) { // Controleer of 1 van de waarden "true" bevat, als dat zo is moet je zeker een jas aan doen!
    SaxionApp.print("I better bring a jacket!");
}
```

## Combineren
Het is ook erg goed mogelijk om meerdere boolean logic operators te combineren. Dit kan je doen door het gebruik van haakjes. In de wiskunde wordt dit ook gebruikt om bepaalde operatoren voorrang te geven over anderen en dat is in boolean logic niet anders. Zie een voorbeeld hieronder:

```Java
boolean needToGoOutside = true; // Ik moet naar buiten!
boolean isRaining = false; // Het regent niet...
boolean isStorming = true; // ... maar het stormt!

if (needToGoOutside && (isRaining || isStorming)) { // "Als ik naar buiten moet EN het regent OF stormt..."
    SaxionApp.print("Paraplu en een jas mee!");
}
```

In het voorbeeld wordt een expressie in een if-statement gestopt. Deze expressie bevat haakjes om boolean logic te combineren. Allereerst wordt dus de expressie `(isRaining || isStorming)` uitgerekend. Hier komt true uit, omdat `isStorming` true is. Vervolgens wordt de expressie `needToGoOutside && true` uitgerekend (er staat true omdat de andere expressie eerst is berekend!). Hier komt ook true uit, omdat zowel `needToGoOutside` als `true` (wat dus `(isRaining || isStorming)` was!) waar zijn. De code binnen het if-statement wordt dus uitgevoerd!

**Let op:** De haakjes rondom `(isRaining || isStorming)` staan daar niet alleen voor de show. Ze hebben ook een nut, aangezien ze (net zoals in de wiskunde) een volgorde aangeven. Vergelijkbaar met vermenigvuldigen en optellen hebben ook NOT, AND en OR een bepaalde volgorde.

Deze volgorde is: `!` gevolgd door `&&` en tenslotte `||`. (Dus "negatie" (flippen) is sterker dan AND dat weer sterker is dan OR.)

Dus als het vorige voorbeeld zou zijn geweest:
```java
if (needToGoOutside && isRaining || isStorming)
```
Dan zou dus eerst `needToGoOutside && isRaining` worden geevalueerd (en hier komt dus true of false uit), waarna _die waarde_ geOR-ed zal worden met `isStorming`.