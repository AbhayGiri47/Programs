package com.example.gitbase

fun main(){
    // find min and max from given array
    val num = intArrayOf(2,3,4,5,6,7,8,9,10,34,2,2,2)
    findMinMax(num)
}

fun findMinMax(num: IntArray) {
    var min = num[0]
    var max = num[0]
    for (number in num){
        if (min>number){
            min = number
        }
        if (max<number){
            max = number
        }
    }
    println("min is $min and max is $max")
}

fun printFibonacciSequence(num: Int) {

    var t1 = 0
    var t2 = 1
    var sum:Int
   for (i in 1..num){
       print("$t1 ")
       sum = t1+t2
       t1=t2
       t2=sum
   }
}

fun checkPrimeNumber(num:Int):Boolean{
    if (num<2){
        return false
    }
    if (num==2){
        return true
    }
    for (i in 2..num/2){
        if (num%i==0){
            return false
        }
    }
    return true
}