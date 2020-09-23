#Exercises Methods 3
Competence: _Ik kan (statische) methoden met argumenten en return types maken._

De opdrachten kunnen gevonden worden in de losse modulen. 
 
## Samenvatting
Een methode is een verzameling van instructies (coderegels) die samen een bepaalde functie vervullen. Tot nu toe heb je methoden alleen gebruikt om bepaalde taken uit te laten voeren, zoals `printLine` of `pause`.

In het algemeen worden methoden gebruikt om drie dingen te doen:    
* het voorkomen van duplicatie van code (of: het gemakkelijk maken om code te hergebruiken)    
* de code leesbaarder te maken 
* de implementatiedetails te verbergen  

De eerste twee van deze voordelen (codehergebruik / voorkomen van codeduplicatie en verbetering van de leesbaarheid), zullen onder deze competentie vallen. De laatste, het verbergen van implementatiedetails, zal in een latere module aan bod komen.

Alle methoden hebben een vergelijkbare structuur:
```
public <returnType> methodName(<parameters>) {
      // One or multiple lines of code, including a "return" statement.
}
``` 

(Merk op dat we in deze cursus alleen `public` methoden zullen gebruiken.)

Een voorbeeldmethode zou er als volgt uit kunnen zien:
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
Deze methode bepaalt of een geheel getal (bekend als `nummer` binnen deze methode), even of oneven is. In het geval van een even getal zal de methode "true" opleveren, anders (bij oneven) "false". Een methode heeft altijd een eerste regel die wat informatie over de methode zelf bevat, ook wel bekend als de _method signature_.  (de regel voor de `{... }`). 

Delen die **moeten** worden ingevuld uit de _method signature_ zijn het returntype (in dit geval `boolean`) en de naam van de methode (bijv. `isEven`). Methodennamen worden geschreven in _camelCase_ (wat betekent dat de eerste letter van het eerste woord begint met een kleine letter, gevolgd door hoofdletters voor alle overige woorden) en moeten uniek zijn voor een bepaald toepassingsgebied (bijv. binnen `SaxionApp`). Wat een methode oplevert kan van elk type zijn dat bekend is in de applicatie, dus booleans, int's, doubles en Strings kunnen ook worden geretourneerd. Alternatief kan een methode ook `void` als returntype hebben, wat betekent dat de methode niets oplevert. (Void betekent 'leegte' in het Engels.) 

Eventuele parameters die de methode nodig heeft staan tussen de haakjes (`(...) `). Van elke parameter moet het type worden vermeld, gevolgd door een variabele naam die helpt bij het identificeren van de variabele binnen de code van de methode. Elke methode kan 0 of meer parameter(s) hebben. De gegevens die u aan de parameter doorgeeft, worden argumenten genoemd.

Het is goed om te onthouden dat alle methoden, die **geen** returntype `void` hebben, een return-statement moeten hebben in alle mogelijke uitkomsten. Aangezien `isEven` een if-else verklaring heeft, worden er twee returnstatements gebruikt om beide situaties te behandelen. Er is geen maximum aan het aantal returnstatements dat je in een methode kunt hebben, zolang er tenminste één is (tenzij het returntype `void` is, dan is het retouroverzicht optioneel).

Merk op dat de bovengenoemde methode ook kan worden afgekort tot slechts één regel (maar was niet voor onderwijsdoeleinden):

```java
public boolean isEven(int number) {
    return number % 2 == 0;
}
```

Een methode kan vervolgens worden gebruikt zoals je ook al eerder hebt gezien:
```java
// From within the run() method or other methods:

int someValue = 3;

boolean someValueIsEven = isEven(someValue);

SaxionApp.printLine("Is " + someValue + " even? " + someValueIsEven);
```
Merk op dat er geen verband is tussen de _namen_ van de variabelen `someValue` (in de run() methode) en `nummer` (binnen de methode `isEven`). Alleen de werkelijke waarde (3) wordt doorgegeven aan de methode, zonder rekening te houden met de naam van de variabele waarin deze kan worden opgeslagen vanuit elke aanroepende methode.

## Introductie
In deze wereld is al veel code geschreven en beschikbaar gesteld door andere programmeurs. Het grootste deel van deze code komt in de vorm van _classes_ (die je later in deze cursus leert kennen) en _methods_. En aangezien jij nu ook een programmeur bent, wordt het tijd dat u ook een bijdrage levert aan de enorme wereld van de code. En we gaan beginnen om dit te doen door te leren hoe je zelf een eigen methode kan schrijven.

Zoals je geleerd hebt, zijn methoden _blokken_ van code en instructies die samen een specifieke functie uitvoeren. Je hebt methoden gebruikt om tekst af te drukken naar het scherm, een lijn te trekken over het scherm, rechthoeken te creëren, etc. etc. Je hebt ook methoden gebruikt om wat berekeningen voor je te doen zoals bijv. een willekeurige waarde te bepalen of een kleur te maken. 

In deze sectie leer je meer over hoe je methoden kunt maken en wat goede praktijken zijn in het maken van methoden. Dus laten we aan de slag gaan en kijken hoe je dit doet. Vreemd genoeg is het eerste wat we moeten bespreken is hoe je een methode bedenkt en welke naam je deze geeft. 

### Over het doel van een methode en de naam
Als je programmeurs vraagt _hoe_ ze zich alle methodes herinneren die ze zouden gebruiken, dan krijg je het antwoord dat ze over het algemeen dit **niet** doen. Met meer ervaring ga je namelijk patronen zien in de namen van methoden en op een gegeven moment kun je bijna raden wat een methode zal doen op basis van zijn naam. Dit betekent echter wel dat je je moet houden aan een aantal goede praktijken qua naamgeving, zodat je andere programmeurs niet op het verkeerde been zet.

Voor nu, onthoud dit:
1) Een methode naam wordt altijd geschreven in _camelCase_ (of eigenlijk dromedaris-case). Dit betekent dat de eerste letter van een methode begint met een kleine letter, gevolgd door elk volgende woord met een hoofdletter. Enkele voorbeelden `printLine`, `drawLine`, `saveImage`, `generateRandomNumber`, enz.
2) Probeer een werkwoord in de naam van uw methode te krijgen. `printLine` bevat het werkwoord 'print' dat u een idee moet geven van wat de methode doet.
3) Een naam van de methode moet zo klein mogelijk worden gehouden en toch gemakkelijk te begrijpen zijn, dus houd de naam van de methode kort (maar maak het niet te gek): `printLine` is goed genoeg, in vergelijking met `printLineOnSaxionApp(...)` of `method1(...)`.
4) Een methode moet altijd maar _een_ ding te doen en dit goed te doen. `printLine` is duidelijk: je verwacht maar één ding... Een methode als `promptUserForInputCalculateAverageWriteResultToFile` zou wel eens te groot kunnen zijn. 

Nog meer voorbeelden over hoe je je methoden **niet** wil noemen:
```
public void awesome() {...}       // While obvioulsy an awesome method.. what does it do? 
public void makeXAwesome() {...}  // Slightly better, but what does "making something awesome" mean? 
public void exerciseOne() { ... } // Yeah.. what exercise? 
public void partOne() { .. }      // I guess it comes before partTwo()?
```

Het kiezen van een juiste methodieknaam is in eerste instantie best moeilijk, maar zal in de loop van de tijd gemakkelijker worden. Wees voorlopig niet bang om de naam van een methode te veranderen om het echte doel weer te geven nadat je een aantal veranderingen hebt aangebracht. Het veranderen van een methodieknaam in IntelliJ is heel eenvoudig... dus wees niet bang om het te doen!

Oké! Nu we een idee hebben hoe we onze creaties een naam kunnen geven, laten we een methode bouwen! Maar niet voor *waar* we ze moeten maken...

### Waar maak je een methode?
Methodes behoren altijd tot een aantal "class" (we zullen het in de toekomst meer over klassen hebben), zoals de `SaxionApp` of `Application`. Voorlopig richten we ons alleen op het maken van methodes in onze eigen Applicaties, dus laten we eens kijken naar de algemene lay-out van ons Applicatiebestand en waar onze methodes aan toegevoegd moeten worden:

```java
import ... // Import statements come ALWAYS first.

public class Application implements Runnable { // This is always the same for this course.. Note the "open" curly bracket. All code between these brackets belong to "our Application".

    public static void main(String[] args) { ...  } // This method is always in your Application file.

    public void run() { ... } // this method is also always in your Application file.

    public void yourMethodGoesHere() { ... } // Your code goes in here !!
   
    public int yourOtherMethodGoesHere() { ... }  // And here.. etc!

} // <-- Note this curly bracket. You need this one to close your program!
```
De accolades (`{...}`) worden in Java gebruikt om "blokken" te vormen (ook wel "scope" genoemd), vergelijkbaar met wat je hebt gezien met de if-statements en while-statements. Hetzelfde geldt voor methodes... je kunt ze gewoon "onder" (of boven, volgorde maakt niet uit) je bestaande `run` en `main` methoden plaatsen. (Je moet die twee methoden wel behouden!).

Merk op dat variabelen binnen afzonderlijke methoden van elkaar geïsoleerd zijn, wat betekent dat je **geen** toegang kan krijgen tot variabelen die gedeclareerd zijn in een andere methode. Dus wanneer je een methode maakt, worden alle variabelen die binnen die methode worden gebruikt automatisch "verborgen" voor elke andere methode.

Heb je een geschikte plek gevonden voor je methode en weet je zeker dat je niet tegen scopingproblemen aanloopt? Dan is het tijd om er een te maken! Laten we eens kijken naar de lay-out van alle methoden.

### Algemene layout van een methode
Elke methode ziet er ongeveer hetzelfde uit, namelijk:
```java
public <someReturnType> methodName(<listOfParameters>) {
  // Lines of code..
}
```
De eerste regel van een methodedefinitie voor de gekrulde haakjes (`{...} `) staat bekend als de _method signature_ (of te wel: handtekening van de methode). Deze signature wordt gebruikt om wat meer informatie te geven over uw nieuw aangemaakte methode. Het bevat op zijn minst de naam van de methode (die je kunt gebruiken om de methode aan te roepen), een lijst van parameters die de methode nodig heeft en het eventuele datatype dat de methode zal teruggeven (ook wel return-type genoemd). We hebben de naamgevingsconventies al eerder besproken, dus dat laten we nu even rusten.

Het woord `public` voor deze cursus moet als verplicht worden beschouwd (dus altijd gebruiken). Er zijn andere woorden die je hier zou kunnen zetten (zoals `static`, `private`, `abstract`, etc.) maar al deze onderwerpen vallen buiten de scope van deze module. 

Voordat we een methode kunnen opstellen moeten we eerst iets meer weten over return-typen en de parameters.

#### Return-typen
Methoden worden met name gebruikt omdat ze herbruikbaar zijn en om de structuur en leesbaarheid van applicaties te verbeteren. In het algemeen heb je twee soorten methoden, methoden die een specifieke functie uitvoeren en direct effect hebben op je applicatie (zoals een lijn tekenen, tekst printen, etc.) of methoden die wat berekeningen kunnen doen of wat gegevens voorbewerken voor je om later te gebruiken. In de eerste situatie kan een methode gewoon doen wat het moet doen en zijn er verder weinig verwachtingen, zoals bijv. bij `printLine`. Je ziet iets op het scherm verschijnen en meer gebeurt er ook niet. 

Het andere soort methoden moet worden gezien als methoden die gedeeltelijke resultaten kunnen opleveren, zoals bijv. het lezen van een geheel getal `readInt` van de gebruiker en het gebruik van die waarde om iets anders mee te doen (`readInt` is dus een beginstap). In dat geval kan je de methode als een "robot" (of "werker") zien die een taak voor je uitvoert en met het resultaat van die taak mee terugkomt. Een methode levert dus ook daadwerkelijk een resultaat op wat je vervolgens kan gebruiken. 

Methoden die verondersteld worden iets terug te geven, moeten in hun _method signature_ aangeven wat voor soort waarde ze gaan teruggeven. Dit kunnen alle types zijn die je al eerder hebt gezien (en nog veel meer). De plek waar je dit moet aangeven is het 2e woord in de _method signature_ (direct na `public`). 

Een voorbeeld van een zeer eenvoudige methode:
```java
public int plus(int valueOne, int valueTwo) {...}
```
In dit voorbeeld verklaart de `plus` methode dat het een integer zal opleveren. Voor het gemak laten we de implementatie van de methode even weg, maar je kan je vast voorstellen wat deze methode precies moet doen.  

Laten we deze methode eens gebruiken! Dit kan je op twee manieren doen, los-staand (als _statement_) of als onderdeel van een grotere instructie (als _expressie_). Dit ziet er uit als:

```java
SaxionApp.printLine("The result of 3 + 4 is " + plus(3, 4)); 
```
of
```java
int result = plus(3, 5) + plus (10, 15);
```

Als je een methode schrijft die in principe niets hoeft op te leveren (zoals bijvoorbeeld `printLine` of `drawHouse`) moet je alsnog een return type opgeven. Het veld kan namelijk niet zomaar open gelaten worden. Om echter aan te geven dat je niets wil opleveren is er daarom een speciaal return-type bedacht genaamd `void` (wat ook wel "leegte" betekent in het Engels). Methoden die een `void` opleveren zijn dus methoden die geen waarde opleveren (en kan je dus ook niet opvangen). Ook is het niet mogelijk om een "void" op te slaan in een variabele.
```java
public void drawHouse(int xCoordinate, int yCoordinate) {...} 
```   
Methoden die `void` opleveren kunnen niet worden gebruikt in variabelen of andere instructies. Ze kunnen alleen worden gebruikt als afzonderlijke, op zichzelf staande instructies, zoals:
```java
SaxionApp.printLine("Hi!");

drawHouse(10, 20);
```

Nu we weten wat return-typen zijn is het tijd om het laatste onderdeel te bekijken: parameters.

#### Parameters
Het laatste deel van de _method signature_ is de lijst met parameters. Voor elke parameter moet je het type specificeren en deze een _naam_ geven, vergelijkbaar met andere variabelen die je hebt gemaakt. Dit zou eruit kunnen zien:
```java
public int plus(int valueOne, int valueTwo) {...}
```
In dit geval moeten twee parameters (waarde One en waardeTwo) van het type int worden meegegeven tijdens de aanroeping van de methode, zoals:
```java
int result = plus(3, 5);
```
In alle andere situaties (met meer of minder parameters, parameters van het verkeerde type, etc.) zal Java een fout produceren.

Methoden hoeven geen parameters te hebben, zoals de `pauze` of `clear` methoden van SaxionApp of de `run` methode waarin je vaak je code zet. In dat geval hoef je geen type of naam op te geven, maar hoef je alleen de verplichte haakjes neer te zetten.
```java
public void run() { ... } 
```
Technisch gezien is er geen limiet aan het aantal parameters dat een methode kan hebben, maar het is vrij gebruikelijk om "maximaal" 4 parameters te hebben (dit raden we je ook aan om als limiet te gebruiken). Het hebben van meer dan 4 parameters betekent meestal dat je methode "te veel" wil laten doen, welk punt 4 (een methode moet _een_ ding en een ding goed doen) eigenlijk teniet doet. Nogmaals, maak je hier in dit stadium niet te veel zorgen over, maar probeer je methoden gaandeweg te verbeteren.

#### Subtiele verschillen: Parameters of Argumenten
Als je over het maken en gebruiken van methoden leest, zie je waarschijnlijk twee woorden opduiken die bijna hetzelfde betekenen (maar ook weer net niet): parameters en argumenten. En hoewel ze zeer nauw verwant zijn, is er een (formeel) verschil. Een parameter is een variabele in een methodedefinitie (zoals we al eerder hebben laten zien), een argument is iets wat je invult tijdens het aanroepen van een methode. 

Dus, in onderstaande voorbeeld zijn de variabelen valueOne en valueTwo parameters van de methode `plus`.
```java
public int plus(int valueOne, int valueTwo) {...}
``` 

en zijn "3" en "5" de argumenten van de aanroep in het voorbeeld hieronder.

```java
int result = plus(3, 5);
```

#### Tijd om alles samen te voegen
Laten we een methode maken die van 3 meegegeven waarden kan bepalen wat de hoogste waarde is. We noemen de methode `findMax` en gaan deze methode 3 integer waarden meegeven waarna vervolgens de hoogste waarde zal worden teruggegeven. Het return-type van deze methode is dus een integer, gelijk aan het type van de parameters.

Stap één is het creëren van het skelet en het invullen van de _methods signature_ zoals we die hebben ontworpen:
```java
public int findMax(int valueOne, int valueTwo, int valueThree)  {
    // Nothing here yet!
}
```

Als je deze code nu aan IntelliJ zou toevoegen, zal dat een fout opleveren. De methode belooft namelijk een integer terug te geven, maar geeft nog niets terug. We kunnen dit veranderen door gebruik te maken van een `return`-statement in onze code.

```java
public int findMax(int valueOne, int valueTwo, int valueThree)  {
    return 0; // Fixed the compilation issue - The answer isn't correct, but now your program runs!    
}
```
Het woordje "return" geeft de computer de opdracht om uw methode daar te beëindigen en het geleverde resultaat terug te sturen (naar de plek van de aanroep van de methode). 

Laten we het voorbeeld afronden en een voorbeeldinvulling geven. Er zijn natuurlijk meerdere implementaties mogelijk... maar laten we aannemen dat je zoiets hebt gemaakt:
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
Zoals je kunt zien, hebben we een aantal (inefficiënte) codes toegepast om de maximale waarde te bepalen en het maximum aan het einde van de code te "returnen". Stel nu dat je nu met een andere programmeur in discussie bent geraakt die beweert dat hij/zij het beter kan en de volgende code produceert:

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
Deze methode vereist wel wat meer "return" statements (wat ok is - je mag net zoveel "returns" gebruiken als je wilt!), maar over het algemeen is het aan jou om te beslissen welke versie van de `findMax` methode je wil gebruiken in jouw programma. Je kan zeg echter **allebei** tegelijk opnemen (een _method signature_ moet uniek zijn)!

Merk op dat de handtekening van de methode verder **niet** is veranderd, het heeft alleen een andere (en mogelijk efficiëntere) implementatie gekregen, wat betekent dat alle andere onderdelen van je applicatie die deze methode gebruiken ook niet hoeven te worden aangepast. Dit is ook wel wat bekend staat als _verbergen_ de implementatie: Alle gebruikers van jouw methode hoeven op zich niet te weten hoe jouw methode werkt.. maar kunnen wel gebruik maken van jouw `findMax` methode. De exacte werking wordt dus verscholen voor andere programmeurs (net zoals wij met de SaxionApp gedaan hebben!).
