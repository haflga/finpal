package edu.uc.haflga.financialpal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.uc.haflga.financialpal.ui.income.IncomeFragment

class income : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.income_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, IncomeFragment.newInstance())
                .commitNow()
        }
    }

}
