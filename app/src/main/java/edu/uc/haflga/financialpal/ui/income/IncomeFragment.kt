package edu.uc.haflga.financialpal.ui.income

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import edu.uc.haflga.financialpal.R

class IncomeFragment : Fragment() {

    companion object {
        fun newInstance() = IncomeFragment()
    }

    private lateinit var viewModel: IncomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(
            R.layout.income_fragment, container, false
        )
    }

    override fun onActivityCreated(
        savedInstanceState: Bundle?
    ) {
        super.onActivityCreated(
            savedInstanceState
        )
        viewModel = ViewModelProviders.of(
                this
            ).get(
                IncomeViewModel::class.java
            )
        // TODO: Use the ViewModel
    }
}
