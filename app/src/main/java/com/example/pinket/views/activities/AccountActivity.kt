package com.example.pinket.views.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pinket.R
import com.example.pinket.views.fragments.accounts_related_fragments.AccountFragment

class AccountActivity : AppCompatActivity() {
    val fm by lazy {
        supportFragmentManager
    }
    companion object {
        fun newIntent(context: Context, nameOfFragmrnts:String): Intent {
            val intent = Intent(context, AccountActivity::class.java)
            return intent
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        fm.beginTransaction().replace(R.id.account_container,
            AccountFragment.newInstance()).commit()

    }
}
