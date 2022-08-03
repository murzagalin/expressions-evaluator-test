package com.github.murzagalin.etest.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.murzagalin.etest.Expression
import android.widget.TextView

fun calc(): String {
    return Expression().calculate()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = calc()
    }
}
