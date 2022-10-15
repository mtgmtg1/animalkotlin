package com.mtgmtgsapplication.app.modules.my.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.appcomponents.base.BaseActivity
import com.mtgmtgsapplication.app.databinding.ActivityMyBinding
import com.mtgmtgsapplication.app.modules.chat.ui.ChatActivity
import com.mtgmtgsapplication.app.modules.home.ui.HomeActivity
import com.mtgmtgsapplication.app.modules.my.`data`.viewmodel.MyVM
import com.mtgmtgsapplication.app.modules.reservation.ui.ReservationActivity
import com.mtgmtgsapplication.app.modules.reservationtwo.ui.ReservationtwoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MyActivity : BaseActivity<ActivityMyBinding>(R.layout.activity_my) {
  private val viewModel: MyVM by viewModels<MyVM>()

  private val REQUEST_CODE_CHAT_ACTIVITY: Int = 886


  private val REQUEST_CODE_HOME_ACTIVITY: Int = 379


  private val REQUEST_CODE_RESERVATION_ACTIVITY: Int = 974


  private val REQUEST_CODE_RESERVATIONTWO_ACTIVITY: Int = 917


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.myVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageIconChat.setOnClickListener {
      val destIntent = ChatActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_CHAT_ACTIVITY)
    }
    binding.imageVector.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOME_ACTIVITY)
    }
    binding.imageVectorOne.setOnClickListener {
      val destIntent = ReservationActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_RESERVATION_ACTIVITY)
    }
    binding.imageNavigation.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOME_ACTIVITY)
    }
    binding.linearColumnlabel.setOnClickListener {
      val destIntent = ReservationtwoActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_RESERVATIONTWO_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "MY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
