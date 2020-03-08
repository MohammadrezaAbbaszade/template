package com.example.pinket.views.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager

import com.example.pinket.R
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_customers_items.view.*

/**
 * A simple [Fragment] subclass.
 */
class CustomersItemsFragment : Fragment() {

    private lateinit var tabs: TabLayout
    private lateinit var viewPager: ViewPager
    companion object {
        fun newInstance(): CustomersItemsFragment {
            val args = Bundle()
            val fragment =
                CustomersItemsFragment()
            fragment.arguments = args
            return fragment
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_customers_items, container, false)
        viewPager = view.customers_items_view_pager
        tabs = view.findViewById(R.id.customers_items_tab_layout)
        viewPager.adapter = object : FragmentStatePagerAdapter(activity?.supportFragmentManager) {
            override fun getItem(position: Int): Fragment {
                when (position) {
                    0 -> return BlankFragment.newInstance()
                    1 -> return BlankFragment.newInstance()
                }

                return BlankFragment.newInstance()
            }

            override fun getCount(): Int {
                return 2
            }

            override fun getPageTitle(position: Int): CharSequence? {
                lateinit var title:String
                when (position) {
                    0 -> title = "All"
                    1 -> title = "Mens"
                }
                return title
            }
        }
        tabs.setupWithViewPager(viewPager)
        return view
    }


}
