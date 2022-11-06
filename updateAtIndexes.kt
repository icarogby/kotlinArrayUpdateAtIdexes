fun <T> Array<T>.updateAtIndexes (range : IntRange, array: Array<T>){
    var j = 0

    for(i in range){
        this[i] = array[j++]
    }
}

fun <T> Array<T>.updateAtIndexes (range : IntRange, func : (Int) -> T){
    for(i in range){
        this[i] = func(i)
    }
}
