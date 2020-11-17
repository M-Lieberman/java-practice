# java-practice

Java coding puzzles and sample code.




## Handy Functions for Puzzles

### String Functions

##### Separating Strings
```java
String[] words = sentence.split(" ");
```

##### Joining Strings - To join an array of Strings with a space delimiter
```java
String[] words 
String.join(" ", words) 
```

##### StringJoiner - joins Strings without an initial array
```java
StringJoiner fruitJoiner = new StringJoiner(", ");
fruitJoiner.add("Apples");
fruitJoiner.add("Oranges");
fruitJoiner.add("Bananas");
 
assertEquals("Apples, Oranges, Bananas", fruitJoiner.toString());
```

##### Reversing a String - Using StringBuilder
```java
StringBuilder word = new StringBuilder();
String reversed = word.reverse();
// or in one line
String reversed = new StringBuilder(word).reverse().toString();
```

##### String Array to Set (remove duplicates)
```
Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
``` 

##### Set to String Array
```java
String[] stringArray = new String[stringSet.size()];
uniqueNames.toArray(stringArray);
```
##### Checking if a char is a digit
```java
boolean isCharADigit Character.isDigit(c);
``` 
##### Reversing an Array of Strings
```java
String[] array = ....
Collections.reverse(Arrays.asList(array));
``` 


##### StringBuilder to char array
```java
StringBuilder str = new StringBuilder("java programming");
// char array
char[] cArr = new char[]{'t','u','t','o','r','i','a','l','s'};

// copy the chars from index 5 to index 10 into subarray of cArr
// the offset into destination subarray is set to 3
str.getChars(5, 10, cArr, 3);

``` 
##### String to char array
```java
char[] chars = str.toCharArray();
```
##### char array to String
```java
char[] chars = {'h', 'e', 'l', 'l', 'o'};
String word = String.valueOf(chars);
```

#### Regex

Setting up a Pattern and Matcher
```java
Pattern p = Pattern.compile("[a-z]{4,}", Pattern.CASE_INSENSITIVE);
Matcher matcher = p.matcher(string);

```

Example of matcher functions used in CodeWars [Abbreviate puzzle](https://www.codewars.com/kata/5375f921003bf62192000746/train/java)
```java
// pattern match with regex all words we need to change
Pattern p = Pattern.compile("[a-z]{4,}", Pattern.CASE_INSENSITIVE);
Matcher matcher = p.matcher(string);

StringBuilder sb = new StringBuilder();
// matcher.find() searches for matches until it cannot find anymore
while (matcher.find()) {
    // matcher.group() grants access to the matching text within the group
    String g = matcher.group();
    int length = g.length();
    // matcher.appendReplacement() keeps track of what has been copied into StringBuilder,
    // so can update these during the append
    matcher.appendReplacement(sb, g.substring(0, 1) + (length - 2) + g.substring(length - 1, length));
}
// match.appendTail() appends characters from the end of the last match
matcher.appendTail(sb);
```
