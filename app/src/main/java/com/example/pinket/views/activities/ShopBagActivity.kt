package com.example.pinket.views.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pinket.R
import com.example.pinket.views.fragments.ShopBagFragment

class ShopBagActivity : AppCompatActivity() {
    val fm by lazy {
        supportFragmentManager
    }
    companion object {
        fun newIntent(context: Context): Intent {
            val intent = Intent(context, ShopBagActivity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop_bag)

        fm.beginTransaction().replace(R.id.shop_bag_container,ShopBagFragment.newInstance())
            .commit()
    }
}
