package com.example.pinket.views.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager

import com.example.pinket.R
import com.example.pinket.adapters.ProductRecyclerView
import kotlinx.android.synthetic.main.fragment_categories.view.*

/**
 * A simple [Fragment] subclass.
 */
class CategoriesFragment : Fragment() {

    lateinit var productRecyclerAdapter: ProductRecyclerView
    companion object {
        fun newInstance(): CategoriesFragment {
            val args = Bundle()
            val fragment =
                CategoriesFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_categories, container, false)
        val recyclerViewImages = ArrayList<Int>()
        for(i in 1..4){
            recyclerViewImages.add(R.drawable.digikala)
        }
        initRecyclerView(recyclerViewImages,view)

        return view
    }

    private fun initRecyclerView(images:List<Int>,view: View) {
        view.category_fragment_recyclerview.layoutManager = GridLayoutManager(context!!, 2)
        productRecyclerAdapter= ProductRecyclerView(context!!,images)
        view.category_fragment_recyclerview.adapter=productRecyclerAdapter
    }

}
