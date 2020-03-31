package edu.uc.haflga.financialpal.dto

//Category Class for transactions
//Limit parameter for transaction limit will be implemented in next sprint...
class Category(var name: String, var limit: Limit = Limit(0f)) {
    var id: Int = 0

    //Creating an ArrayList for transaction Categories
    var allCategories = ArrayList<Category>() // TODO: move to temp file like Database.kt to handle tracking data until implementing the Firebase stuff
    var transactions = ArrayList<Transaction>()

    //Adding a new category to the ArrayList
    fun addCategory(category: Category) {
        allCategories.add(category)
    }

    //Adding a new transaction to the ArrayList
    fun addTransaction(transaction: Transaction) {
        transactions.add(transaction)
    }

    fun isOverLimit(): Boolean {
        var sumTransactions = 0f
        transactions.forEach{ sumTransactions += it.amount }
        return limit <= sumTransactions
    }
}
