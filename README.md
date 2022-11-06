
# Update At Indexes function for Arrays In Kotlin

## 1. Definition

In this repository you will find extention functions to Array Class that provides tools to update a slice of a array using another one.

## 2. Examples

Lets begin with a main array caled `list` and other that will have the values you want to update in the main called `newValues`.

    val list = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val newValues = arrayOf(-3, -4, -5, -6, -7)

the initial values in `list` are:

> 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

You can call the function passing a `IntRange` as first parameter and the array that will update the main array as second parameter.

    list.updateAtIndexes(2..6, newValues)

The `IntRange` will represent the first and last indexes of the main array that will be updated. In this case, the `IntRange` is from 2 to 6, so the values in the main array from index 2 to 6 will be updated with the values in `newValues` array.

The new values of `list` are:

>1, 2, -3, -4, -5, -6, -7, 8, 9, 10

You also can call the function passing another function as parameter, where all the values inside the passed range will be update according to this one.

    list.updateAtIndexes(8..9) {0}

Then, the new values of `list` are:

> 1, 2, 3, 4, 5, 6, 7, 8, 0, 0

An usefull way to use this functions is with slice function to update a slice of the main list with a slice of the updating list like the exemple bellow:

    list.updateAtIndexes(4..6,  update.slice(2..4).toTypedArray())

The values of `list` are:

> 1, 2, 3, 4, -5, -6, -7, 8, 9, 10

In `.kt` file you will find examples.

## 3. Implementaion

You can do the implementation of this functions simply declaring it in your code.

## 4. Conclusion

This functions can help you in a lot of situations where you need to update a slice of a array with a already existing array.

We hope this can help you in your projects. If you have any question, please, contact us.

## 5. Credits:

- [Ícaro Gabryel](https://github.com/icarogby)
- [Wesley Vitor](https://github.com/alpha11000)
