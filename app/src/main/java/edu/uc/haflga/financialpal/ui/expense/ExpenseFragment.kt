package edu.uc.haflga.financialpal.ui.expense

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import edu.uc.haflga.financialpal.R

class ExpenseFragment : Fragment() {

    companion object {
        fun newInstance() = ExpenseFragment()
    }

    private lateinit var viewModel: ExpenseViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.expense_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ExpenseViewModel::class.java)

    }
}
