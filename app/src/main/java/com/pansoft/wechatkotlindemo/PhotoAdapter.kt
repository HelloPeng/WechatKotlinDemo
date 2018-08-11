package com.pansoft.wechatkotlindemo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * 作者：吕振鹏
 * E-mail:lvzhenpeng@pansoft.com
 * 创建时间：2018年08月10日
 * 时间：16:59
 * 版本：v1.0.0
 * 类描述：
 * 修改时间：
 */
class PhotoAdapter() : RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {

    private var mListData: List<ItemBean>? = null

    fun setupData(listData: List<ItemBean>) {
        mListData = listData;
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val rootView = LayoutInflater.from(parent.context).inflate(R.layout.item_photo, parent, false)
        return ViewHolder(rootView)
    }

    override fun getItemCount(): Int {
        return mListData?.size ?: 0
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val photoView = holder.photoView
        photoView?.viewTreeObserver?.addOnGlobalLayoutListener {
            val layoutParams = photoView.layoutParams
            layoutParams.height = photoView.width
            Glide.with(photoView.context)
                    .load(mListData?.get(position)?.imageUrl)
                    .into(photoView)
        }

    }


    inner class ViewHolder(rootView: View) : RecyclerView.ViewHolder(rootView) {
        var photoView: ImageView? = null

        init {
            photoView = rootView.findViewById(R.id.iv_photo)
        }
    }
}