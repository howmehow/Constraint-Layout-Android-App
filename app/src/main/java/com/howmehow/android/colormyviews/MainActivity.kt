package com.howmehow.android.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){
        val clickableViews: List<View> =
        listOf(box_one_text, box_two_text, box_three_text, box_four_text, box_five_text, constraint_layout,
        red_button, green_button, yellow_button)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }


    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_red_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_blue_bright)
            R.id.red_button -> view.setBackgroundResource(R.color.my_red)
            R.id.green_button -> view.setBackgroundResource(R.color.my_green)
            R.id.yellow_button -> view.setBackgroundResource(R.color.my_yellow)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}

