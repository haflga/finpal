package edu.uc.haflga.financialpal.dto

import java.util.*

enum class TransactionType {
    INCOME,
    EXPENSE
}

class Transaction(var type: TransactionType, var amount: Float, var date: Date?, var category: Category?) {
    init {

    }
}
