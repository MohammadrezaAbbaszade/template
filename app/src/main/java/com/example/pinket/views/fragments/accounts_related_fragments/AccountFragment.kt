package com.example.pinket.views.fragments.accounts_related_fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.pinket.R
import kotlinx.android.synthetic.main.account_toolbar.view.*

/**
 * A simple [Fragment] subclass.
 */
class AccountFragment : Fragment() {


    companion object {
        fun newInstance(): AccountFragment {
            val args = Bundle()
            val fragment =
                AccountFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_account, container, false)
        view.account_toolbar_menu.setOnClickListener {
            activity?.finish()
        }
        view.account_toolbar_account.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.account_container,
                    UserAccountFragment.newInstance()
                )
                ?.addToBackStack(null)
                ?.commit()
        }
        view.account_toolbar_address.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.account_container,
                    AddressFragment.newInstance()
                )
                ?.addToBackStack(null)
                ?.commit()
        }
        return view
    }


}
