package org.anyrtc.myapplication.adapter

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import org.anyrtc.myapplication.R
import org.anyrtc.myapplication.data.FirstData

/**
 * Created by wangxl1 on 12/31/21 11:26
 * E-Mail Address： wang_x_le@163.com
 */
class FirstDataAdapter : BaseQuickAdapter<FirstData, BaseViewHolder>(R.layout.item_first_data) {

    override fun convert(helper: BaseViewHolder?, item: FirstData?) {


        helper?.setText(R.id.tv_title, item?.title)
        val recycleView = helper?.getView<RecyclerView>(R.id.recycle_view)
        recycleView?.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
        recycleView?.adapter = SecondDataAdapter().apply {
            setNewData(item?.tests)
        }
    }
}