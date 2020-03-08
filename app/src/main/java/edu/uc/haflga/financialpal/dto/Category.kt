package edu.uc.haflga.financialpal.dto

//Category Class for transactions
//Limit parameter for transaction limit will be implemented in next sprint...
class Category(var name: String, var limit: Limit?) {

    var id: Int = 0
    //Creating an ArrayList for transaction Categories
    private var allCategories = ArrayList<Category>()

    //Adding a new category to the ArrayList
    fun addCategory(category: Category) {
        allCategories.add(category)
    }
}