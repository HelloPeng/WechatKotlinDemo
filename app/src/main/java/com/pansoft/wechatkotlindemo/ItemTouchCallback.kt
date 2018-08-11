package com.pansoft.wechatkotlindemo

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper

/**
 * 作者：吕振鹏
 * E-mail:lvzhenpeng@pansoft.com
 * 创建时间：2018年08月10日
 * 时间：17:10
 * 版本：v1.0.0
 * 类描述：
 * 修改时间：
 */
class ItemTouchCallback(dragDirs: Int, swipeDirs: Int) : ItemTouchHelper.SimpleCallback(dragDirs, swipeDirs) {

    override fun onMove(recyclerView: RecyclerView?, viewHolder: RecyclerView.ViewHolder?,
                        target: RecyclerView.ViewHolder?): Boolean {
        /*//得到当拖拽的viewHolder的Position
        val fromPosition = viewHolder.getAdapterPosition()
        //拿到当前拖拽到的item的viewHolder
        val toPosition = target.getAdapterPosition()
        if (fromPosition < toPosition) {
            for (i in fromPosition until toPosition) {
                Collections.swap(datas, i, i + 1)
            }
        } else {
            for (i in fromPosition downTo toPosition + 1) {
                Collections.swap(datas, i, i - 1)
            }
        }
       // myAdapter.notifyItemMoved(fromPosition, toPosition)*/
        return true
    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder?, direction: Int) {

    }

}