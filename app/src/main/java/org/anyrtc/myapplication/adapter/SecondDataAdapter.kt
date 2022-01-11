package org.anyrtc.myapplication.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import org.anyrtc.myapplication.R
import org.anyrtc.myapplication.data.SecondData

/**
 * Created by wangxl1 on 12/31/21 11:30
 * E-Mail Address： wang_x_le@163.com
 */
class SecondDataAdapter : BaseQuickAdapter<SecondData, BaseViewHolder>(R.layout.item_second) {
    override fun convert(helper: BaseViewHolder?, item: SecondData?) {
        helper?.setText(R.id.tv_text, item?.text)
    }
}