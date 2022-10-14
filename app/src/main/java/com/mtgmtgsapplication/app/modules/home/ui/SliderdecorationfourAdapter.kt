package com.mtgmtgsapplication.app.modules.home.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.mtgmtgsapplication.app.databinding.SlideritemHome1Binding
import com.mtgmtgsapplication.app.modules.home.`data`.model.ImageSliderSliderdecorationfourModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderdecorationfourAdapter(
  val dataList: ArrayList<ImageSliderSliderdecorationfourModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderdecorationfourModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemHome1Binding) {
      binding.imageSliderSliderdecorationfourModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemHome1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
