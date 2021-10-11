package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.foodapp.fragment.Account
import com.example.foodapp.fragment.Contact
import com.example.foodapp.fragment.Home
import com.example.foodapp.fragment.Order
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val home = Home()
    private val contact = Contact()
    private val order = Order()
    private val account = Account()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(home)
    bottom_navigation.setOnNavigationItemSelectedListener {
        when(it.itemId){
            R.id.ic_home -> replaceFragment(home)
            R.id.ic_order ->replaceFragment(order)
            R.id.ic_account ->replaceFragment(account)
            R.id.contact -> replaceFragment(contact)
        }
        true
    }
    }
    private fun replaceFragment(fragment : Fragment){
        if(fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fregment_container, fragment)
            transaction.commit()

        }

    }
}