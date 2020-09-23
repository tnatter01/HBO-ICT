#Opdrachten Loops 1
Competentie: _Ik kan een eenvoudige while-loop gebruiken om code meerdere keren te laten uitvoeren._

De opdrachten kunnen gevonden worden in de losse modulen. 

## Samenvatting
Tijdens het programmeren kom je vaak in situaties terecht waarin je graag wil dat iets "vaker" wordt uitgevoerd. Neem bijvoorbeeld eens iets simpels als het uitprinten van alle getallen van 1 t/m 100. Het is natuurlijk erg eenvoudig om dit zelf allemaal in te typen, maar dit is best wel veel werk. 

Er zijn echter programmeerconstructies die een programmeur in staat stellen om bepaalde code te laten herhalen. Dit wordt ook wel een _loop_ (of in het Nederlands: lusje) genoemd. In deze competentie kijken we naar de _while loop_, maar er zijn meerdere loops te gebruiken. Een loop zal net zoals een if-statement de loop van je programma aanpassen en wordt dus gerekend onder de _(flow) control statements_.

Een while loop ziet er in essentie als volgt uit:
```java
while(<condition> {
    // This code will be repeated as long as condition yields true.
})
```
Bij aanvang van deze code zal de conditie gecontroleerd worden en zolang deze conditie een "true" value zal opleveren blijft de code tussen de accolades (`{ ... }`) herhaald worden.

Een voorbeeld:
```java
int counter = 0;

while(counter < 10) {
    SaxionApp.printLine(counter);
    
    counter = counter + 1;
}
```
Let er op dat de counter variabele verplicht opgehoogd moet worden in de loop, om te zorgen dat de conditie ook "false" zal worden en het programma afsluit. Een lus die nooit eindigt wordt ook wel een _oneindige loop_ genoemd (en is meestal onwenselijk in je code). Als in het bovestaande voorbeelde de initiele waarde van counter op 10 wordt gezet zal er _geen_ code worden uitgevoerd. De conditie is immers bij aanvang al ongeldig.

Als je wil dat je code minimaal 1x wordt uitgevoerd, is het misschien adviseerbaar om de `do { .. }  while(..)`-loop te gebruiken. Dit is een variatie op de while-loop waarbij de evaluatie van de conditie pas wordt gedaan nadat de code in het while-blok is uitgevoerd.

Een `do { .. }  while(..)`-loop ziet er als volgt uit:
```java
do {
    // Your code goes here!
} while(<condition>);
```

Een voorbeeld:
```java
int counter = 10; // Note that this value is different than the previous example!

do {
    SaxionApp.printLine(counter);
    
    counter = counter + 1;
} while (counter < 10);
```
In het bovenstaande voorbeeld zal dus precies 1x iets geprint worden, namelijk de waarde `10`.

## Uitleg 
Programmeurs zijn in principe erg luie wezens. Ze willen met zo min mogelijk code zoveel mogelijk effect bereiken. Code herhalen die hetzelfde doet (of bijna hetzelfde doet) druist daarom natuurlijk in tegen elk principe waar een programmeur voor staat. Het is daarom ook niet moeilijk om voor te stellen dat er codeconstructies zijn bedacht waarmee (identieke of sterk vergelijkbare) code eenvoudig herhaalt kan worden.

Er zijn een paar verschillende manieren om code te herhalen, maar nu gaan wij kijken naar de `while` loop. De while loop is de meest eenvoudige manier van code herhalen en ziet er als volgt uit:
```java
while(<boolean condition>) {
    // Repeat this code
}
```
Vergelijkbaar met het if-statement maakt een while-loop ook gebruik van een conditie om code meerdere keren uit te voeren. Deze conditie kan weer van alles zijn, zolang het uiteindelijk maar een "ja" of "nee" vraag oplevert (of te wel: true / false oplevert en dus van het type boolean is).

Een voorbeeld:
```java
int nrOfTimes = 0;

while(nrOfTimes < 10) {
    SaxionApp.printLine("This line will be printed 10 times!");
   
    nrOfTimes = nrOfTimes + 1;
}
```
In dit voorbeeld wordt de tekst 10 keer geprint. Ga maar na! Zodra het programma wordt opgestart bevat de variabele `nrOfTimes` de waarde 0, en aangezien `0 < 10` (de conditie) zal de code tussen de accolades `{ ... }` worden uitgevoerd. Een van de regels code tussen de accolades zorgt er voor dat de waarde van de variabele `nrOfTimes` met 1 wordt opgehoogd. Dit zorgt er voor dat bij de tweede uitvoer van de lus de waarde dus `1` is en aangezien `1 < 10` zal de code weer worden herhaald.

Deze lus blifjt zich herhalen totdat de waarde van `nrOfTimes` `10` wordt. `10 < 10` is immers niet waar, dus de conditie zal op dat moment "false" opleveren en de lus wordt gebruiken. (Het is goed om in te zien dat de waarde van `nrOfTimes` daadwerkelijk 10 wordt aan het eind van de lus, maar er dus niets geprint wordt. Er zullen in totaal 10 regels geprint worden.)

Verwarrend aan dit voorbeeld kan zijn dat de waarde van nrOfTimes wordt geinitializeerd op 0. Dit is opzettelijk gedaan omdat je zal zien dat we in de loop van deze module (en later) het gebruikelijk is om "te beginnen met tellen met 0". Hier komen we later nog wel op terug, maar wen er vast maar aan!

Laten we eens naar een voorbeeld gaan kijken waarin we iets anders dan een getal gebruiken:
```java
String someInput = SaxionApp.readString();

while(someInput.equals("quit") == false) {
    // Do some code..
   
    someInput = SaxionApp.readString();
}
```
In dit geval is de conditie van de loop gekoppeld aan de waarde van de `someInput` variabele. Aangezien het hier om een String gaat moeten we gebruik maken van de `equals` methode om de waarde te vergelijken, maar het doel van het programma is om de lus te laten breken zodra het woord "quit" wordt ingetypt. Bij alle andere inhoud van de String variabele mag de loop herhaald worden.

Let er op dat ook in dit geval het van belang is om de waarde van `someInput` aan te passen in de lus. Als je dit niet doet, dan zal conditie nooit veranderen en zal je lus nooit eindigen.

### Over het ophogen van getallen
Als je even gaat zoeken op Internet naar loops zal je vaak andere notaties tegen komen om een getal "met 1" op te hogen. Het is goed om deze even onder elkaar te zien:
```java
int counter = 0;

counter = counter + 1; // This one you have seen before. You can obviously change the 1 to anything you want!
counter += 1; // This is similar to the line above, it also increments the value of counter by 1. You can change the 1 to anything you want!
counter++; // This is really shorthand notation for increment the counter variabele with 1. It's just 1 and only 1. 
```

Omgekeerd gaat dit ook op! Onderstaande regels zijn inhoudelijk gelijk.
```java
int counter = 10;

counter = counter - 1; // Counter is now 9
counter -= 1;  // Counter is 8
counter--; // Counter is 7
```

Welke vorm precies het meest gebruikt wordt is lastig om te bepalen, maar in de meeste gevallen zal de `++` en `--` notatie gebruikt worden als je het hebt over het ophogen / verlagen van een integer waarde bij het gebruik van loops.

## Do-while
Het is belangrijk om te beseffen dat bij een normale while-loop de conditie wordt gecontroleerd _voordat_ de code daadwerkelijk wordt uitgevoerd. Onderstaande code zal daarom nooit uitgevoerd worden.
```java
int counter = 10;

while(counter < 10) {
    SaxionApp.printLine("This line is never printed!")

    counter++;
}
```
Vanwege het feit dat `counter` al geinitializeerd worden met een waarde van 10 en `10 < 10` niet waar is, zal de gehele lus worden overgeslagen.

Mocht je nu willen dat je code _op zijn minst **1** keer wordt uitgevoerd_, dan kan je er voor kiezen om een `do-while`-loop te gebruiken. Deze ziet er als volgt uit:
```java
do {
    // Your code goes here.
} while (<boolean condition>);
```
En om het gelijk maar in een voorbeeld te zetten:

```java
int counter = 0;

do {
    SaxionApp.printLine(counter);
    
    counter += 1;
} while (counter < 10);
```
Je kan misschien aan de structuur al zien dat de conditie ten opzichte van de reguliere while-loop "naar beneden" is gezet. Je zal nu eerst de code lezen en dan pas de conditie (dit is gelijk een goede manier om te onthouden wat hier gebeurd!).  Voer bovenstaande code maar eens uit! Je zal zien dat de getallen `0` t/m `10` uitgeprint zullen worden (dus 11 printjes in totaal), terwijl een normale while-loop er maar 10 zal uitprinten.