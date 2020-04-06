package edu.uc.haflga.financialpal.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    private var moneyText = ""
    private var result: FLoat = 0f

    fun setAmount (value: String) {
        this.moneyText = value
        result = value.toFloat()
    }
    fun getResult(): Float? {
        return result
    }

}
