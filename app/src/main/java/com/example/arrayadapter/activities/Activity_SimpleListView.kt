package com.example.arrayadapter.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.arrayadapter.R
import kotlinx.android.synthetic.main.activity__simple_list_view.*

class Activity_SimpleListView : AppCompatActivity() {

    // Declare ArrayList for data
    var mList: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__simple_list_view)

        init()
    }

    private fun init(){
        generateData()

        // Create the Adapter and pass data (mList) to the adapter
        var myAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, mList)

        list_view.adapter = myAdapter

        // Set click action for each item in the AdapterView
        list_view.setOnItemClickListener(object: AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, item: View?, position: Int, itemId: Long) {

                // Inside the applicationContext, get the item at the position clicked, make a short alert, and show it
                Toast.makeText(applicationContext, myAdapter.getItem(position), Toast.LENGTH_SHORT).show()
            }
        })
    }

    // Generate data for ArrayAdapter
    private fun generateData(){
        mList.add("Dallas Cowboys")
        mList.add("New York Giants")
        mList.add("Philadelphia Eagles")
        mList.add("Washington Redskins")
        mList.add("Denver Broncos")
        mList.add("Pittsburgh Steelers")
        mList.add("San Francisco 49ers")
        mList.add("Oakland Raiders")
        mList.add("Tampa Bay Buccaneers")
        mList.add("Miami Dolphins")
        mList.add("Indianapolis Colts")
        mList.add("Cleveland Browns")
        mList.add("Green Bay Packers")
        mList.add("Minnesota Vikings")
        mList.add("Detroit Lions")
        mList.add("New England Patriots")
    }
}