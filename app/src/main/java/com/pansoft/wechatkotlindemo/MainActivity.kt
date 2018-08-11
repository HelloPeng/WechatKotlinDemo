package com.pansoft.wechatkotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper

class MainActivity : AppCompatActivity() {

    private var mRecyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRecyclerView = findViewById(R.id.recycler_view)
        initRecyclerView()

    }

    private fun initRecyclerView() {
        val listData: ArrayList<ItemBean> = ArrayList()
        ImageConstants.IMAGE.forEach {
            val itemBean = ItemBean(it, 0, true)
            listData.add(itemBean)
        }
        mRecyclerView?.layoutManager = object : GridLayoutManager(this, 3) {
            override fun canScrollVertically(): Boolean {
                return false
            }
        }
        val itemTouchHelper = ItemTouchHelper(ItemTouchCallback(
                ItemTouchHelper.UP or ItemTouchHelper.DOWN or ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT
                , 0))
        itemTouchHelper.attachToRecyclerView(mRecyclerView)
        mRecyclerView?.addItemDecoration(SpacesItemDecoration(10))
        val adapter = PhotoAdapter()
        mRecyclerView?.adapter = adapter
        adapter.setupData(listData)
        adapter.notifyDataSetChanged()
    }
}
