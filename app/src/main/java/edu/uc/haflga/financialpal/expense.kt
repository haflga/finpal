package edu.uc.haflga.financialpal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.uc.haflga.financialpal.ui.expense.ExpenseFragment

class expense : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.expense_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(R.id.container, ExpenseFragment.newInstance()).commitNow()
        }
    }
}
