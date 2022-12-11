package com.gya.work

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

var F1: BlankFragment1? = null
var F2: BlankFragment2? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        F1 = BlankFragment1()
        F2 = BlankFragment2()

        val B1: Button = findViewById(R.id.button)
        val B2: Button = findViewById(R.id.button2)

        var Ft: FragmentTransaction? = null
        B1.setOnClickListener {
            if (Ft == null) {
                Ft = supportFragmentManager.beginTransaction()
                Ft!!.replace(R.id.frem, F1!!)
                Ft!!.commit()
            } else {
                Ft = supportFragmentManager.beginTransaction()
                Ft!!.replace(R.id.frem, F1!!)
                Ft!!.commit()
            }
        }
        B2.setOnClickListener {
            if (Ft == null) {
                Ft = supportFragmentManager.beginTransaction()
                Ft!!.replace(R.id.frem, F2!!)
                Ft!!.commit()
            } else {
                Ft = supportFragmentManager.beginTransaction()
                Ft!!.replace(R.id.frem, F2!!)
                Ft!!.commit()
            }
        }
    }
}