package com.mtgmtgsapplication.app.modules.join.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.appcomponents.base.BaseActivity
import com.mtgmtgsapplication.app.databinding.ActivityJoinBinding
import com.mtgmtgsapplication.app.modules.join.`data`.viewmodel.JoinVM
import com.mtgmtgsapplication.app.modules.jointwo.ui.JointwoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class JoinActivity : BaseActivity<ActivityJoinBinding>(R.layout.activity_join) {
  private val viewModel: JoinVM by viewModels<JoinVM>()

  private val REQUEST_CODE_JOINTWO_ACTIVITY: Int = 439

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.joinVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btn.setOnClickListener {
      val destIntent = JointwoActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_JOINTWO_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "JOIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, JoinActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
