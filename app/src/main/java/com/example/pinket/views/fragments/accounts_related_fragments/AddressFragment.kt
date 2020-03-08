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
class AddressFragment : Fragment() {


    companion object {
        fun newInstance(): AddressFragment {
            val args = Bundle()
            val fragment =
                AddressFragment()
            fragment.arguments = args
            return fragment
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_address, container, false)


        return view
    }


}
