package com.example.arrayadapter.adapter

import android.content.Context
import android.graphics.drawable.Drawable.createFromPath
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.arrayadapter.R
import com.example.arrayadapter.models.News
import kotlinx.android.synthetic.main.row_list_view_adapter.view.*

                    // mContext     provides context from the Activity it's called from
                    // mList        provides the data
class AdapterNews(private var mContext: Context, private var mList: ArrayList<News>) : BaseAdapter(){

    override fun getCount(): Int {
        // Return size of list for #s of items to generate
        // How many items are in the ArrayList?
        return mList.size
        // If mList.size == 5, 5 items will be generated
    }

    override fun getItem(position: Int): Any {
        // Return info from index at given position
        return mList.get(position)
    }

    override fun getItemId(position: Int): Long {
        // There is no "id" value in the class News,
        // so the index position acts as the id.
        return position.toLong()
    }

        // getCount = how many times this is called
        // getItemId
    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
                                      // where            // your custom layout
        var view = LayoutInflater.from(mContext).inflate(R.layout.row_list_view_adapter, parent, false)

        var news = mList.get(position)

        view.image_view.setImageResource(news.image)
        view.text_view_title.text = news.title
        view.text_view_description.text = news.description

        return view
    }

}