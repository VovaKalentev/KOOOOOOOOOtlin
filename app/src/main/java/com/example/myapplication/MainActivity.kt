package com.example.myapplication

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //LayoutParams
        val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 0)
        layoutParams.weight = 0.5f

        val viewParams = LinearLayout.LayoutParams(0,LinearLayout.LayoutParams.MATCH_PARENT)
        viewParams.weight = 0.5f
        viewParams.setMargins(10,10,10,10)

        //LinearLayout
        val ll = LinearLayout(this)
        ll.orientation = LinearLayout.VERTICAL
        ll.gravity = Gravity.CENTER
        ll.weightSum = 1.5f


        var topll = LinearLayout(this)
        topll.layoutParams = layoutParams
        topll.weightSum = 1f

        var midll = LinearLayout(this)
        midll.layoutParams = layoutParams
        midll.weightSum = 1.5f


        var botll = LinearLayout(this)
        botll.layoutParams = layoutParams
        botll.weightSum = 0.5f

        //Views
        var topfirview = View(this)
        topfirview.setBackgroundColor(Color.RED)
        topfirview.layoutParams = viewParams
        var topsecview = View(this)
        topsecview.setBackgroundColor(Color.GRAY)
        topsecview.layoutParams = viewParams
        topll.addView(topfirview)
        topll.addView(topsecview)


        var midfirview = View(this)
        midfirview.setBackgroundColor(Color.YELLOW)
        midfirview.layoutParams = viewParams
        var midsecview = View(this)
        midsecview.setBackgroundColor(Color.GREEN)
        midsecview.layoutParams = viewParams
        var midthirview = View(this)
        midthirview.setBackgroundColor(Color.BLACK)
        midthirview.layoutParams = viewParams

        midll.addView(midfirview)
        midll.addView(midsecview)
        midll.addView(midthirview)

        var botfiriew = View(this)
        botfiriew.setBackgroundColor(Color.LTGRAY)
        botfiriew.layoutParams = viewParams
        botll.addView(botfiriew)

        //Adds
        ll.addView(topll)
        ll.addView(midll)
        ll.addView(botll)
        setContentView(ll)




        hideSystemUI()
    }



    private fun hideSystemUI() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        WindowInsetsControllerCompat(window, window.decorView).let { controller ->
            controller.hide(WindowInsetsCompat.Type.systemBars())
            controller.systemBarsBehavior =
                WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }
    }


}
