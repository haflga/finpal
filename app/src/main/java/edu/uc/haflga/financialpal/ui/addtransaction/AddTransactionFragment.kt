package edu.uc.haflga.financialpal.ui.addtransaction

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import edu.uc.haflga.financialpal.R

/**
 * This fragment runs and creates the add_transaction_fragment view,
 *  it will send and receive data through the AddTransactionVieWModel
 */
class AddTransactionFragment : Fragment() {

    companion object {
        fun newInstance() = AddTransactionFragment()
    }

    private lateinit var viewModel: AddTransactionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.add_transaction_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AddTransactionViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
