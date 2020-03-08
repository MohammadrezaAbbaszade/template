package com.example.pinket.views.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.view.View
import android.widget.Switch
import androidx.fragment.app.Fragment
import com.example.pinket.NumbersOfFragments
import com.example.pinket.R
import com.example.pinket.views.fragments.CategoriesFragment
import com.example.pinket.views.fragments.CustomersItemsFragment
import com.example.pinket.views.fragments.MainFragment
import com.example.pinket.views.fragments.SearchFragment
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.buttmappbar.*
import kotlinx.android.synthetic.main.main_toolbar.*

class MainActivity : AppCompatActivity() {
    val fm by lazy {
        supportFragmentManager
    }
    var clicked = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
        setMenuItemsListeners()
        buttom_appbar_home_image_view.setBackgroundResource(R.drawable.ic_home_active)
        val fragment: Fragment? = fm.findFragmentById(R.id.fragment_container)
        fm.beginTransaction().replace(
            R.id.fragment_container,
            MainFragment.newInstance())
            .commit()
        main_toolbar_basket.setOnClickListener {
            val intent=ShopBagActivity.newIntent(this)
            startActivity(intent)
        }

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
            main_toolbar.visibility = View.VISIBLE
            if (!CustomersItemsFragment.newInstance().isVisible) {
                fm.popBackStack()
                fm.beginTransaction().replace(R.id.fragment_container, CustomersItemsFragment.newInstance())
                    .addToBackStack(null)
                    .commit()
            }
            buttom_appbar_home_image_view.setBackgroundResource(R.drawable.ic_home_idle)
            buttom_appbar_search_image_view.setBackgroundResource(R.drawable.ic_search_idle)
            buttom_appbar_category_image_view.setBackgroundResource(R.drawable.ic_category_idle)
            it.setBackgroundResource(R.drawable.ic_receipt_active)
        }
        main_toolbar_menu.setOnClickListener {

                if (acvity_drawer.isDrawerOpen(Gravity.RIGHT)) {
                    acvity_drawer.closeDrawer(Gravity.RIGHT)
                } else {
                    acvity_drawer.openDrawer(Gravity.RIGHT)
                }
        }

    }
private fun setMenuItemsListeners() {
    navigation.setNavigationItemSelectedListener(object : NavigationView.OnNavigationItemSelectedListener {
        override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
            when(menuItem.itemId){
                R.id.user_info ->{
                    val intent=AccountActivity.newIntent(this@MainActivity,NumbersOfFragments.ACOCOUNT_FRAGMENT.name)
                    startActivity(intent)
                }
            }

            return true
        }

    })
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
