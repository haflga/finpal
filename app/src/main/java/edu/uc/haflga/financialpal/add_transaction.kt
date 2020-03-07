package edu.uc.haflga.financialpal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.uc.haflga.financialpal.ui.addtransaction.AddTransactionFragment

class add_transaction : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_transaction_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, AddTransactionFragment.newInstance())
                .commitNow()
        }
    }

}
