package com.example.pinket.views.fragments.accounts_related_fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.pinket.R

/**
 * A simple [Fragment] subclass.
 */
class FinancialFragment : Fragment() {


    companion object {
        fun newInstance(): FinancialFragment {
            val args = Bundle()
            val fragment =
                FinancialFragment()
            fragment.arguments = args
            return fragment
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_financial, container, false)


        return view
    }


}
