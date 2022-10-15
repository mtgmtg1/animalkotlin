package com.mtgmtgsapplication.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.appcomponents.base.BaseActivity
import com.mtgmtgsapplication.app.databinding.ActivityLoginBinding
import com.mtgmtgsapplication.app.modules.join.ui.JoinActivity
import com.mtgmtgsapplication.app.modules.login.`data`.viewmodel.LoginVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  private val REQUEST_CODE_JOIN_ACTIVITY: Int = 381

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btn.setOnClickListener {
      val destIntent = JoinActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_JOIN_ACTIVITY)
    }
    binding.btn1.setOnClickListener {
      val destIntent = JoinActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_JOIN_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "LOGIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
