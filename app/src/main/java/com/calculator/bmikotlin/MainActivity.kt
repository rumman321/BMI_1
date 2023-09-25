package com.calculator.bmikotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var   editText2:EditText
    private lateinit var   editText3:EditText
    private lateinit var   button2:Button
    private lateinit var   textView4:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText2=findViewById(R.id.editText2)
        editText3=findViewById(R.id.editText3)
        button2=findViewById(R.id.button2)
        textView4=findViewById(R.id.textView4)

        button2.setOnClickListener {
            val a=editText2.getText().toString()
            val b=editText2.getText().toString()

             val c = a.toDouble()/((b.toDouble())*(b.toDouble()))
            textView4.setText(c)
        }
    }
}

private fun TextView.setText(c: Double) {

}
