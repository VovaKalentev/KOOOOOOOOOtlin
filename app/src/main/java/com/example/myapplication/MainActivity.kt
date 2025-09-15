package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }

//    var num = 0
//    fun onClick(view: View) {
//        num += 1
//        var textView = findViewById<TextView>(R.id.text)
//        textView.text = "Кликов: ${num}"
//        if ( num==10)
//        {
//            var ll = findViewById<LinearLayout>(R.id.ll)
//            val newText = TextView(this).apply {
//                text = "Ёу!"
//                layoutParams = LinearLayout.LayoutParams(
//                    LinearLayout.LayoutParams.WRAP_CONTENT,
//                    LinearLayout.LayoutParams.WRAP_CONTENT
//                )
//
//            }
//            ll.addView(newText);
//            textView.text = "ЁЁЁЁЁЁЁЁЁЁЁЁЁЁЁЁЁЁЁЁЁЁЁЁЁЁЁЁЁЁЁЁЁЁуЁЁЁЁу"
//            num = 0
//        }
//    }
}
