/*
* Project : Fibonacci_self
    Author : Seung-Pyo Hong
    St_ID : 22012246
    Major : Soft Engineering
*/

import java.util.Scanner

fun Fibo_SR(n : Int) : Int {
    if (n < 0) {
        println("Error in Fibonacci series, given n (%d) is negative !!".format(n))
    }
    if ((n >= 0) && (n <= 1)) {
        return n
    } else {
        var fibo_n = Fibo_SR(n-2) + Fibo_SR(n-1)
        return fibo_n
    }
}


fun main(args: Array<String>) {
    val cin = Scanner(System.`in`)

    print("Input n to generate Fibonacci series (0 ~ n) : ")
    val num = cin.nextInt()

    for (i in 0 .. num) {
        Fibo_SR(i)
        println("Fibo(%2d) = %10d".format(i, Fibo_SR(i)))
    }
}