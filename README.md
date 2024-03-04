# <h1 align="center">Easy Java</h1>
## <h2 align="center">EasyJava is a straightforward Java library crafted to simplify everyday tasks for Java developers. It provides convenient methods for effortless operation execution, helping streamline your workflow with ease.</h2>
### [More details on Sonatype page](https://central.sonatype.com/artifact/io.github.heshanthenura/easy-java)
#### for Maven projects
```
<dependency>
    <groupId>io.github.heshanthenura</groupId>
    <artifactId>easy-java</artifactId>
    <version>0.2</version>
</dependency>
```
#### for Gradle projects
```
implementation group: 'io.github.heshanthenura', name: 'easy-java', version: '0.2'
```
#### for other build tools check this [site](https://central.sonatype.com/artifact/io.github.heshanthenura/easy-java).

### Menu
#### [File Manipulation](#file-manipulation)
#### [User Input](#user-input)
#### [Generating a Range of Integers](#1-generating-a-range-of-integers-1)
#### [Generating Random Numbers](#generating-random-numbers)
 - [Integer](#integer)
 - [Double](#double)
 - [Float](#float)
#### [Generating a Random Boolean Value](#generating-a-random-boolean-value)
#### [Getting a Random Element from a List](#getting-a-random-element-from-a-list)


### Usage

#### File Manipulation
* Read File:
```java
// Read the content of a text file into a single string
String fileContent = EasyJava.readFile("example.txt");
```
This method reads the content of a text file and returns it as a single string.

* Append to File:
```java
// Append content to a text file
String contentToAppend = "New content to append";
EasyJava.appendToFile("example.txt", contentToAppend);
```
This method appends the specified content to the end of a text file.
* Read Lines:
```java
// Read the content of a text file line by line into a list of strings
List<String> fileLines = EasyJava.readLines("example.txt");
```
This method reads the content of a text file line by line and returns it as a list of strings.
* Prepend to File:
```java
// Prepend content to a text file
String contentToPrepend = "New content to prepend";
EasyJava.prependToFile("example.txt", contentToPrepend);
```
This method prepends the specified content to the beginning of a text file.
#### User Input
```java
// Simple input prompt
String userInput = (String) EasyJava.input();

// Input prompt with a custom message
String name = (String) EasyJava.input("Enter your name: ");

// Input prompt with a custom message and delimiter
List<String> words = (List<String>) EasyJava.input("Enter words separated by commas: ", ",");

```
* If no arguments are provided, the method prompts the user for input without displaying any message or using a delimiter.
* With a single argument, the method uses it as the prompt message.
* With two arguments, the first argument is the prompt message, and the second is the delimiter for splitting the input string.

#### Generating a Range of Integers
```java 
List<Integer> numbers = EasyJava.range(start);
easyJava.range(10);
// Output: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

List<Integer> numbers = EasyJava.range(start, end);
easyJava.range(0,5);
// Output: [0, 1, 2, 3, 4]

easyJava.range(5,0);
// Output: [5, 4, 3, 2, 1]

List<Integer> numbers = EasyJava.range(start, end, step);
easyJava.range(0, 10, 2);
// Output: [0, 2, 4, 6, 8]

easyJava.range(20, 0, -3);
// Output: [20, 17, 14, 11, 8, 5, 2]
```
Generates a list of integers within the specified range.

* start: the starting value of the range (inclusive)
* end: the ending value of the range (exclusive) (optional)
* step: the step size between consecutive integers (optional)

#### Generating Random Numbers
#### Integer
```java
int randomNumber = EasyJava.randomInt(min, max);
```
Generates a random integer within the specified range.

* min: the minimum value of the range (inclusive)
* max: the maximum value of the range (inclusive)

#### Double
```java
double randomDouble = EasyJava.randomDouble(min, max);
```
Generates a random double within the specified range.

* min: the minimum value of the range (inclusive)
* max: the maximum value of the range (inclusive)

#### Float
```java
float randomFloat = EasyJava.randomFloat(min, max);
```
Generates a random float within the specified range.

* min: the minimum value of the range (inclusive)
* max: the maximum value of the range (inclusive)

#### Generating a Random Boolean Value
```java
boolean randomBoolean = EasyJava.randomBoolean();
```
Generates a random boolean value (true or false).

#### Getting a Random Element from a List
```java
List<T> list = ...; // Your list
T randomElement = EasyJava.getRandomElement(list);
```
Returns a random element from the given list.

* list: the list from which to select a random element