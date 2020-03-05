package com.example.pinket


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.smarteist.autoimageslider.IndicatorAnimations
import com.smarteist.autoimageslider.SliderView
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_main.view.*

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {
    lateinit var sliderAdapter: SliderAdapter
    lateinit var sliderView: SliderView
    lateinit var productRecyclerView: ProductRecyclerView

    companion object {
        fun newInstance(): MainFragment {
            val args = Bundle()
            val fragment = MainFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        val sliderImages = ArrayList<Int>()
        val recyclerViewImages = ArrayList<Int>()
        sliderImages.add(R.drawable.slider_page_first)
        sliderImages.add(R.drawable.slider_page_second)
        sliderImages.add(R.drawable.slider_page_third)
        for(i in 1..10){
            recyclerViewImages.add(R.drawable.digikala)
        }
        sliderView = view.findViewById(R.id.imageSlider)
        initSliderAdapter(sliderImages)
        initRecyclerView(recyclerViewImages,view)
        return view
    }

    private fun initSliderAdapter(images: List<Int>) {
        sliderAdapter = SliderAdapter(context!!, images)
        sliderView.sliderAdapter = sliderAdapter
    }

    private fun initRecyclerView(images: List<Int>,view:View) {
        productRecyclerView = ProductRecyclerView(context!!, images)
        view.fragment_main_newest_product_recycler.adapter = productRecyclerView
        view.fragment_main_rated_product_recycler.adapter = productRecyclerView
        view.fragment_main_popular_product_recycler.adapter = productRecyclerView
    }
}
