package com.example.myapplication

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
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

    fun changeColor(view: View) {
        val arr = arrayOf(
            findViewById<View>(R.id.fir),
            findViewById<View>(R.id.sec),
            findViewById<View>(R.id.thir),
            findViewById<View>(R.id.fourth),
            findViewById<View>(R.id.fifth),
        )
        for (view in arr){
            if((view.background as? ColorDrawable)?.color  == Color.YELLOW){
                view.setBackgroundColor(Color.RED)
            }else{
                view.setBackgroundColor(Color.YELLOW)
            }
        }
    }


}
