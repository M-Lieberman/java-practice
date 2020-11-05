# java-practice

Java coding puzzles and sample code.




## Handy Functions for Puzzles

### String Functions

##### Separating Strings
```
String[] words = sentence.split(" ");
```

##### Joining Strings - To join an array of Strings with a space delimiter
```
String[] words 
String.join(" ", words) 
```

##### StringJoiner - joins Strings without an initial array
```
StringJoiner fruitJoiner = new StringJoiner(", ");
fruitJoiner.add("Apples");
fruitJoiner.add("Oranges");
fruitJoiner.add("Bananas");
 
assertEquals("Apples, Oranges, Bananas", fruitJoiner.toString());
```

##### Reversing a String - Using StringBuilder
```
StringBuilder word = new StringBuilder();
String reversed = word.reverse();
// or in one line
String reversed = new StringBuilder(word).reverse().toString();
```



