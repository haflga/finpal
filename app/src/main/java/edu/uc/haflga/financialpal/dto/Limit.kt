package edu.uc.haflga.financialpal.dto

// THIS IS THE LIMIT CLASS FOR THE LIMIT AMOUNT FOR DIFFERENT TRANSACTION CATEGORIES
data class Limit(var amount: Float) : Comparable<Float> {
    override fun compareTo(num: Float) = when {
        amount < num ->  -1
        amount > num -> 1
        else -> 0
    }
}
