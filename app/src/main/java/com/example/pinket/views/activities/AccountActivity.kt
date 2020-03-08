package com.example.pinket.views.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pinket.NumbersOfFragments
import com.example.pinket.R
import com.example.pinket.views.fragments.PaymentResultFragment
import com.example.pinket.views.fragments.accounts_related_fragments.AccountFragment

class AccountActivity : AppCompatActivity() {


    val fm by lazy {
        supportFragmentManager
    }

    companion object {
        private val NAME_OF_FRAGMENTS: String = "nameOfFragments"
        fun newIntent(context: Context, nameOfFragmrnts: String): Intent {
            val intent = Intent(context, AccountActivity::class.java)
            intent.putExtra(NAME_OF_FRAGMENTS, nameOfFragmrnts)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
        var nameOfFragmrnts = intent.getStringExtra(NAME_OF_FRAGMENTS)
        when(nameOfFragmrnts){
            NumbersOfFragments.PAYMENT_RESULT_FRAGMENT.name->{
                fm.beginTransaction().replace(
                    R.id.account_container,
                    PaymentResultFragment.newInstance()
                ).commit()
            }
            NumbersOfFragments.ACOCOUNT_FRAGMENT.name->{
                fm.beginTransaction().replace(
                    R.id.account_container,
                    AccountFragment.newInstance()
                ).commit()
            }

        }


    }
}
