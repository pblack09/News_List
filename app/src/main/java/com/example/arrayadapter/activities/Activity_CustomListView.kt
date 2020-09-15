package com.example.arrayadapter.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.arrayadapter.R
import com.example.arrayadapter.adapter.AdapterNews
import com.example.arrayadapter.models.News
import kotlinx.android.synthetic.main.activity__custom_list_view.*

class Activity_CustomListView : AppCompatActivity() {

    var mList: ArrayList<News> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__custom_list_view)

        init()
    }

    private fun init(){
        generateData()

        var adapterNews = AdapterNews(this, mList)

        list_view.adapter = adapterNews
    }

    private fun generateData(){
        mList.add(News("Covid Vaccine Trials", R.drawable.covid,"Some pharmaceutical companies are well into the final phase of clinical trials."))
        mList.add(News("Woodward's Book", R.drawable.woodward,"Woodward's new book casts light on Trump's fight with the WHO."))
        mList.add(News("Mining Company Blowout", R.drawable.mining,"A mining company blew up a 46,000-year-old aboriginal site. Its CEO is resigning."))
        mList.add(News("Oregon Grapples with Historic Fires", R.drawable.oregon,"Historic fires have forced thousands from their homes across the state."))
        mList.add(News("Protests for Racial Justice", R.drawable.houston,"4 Houston police officers fired over fatal shooting of Nicolas Chavez."))
        mList.add(News("More Groceries, Less Gas", R.drawable.groceries,"Consumer prices rose 1.3% over the last 12 months. Some economists say the pandemic has shaped what/how we buy goods."))
    }
}