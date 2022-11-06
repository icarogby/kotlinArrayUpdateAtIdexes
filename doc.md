# Update At Indexes function for Arrays
## In Kotlin Language

### 1. Definition
In this repository you will find extentions functions to Array Class that provides tools to update a range of a array using another.

### 2. Exemple
At first, lets begin with a main array caled "list" and other that will have the values you want to update in the main caled "update".

    val list = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val update = arrayOf(-3, -4, -5, -6, -7)

the initial values in Array list are:

    1, 2, 3, 4, 5, 6, 7, 8, 9, 10

You can call the function passing a rangeIng as first parameter and the array that will update the main array as second parameter.

    list.updateAtIndexes(2..6, update)

Then, the new values of list are:

    1, 2, -3, -4, -5, -6, -7, 8, 9, 10

You also can call the function passing 

### 3. Implementaion
You can do the implementation of this functions simply declaring it in your code.

### 1. Credits:

- Ícaro Gabryel
- Wesley Vitor