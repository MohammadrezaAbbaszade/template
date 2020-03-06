package com.example.pinket.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.pinket.R
import kotlinx.android.synthetic.main.buttmappbar.*
import kotlinx.android.synthetic.main.main_toolbar.*
import kotlinx.android.synthetic.main.main_toolbar.view.*
import kotlinx.android.synthetic.main.search_fragment_toolbar.*

class MainActivity : AppCompatActivity() {
    val fm by lazy {
        supportFragmentManager
    }
    var clicked = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
        buttom_appbar_home_image_view.setBackgroundResource(R.drawable.ic_home_active)
        val fragment: Fragment? = fm.findFragmentById(R.id.fragment_container)
        fm.beginTransaction().replace(
            R.id.fragment_container,
            MainFragment.newInstance())
            .commit()


    }

    private fun setListeners() {
        buttom_appbar_home_image_view.setOnClickListener {
            clicked = !clicked
            buttom_appbar_search_image_view.setBackgroundResource(R.drawable.ic_search_idle)
            buttom_appbar_receipt_image_view.setBackgroundResource(R.drawable.ic_receipt_idle)
            buttom_appbar_category_image_view.setBackgroundResource(R.drawable.ic_category_idle)
            it.setBackgroundResource(R.drawable.ic_home_active)
            main_toolbar.visibility = View.VISIBLE
            if (!MainFragment.newInstance().isVisible) {
                fm.popBackStack()
                fm.beginTransaction().replace(R.id.fragment_container, MainFragment.newInstance())
                    .commit()
            }

        }
        buttom_appbar_search_image_view.setOnClickListener {
            clicked = !clicked
            main_toolbar.visibility = View.GONE
            if (!SearchFragment.newInstance().isVisible) {
                fm.popBackStack()
                fm.beginTransaction().replace(R.id.fragment_container, SearchFragment.newInstance())
                    .addToBackStack(null)
                    .commit()
            }
            buttom_appbar_home_image_view.setBackgroundResource(R.drawable.ic_home_idle)
            buttom_appbar_category_image_view.setBackgroundResource(R.drawable.ic_category_idle)
            buttom_appbar_receipt_image_view.setBackgroundResource(R.drawable.ic_receipt_idle)
            it.setBackgroundResource(R.drawable.ic_search_active)

        }
        buttom_appbar_category_image_view.setOnClickListener {
            clicked = !clicked
            main_toolbar.visibility = View.VISIBLE
            if (!CategoriesFragment.newInstance().isVisible) {
                fm.popBackStack()
                fm.beginTransaction().replace(R.id.fragment_container, CategoriesFragment.newInstance())
                    .addToBackStack(null)
                    .commit()
            }
            buttom_appbar_home_image_view.setBackgroundResource(R.drawable.ic_home_idle)
            buttom_appbar_search_image_view.setBackgroundResource(R.drawable.ic_search_idle)
            buttom_appbar_receipt_image_view.setBackgroundResource(R.drawable.ic_receipt_idle)
            it.setBackgroundResource(R.drawable.ic_category_active)

        }
        buttom_appbar_receipt_image_view.setOnClickListener {
            clicked = !clicked

            buttom_appbar_home_image_view.setBackgroundResource(R.drawable.ic_home_idle)
            buttom_appbar_search_image_view.setBackgroundResource(R.drawable.ic_search_idle)
            buttom_appbar_category_image_view.setBackgroundResource(R.drawable.ic_category_idle)
            it.setBackgroundResource(R.drawable.ic_receipt_active)
        }


    }

    override fun onBackPressed() {
        super.onBackPressed()
        if(!MainFragment.newInstance().isVisible) {
            buttom_appbar_home_image_view.setBackgroundResource(R.drawable.ic_home_active)
            buttom_appbar_search_image_view.setBackgroundResource(R.drawable.ic_search_idle)
            buttom_appbar_category_image_view.setBackgroundResource(R.drawable.ic_category_idle)
            buttom_appbar_receipt_image_view.setBackgroundResource(R.drawable.ic_receipt_idle)
        }
    }

}
