package com.mtgmtgsapplication.app.modules.reservation.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.appcomponents.base.BaseActivity
import com.mtgmtgsapplication.app.databinding.ActivityReservationBinding
import com.mtgmtgsapplication.app.modules.chat.ui.ChatActivity
import com.mtgmtgsapplication.app.modules.home.ui.HomeActivity
import com.mtgmtgsapplication.app.modules.my.ui.MyActivity
import com.mtgmtgsapplication.app.modules.reservation.`data`.model.ListfRowModel
import com.mtgmtgsapplication.app.modules.reservation.`data`.model.ListsRowModel
import com.mtgmtgsapplication.app.modules.reservation.`data`.viewmodel.ReservationVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ReservationActivity : BaseActivity<ActivityReservationBinding>(R.layout.activity_reservation)
    {
  private val viewModel: ReservationVM by viewModels<ReservationVM>()

  private val REQUEST_CODE_CHAT_ACTIVITY: Int = 235


  private val REQUEST_CODE_MY_ACTIVITY: Int = 157


  private val REQUEST_CODE_HOME_ACTIVITY: Int = 826


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listsAdapter = ListsAdapter(viewModel.listsList.value?:mutableListOf())
    binding.recyclerLists.adapter = listsAdapter
    listsAdapter.setOnItemClickListener(
    object : ListsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListsRowModel) {
        onClickRecyclerLists(view, position, item)
      }
    }
    )
    viewModel.listsList.observe(this) {
      listsAdapter.updateData(it)
    }
    val listfAdapter = ListfAdapter(viewModel.listfList.value?:mutableListOf())
    binding.recyclerListf.adapter = listfAdapter
    listfAdapter.setOnItemClickListener(
    object : ListfAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListfRowModel) {
        onClickRecyclerListf(view, position, item)
      }
    }
    )
    viewModel.listfList.observe(this) {
      listfAdapter.updateData(it)
    }
    binding.reservationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowellipseninetyfourOne.setOnClickListener {
      val destIntent = ChatActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_CHAT_ACTIVITY)
    }
    binding.linearRowellipseninetyfour.setOnClickListener {
      val destIntent = ChatActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_CHAT_ACTIVITY)
    }
    binding.imageVectorTwo.setOnClickListener {
      val destIntent = MyActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_MY_ACTIVITY)
    }
    binding.imageIconChat.setOnClickListener {
      val destIntent = ChatActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_CHAT_ACTIVITY)
    }
    binding.imageVector.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOME_ACTIVITY)
    }
  }

  fun onClickRecyclerLists(
    view: View,
    position: Int,
    item: ListsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListf(
    view: View,
    position: Int,
    item: ListfRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "RESERVATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ReservationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
