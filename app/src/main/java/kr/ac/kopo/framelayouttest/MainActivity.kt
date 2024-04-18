package kr.ac.kopo.framelayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var btn1 : Button
    lateinit var btn2 : Button
    lateinit var btn3 : Button
    lateinit var imgv1 :ImageView
    lateinit var imgv2 :ImageView
    lateinit var imgv3 :ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById<Button>(R.id.btn1)
        btn2 = findViewById<Button>(R.id.btn2)
        btn3 = findViewById<Button>(R.id.btn3)

        imgv1 = findViewById<ImageView>(R.id.imgv1)
        imgv2 = findViewById<ImageView>(R.id.imgv2)
        imgv3 = findViewById<ImageView>(R.id.imgv3)
    }
}