package com.mtgmtgsapplication.app.modules.hometwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.appcomponents.base.BaseActivity
import com.mtgmtgsapplication.app.databinding.ActivityHometwoBinding
import com.mtgmtgsapplication.app.modules.chat.ui.ChatActivity
import com.mtgmtgsapplication.app.modules.hometwo.`data`.model.ListnameRowModel
import com.mtgmtgsapplication.app.modules.hometwo.`data`.model.ListrectangletwentytwoRowModel
import com.mtgmtgsapplication.app.modules.hometwo.`data`.viewmodel.HometwoVM
import com.mtgmtgsapplication.app.modules.my.ui.MyActivity
import com.mtgmtgsapplication.app.modules.reservation.ui.ReservationActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HometwoActivity : BaseActivity<ActivityHometwoBinding>(R.layout.activity_hometwo) {
  private val viewModel: HometwoVM by viewModels<HometwoVM>()

  private val REQUEST_CODE_RESERVATION_ACTIVITY: Int = 590


  private val REQUEST_CODE_CHAT_ACTIVITY: Int = 686


  private val REQUEST_CODE_MY_ACTIVITY: Int = 775


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listnameAdapter = ListnameAdapter(viewModel.listnameList.value?:mutableListOf())
    binding.recyclerListname.adapter = listnameAdapter
    listnameAdapter.setOnItemClickListener(
    object : ListnameAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListnameRowModel) {
        onClickRecyclerListname(view, position, item)
      }
    }
    )
    viewModel.listnameList.observe(this) {
      listnameAdapter.updateData(it)
    }
    val listrectangletwentytwoAdapter =
    ListrectangletwentytwoAdapter(viewModel.listrectangletwentytwoList.value?:mutableListOf())
    binding.recyclerListrectangletwentytwo.adapter = listrectangletwentytwoAdapter
    listrectangletwentytwoAdapter.setOnItemClickListener(
    object : ListrectangletwentytwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrectangletwentytwoRowModel) {
        onClickRecyclerListrectangletwentytwo(view, position, item)
      }
    }
    )
    viewModel.listrectangletwentytwoList.observe(this) {
      listrectangletwentytwoAdapter.updateData(it)
    }
    binding.hometwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageVectorOne.setOnClickListener {
      val destIntent = ReservationActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_RESERVATION_ACTIVITY)
    }
    binding.imageIconChat.setOnClickListener {
      val destIntent = ChatActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_CHAT_ACTIVITY)
    }
    binding.imageVectorTwo.setOnClickListener {
      val destIntent = MyActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_MY_ACTIVITY)
    }
  }

  fun onClickRecyclerListname(
    view: View,
    position: Int,
    item: ListnameRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnthirteen -> {
        onClickRecyclerListnameLinearColumnthirteen(view, position, item)
      }
    }
  }

  fun onClickRecyclerListrectangletwentytwo(
    view: View,
    position: Int,
    item: ListrectangletwentytwoRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowrectangletwentytwo -> {
        val destIntent = ChatActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_CHAT_ACTIVITY)
      }
    }
  }

  fun onClickRecyclerListnameLinearColumnthirteen(
    view: View,
    position: Int,
    item: ListnameRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = ReservationActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_RESERVATION_ACTIVITY)
      }
      1 -> {
        val destIntent = ReservationActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_RESERVATION_ACTIVITY)
      }
    }
  }

  companion object {
    const val TAG: String = "HOMETWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HometwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
