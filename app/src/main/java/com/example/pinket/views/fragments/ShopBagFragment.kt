package com.example.pinket.views.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.pinket.R

/**
 * A simple [Fragment] subclass.
 */
class ShopBagFragment : Fragment() {


    companion object {
        fun newInstance(): ShopBagFragment {
            val args = Bundle()
            val fragment =
                ShopBagFragment()
            fragment.arguments = args
            return fragment
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_shop_bag, container, false)


        return view
    }


}
