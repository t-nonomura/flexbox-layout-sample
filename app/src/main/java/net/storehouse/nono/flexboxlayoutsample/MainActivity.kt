package net.storehouse.nono.flexboxlayoutsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.flexbox.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flexboxLayoutManager = FlexboxLayoutManager(this)
        // 配置方向を指定
        flexboxLayoutManager.flexDirection = FlexDirection.ROW
        // 折り返し方法を指定
        flexboxLayoutManager.flexWrap = FlexWrap.WRAP
        // 主軸方向の揃え位置を指定
        flexboxLayoutManager.justifyContent = JustifyContent.FLEX_START
        // 交差軸方向の揃え位置を指定
        flexboxLayoutManager.alignItems = AlignItems.STRETCH

        // RecyclerViewのLayoutManagerに、カスタムしたFlexboxLayoutManagerを指定
        recycler_view.layoutManager = flexboxLayoutManager
    }
}
