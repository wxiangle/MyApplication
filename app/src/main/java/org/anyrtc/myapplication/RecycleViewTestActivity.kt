package org.anyrtc.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_second.*

/**
 * Created by wangxl1 on 12/28/21 14:47
 * E-Mail Address： wang_x_le@163.com
 */
class RecycleViewTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        rv_data.layoutManager = LinearLayoutManager(this)

    }

}