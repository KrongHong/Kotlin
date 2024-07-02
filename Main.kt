/*
* Project : insertionSorting
    Author : Seung-Pyo Hong
    St_ID : 22012246
    Major : Soft Engineering
*/

import java.util.*

fun insertionSort(array: IntArray) {
    val size = array.size
    for (i in 0 until size) {
        val key = array[i]
        var j = i
        while (j >0) {
            if(array[j-1] <= key)
                break;
            array[j] = array[j-1]
            j--
        }
        array[j] = key
    }
}

fun main(args: Array<String>) {
    val cin = Scanner(System.`in`)
    val arraysize = 10
    print("Input $arraysize integers : ")
    val num = IntArray(arraysize)
    for (i in 0 until arraysize) {
        num[i] = cin.nextInt()
    }

    print("Input data before sorting : ")
    for (eleement in num)
    {
        print("$eleement ")
    }
    println()
    insertionSort(num)
    print("Input data after sorting : ")
    for (eleement in num)
    {
        print("$eleement ")
    }
}