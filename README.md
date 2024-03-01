# <h1 align="center">Easy Java</h1>
## <h2 align="center">EasyJava is a straightforward Java library crafted to simplify everyday tasks for Java developers. It provides convenient methods for effortless operation execution, helping streamline your workflow with ease.</h2>
### [More details on Sonatype page](https://central.sonatype.com/artifact/io.github.heshanthenura/easy-java)
#### for Maven projects
```
<dependency>
    <groupId>io.github.heshanthenura</groupId>
    <artifactId>easy-java</artifactId>
    <version>0.1</version>
</dependency>
```
#### for Gradle projects
```
implementation group: 'io.github.heshanthenura', name: 'easy-java', version: '0.1'
```
#### for other build tools check this [site](https://central.sonatype.com/artifact/io.github.heshanthenura/easy-java).

### Usage

#### Generating a Range of Integers
```java 
List<Integer> numbers = EasyJava.range(start, end, step);
```
Generates a list of integers within the specified range.

* start: the starting value of the range (inclusive)
* end: the ending value of the range (exclusive)
* step: the step size between consecutive integers

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
* max: the maximum value of the range (exclusive)

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