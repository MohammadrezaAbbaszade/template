package com.example.pinket.views.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.pinket.R
import com.example.pinket.views.fragments.accounts_related_fragments.AccountFragment

/**
 * A simple [Fragment] subclass.
 */
class PaymentResultFragment : Fragment() {


    companion object {
        fun newInstance(): PaymentResultFragment {
            val args = Bundle()
            val fragment =
                PaymentResultFragment()
            fragment.arguments = args
            return fragment
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_payment_result, container, false)



        return view
    }


}
