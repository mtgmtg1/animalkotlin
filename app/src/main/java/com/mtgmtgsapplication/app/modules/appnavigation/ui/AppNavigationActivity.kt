package com.mtgmtgsapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.appcomponents.base.BaseActivity
import com.mtgmtgsapplication.app.databinding.ActivityAppNavigationBinding
import com.mtgmtgsapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.mtgmtgsapplication.app.modules.chat.ui.ChatActivity
import com.mtgmtgsapplication.app.modules.home.ui.HomeActivity
import com.mtgmtgsapplication.app.modules.hometwo.ui.HometwoActivity
import com.mtgmtgsapplication.app.modules.join.ui.JoinActivity
import com.mtgmtgsapplication.app.modules.joinfour.ui.JoinfourActivity
import com.mtgmtgsapplication.app.modules.jointhree.ui.JointhreeActivity
import com.mtgmtgsapplication.app.modules.jointwo.ui.JointwoActivity
import com.mtgmtgsapplication.app.modules.login.ui.LoginActivity
import com.mtgmtgsapplication.app.modules.my.ui.MyActivity
import com.mtgmtgsapplication.app.modules.reservation.ui.ReservationActivity
import com.mtgmtgsapplication.app.modules.reservationtwo.ui.ReservationtwoActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearReservationTwo.setOnClickListener {
      val destIntent = ReservationtwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearReservation.setOnClickListener {
      val destIntent = ReservationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMy.setOnClickListener {
      val destIntent = MyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHomeTwo.setOnClickListener {
      val destIntent = HometwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearJoinThree.setOnClickListener {
      val destIntent = JointhreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHome.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLogin.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearJoinFour.setOnClickListener {
      val destIntent = JoinfourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearJoin.setOnClickListener {
      val destIntent = JoinActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearChat.setOnClickListener {
      val destIntent = ChatActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearJoinTwo.setOnClickListener {
      val destIntent = JointwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
