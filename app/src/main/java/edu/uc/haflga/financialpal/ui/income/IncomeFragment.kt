package edu.uc.haflga.financialpal.ui.income

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import edu.uc.haflga.financialpal.R

/**
 * This fragment runs and creates the income_fragment view,
 * it will send and receive data through the IncomeViewModel
 */
class IncomeFragment : Fragment() {

    companion object {
        fun newInstance() = IncomeFragment()
    }

    private lateinit var viewModel: IncomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.income_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(IncomeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
