package com.mtgmtgsapplication.app.modules.joinfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.appcomponents.base.BaseActivity
import com.mtgmtgsapplication.app.databinding.ActivityJoinfourBinding
import com.mtgmtgsapplication.app.modules.home.ui.HomeActivity
import com.mtgmtgsapplication.app.modules.joinfour.`data`.viewmodel.JoinfourVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class JoinfourActivity : BaseActivity<ActivityJoinfourBinding>(R.layout.activity_joinfour) {
  private val viewModel: JoinfourVM by viewModels<JoinfourVM>()

  private val REQUEST_CODE_HOME_ACTIVITY: Int = 692


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.joinfourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btn1.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOME_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "JOINFOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, JoinfourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
