package com.example.arrayadapter.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.arrayadapter.R
import kotlinx.android.synthetic.main.activity_main.*

class Activity_Main : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init(){
        // Create listener for button
        button_simple.setOnClickListener(this)
        button_custom.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        // Start other Activity when clicked
        when(view.id){
            R.id.button_simple -> startActivity(Intent(this, Activity_SimpleListView::class.java))
            R.id.button_custom -> startActivity(Intent(this, Activity_CustomListView::class.java))
        }
    }
}