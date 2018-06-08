package com.example.yoshizawarei.dynamicuidemo

import android.content.DialogInterface
import android.graphics.Point
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.Gravity
import android.view.ViewGroup
import android.widget.*

class MainActivity : AppCompatActivity() {

    val countries = arrayOf("brazil", "canada", "china",
            "italy", "japan", "korea", "mexico", "thailand", "turkey", "usa")

    private val fact = arrayOf(
            "aaa",
            "bbb",
            "ccc",
            "ddd",
            "eee",
            "fff",
            "ggg",
            "hhh",
            "iii",
            "kkk"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gridLayout = findViewById<GridLayout>(R.id.main_linear)

        for (i in 0 until countries.size) {
            val countryBox = layoutInflater.inflate(R.layout.country_flag, null)
            val flagImage = countryBox.findViewById<ImageView>(R.id.country_image)
            val countryName = countryBox.findViewById<TextView>(R.id.country_text)
            flagImage.setImageResource(resources.getIdentifier(countries[i], "drawable", packageName))
            countryName.text = countries[i].capitalize()
            flagImage.setOnClickListener{
                Toast.makeText(this, countries[i], Toast.LENGTH_SHORT).show()

                var customDialog = CustomDialog(this)
                customDialog.show()

                // builder
//                var builder = AlertDialog.Builder(this)
//                builder.setTitle("Fact!")
//                builder.setMessage(fact[i])
//                builder.setPositiveButton("TRUE", DialogInterface.OnClickListener { dialog, which ->
//                    // when positive button is clicked
//                })
//                builder.setNegativeButton("FALSE", DialogInterface.OnClickListener { dialog, which ->
//                    // when negative button is clicked
//                })
//
//                // dialog to create from builder
//                var alertDialog = builder.create()
//                alertDialog.show()
            }



            gridLayout.addView(countryBox)
        }

//        // TextView tv = new TextView(this)
//        val tv = TextView(this)
//        tv.setText("a")
//
//        // Button width = half the screen size
//        val display = windowManager.defaultDisplay
//        val endPoint = Point() // [0, 0]
//        display.getSize(endPoint) // gets the display's size put the size int 'endPoint'
//
//        val screenWidth = endPoint.x
//        val screenHeight = endPoint.y
//
//        val butt = Button(this)
//        butt.setText("b")
//
//        val layoutParams = LinearLayout.LayoutParams(
//                screenWidth / 2,
//                screenHeight / 2)
//        butt.layoutParams = layoutParams
//
//        val linearLayout = findViewById <LinearLayout>(R.id.main_linear)
//        linearLayout.addView(tv)
//        linearLayout.addView(butt)

    }
}