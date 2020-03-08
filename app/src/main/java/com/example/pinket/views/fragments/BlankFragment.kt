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
class BlankFragment : Fragment() {

    companion object {
        fun newInstance(): BlankFragment {
            val args = Bundle()
            val fragment = BlankFragment()
            fragment.arguments = args
            return fragment
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }


}
