package com.pansoft.wechatkotlindemo

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * 作者：吕振鹏
 * E-mail:lvzhenpeng@pansoft.com
 * 创建时间：2018年08月10日
 * 时间：17:29
 * 版本：v1.0.0
 * 类描述：
 * 修改时间：
 */
class SpacesItemDecoration(private var space: Int) : RecyclerView.ItemDecoration() {


    override fun getItemOffsets(outRect: Rect, view: View,
                                parent: RecyclerView, state: RecyclerView.State) {
        outRect.left = space
        outRect.right = space
        outRect.bottom = space
        outRect.top = space
    }

}