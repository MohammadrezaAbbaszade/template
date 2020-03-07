package com.example.pinket.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pinket.R

class AccountActivity : AppCompatActivity() {
    val fm by lazy {
        supportFragmentManager
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        fm.beginTransaction().replace(R.id.account_container,AccountFragment.newInstance()).commit()

    }
}
