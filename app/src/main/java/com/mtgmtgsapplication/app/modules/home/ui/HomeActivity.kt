package com.mtgmtgsapplication.app.modules.home.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.appcomponents.base.BaseActivity
import com.mtgmtgsapplication.app.appcomponents.views.ImagePickerFragmentDialog
import com.mtgmtgsapplication.app.databinding.ActivityHomeBinding
import com.mtgmtgsapplication.app.modules.chat.ui.ChatActivity
import com.mtgmtgsapplication.app.modules.home.`data`.model.HomeRowModel
import com.mtgmtgsapplication.app.modules.home.`data`.model.ImageSliderSliderdecorationfourModel
import com.mtgmtgsapplication.app.modules.home.`data`.viewmodel.HomeVM
import com.mtgmtgsapplication.app.modules.hometwo.ui.HometwoActivity
import com.mtgmtgsapplication.app.modules.my.ui.MyActivity
import com.mtgmtgsapplication.app.modules.reservation.ui.ReservationActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.mtgmtgsapplication.app/drawable/img_decoration3")


  private val imageSliderSliderdecorationfourItems: ArrayList<ImageSliderSliderdecorationfourModel>
      = arrayListOf(ImageSliderSliderdecorationfourModel(imageDecorationThree =
  imageUri.toString()),ImageSliderSliderdecorationfourModel(imageDecorationThree =
  imageUri.toString()))


  private val viewModel: HomeVM by viewModels<HomeVM>()

  private val REQUEST_CODE_HOMETWO_ACTIVITY: Int = 374

  private val REQUEST_CODE_MY_ACTIVITY: Int = 473

  private val REQUEST_CODE_RESERVATION_ACTIVITY: Int = 280

  private val REQUEST_CODE_CHAT_ACTIVITY: Int = 104

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderdecorationfourAdapter =
    SliderdecorationfourAdapter(imageSliderSliderdecorationfourItems,true)
    binding.imageSliderSliderdecorationfour.adapter = sliderdecorationfourAdapter
    binding.imageSliderSliderdecorationfour.onIndicatorProgress = { selectingPosition,
      progress ->
      binding.indicatorMenu.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorMenu.updateIndicatorCounts(binding.imageSliderSliderdecorationfour.indicatorCount)
    val homeAdapter = HomeAdapter(viewModel.homeList.value?:mutableListOf())
    binding.recyclerHome.adapter = homeAdapter
    homeAdapter.setOnItemClickListener(
    object : HomeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeRowModel) {
        onClickRecyclerHome(view, position, item)
      }
    }
    )
    viewModel.homeList.observe(this) {
      homeAdapter.updateData(it)
    }
    binding.homeVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderdecorationfour.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderdecorationfour.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {


    binding.imageCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
    binding.linearRowname.setOnClickListener {
      val destIntent = HometwoActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOMETWO_ACTIVITY)
    }
    binding.imageVectorTwo.setOnClickListener {
      val destIntent = MyActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_MY_ACTIVITY)
    }
    binding.imageVectorOne.setOnClickListener {
      val destIntent = ReservationActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_RESERVATION_ACTIVITY)
    }
    binding.linearRowgrid.setOnClickListener {
      val destIntent = HometwoActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOMETWO_ACTIVITY)
    }
    binding.imageIconChat.setOnClickListener {
      val destIntent = ChatActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_CHAT_ACTIVITY)
    }
    binding.linearRowgroupseventeen.setOnClickListener {
      val destIntent = HometwoActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOMETWO_ACTIVITY)
    }
  }

  fun onClickRecyclerHome(
    view: View,
    position: Int,
    item: HomeRowModel
  ): Unit {
    when(view.id) {
      R.id.linearCard ->  {
        onClickRecyclerHomeLinearCard(view, position, item)
      }
    }
  }

  fun onClickRecyclerHomeLinearCard(
    view: View,
    position: Int,
    item: HomeRowModel
  ) {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 ->  {
        val destIntent = HometwoActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_HOMETWO_ACTIVITY)
      }
      1 ->  {
        val destIntent = HometwoActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_HOMETWO_ACTIVITY)
      }
    }
  }

  companion object {
    const val TAG: String = "HOME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
