package com.felix.miprimeraapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this).apply {
            text = "¡Hola Félix, mi cuarta App nativa!"
            textSize = 24f
            setPadding(50, 50, 50, 50)
        }

        setContentView(textView)
    }
}
