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

### Menu
#### 1. [Generating a Range of Integers](#generating-a-range-of-integers)
#### 2. [Generating Random Numbers](#generating-random-numbers)
 - 2.1 [Integer](#integer)
 - 2.2 [Double](#double)
 - 2.3 [Float](#float)
#### 3. [Generating a Random Boolean Value](#generating-a-random-boolean-value)
#### 4. [Getting a Random Element from a List](#getting-a-random-element-from-a-list)

### Usage

#### 1. Generating a Range of Integers
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