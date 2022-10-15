package com.mtgmtgsapplication.app.modules.jointhree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.appcomponents.base.BaseActivity
import com.mtgmtgsapplication.app.databinding.ActivityJointhreeBinding
import com.mtgmtgsapplication.app.modules.joinfour.ui.JoinfourActivity
import com.mtgmtgsapplication.app.modules.jointhree.`data`.viewmodel.JointhreeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class JointhreeActivity : BaseActivity<ActivityJointhreeBinding>(R.layout.activity_jointhree) {
  private val viewModel: JointhreeVM by viewModels<JointhreeVM>()

  private val REQUEST_CODE_JOINFOUR_ACTIVITY: Int = 742

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.jointhreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btn1.setOnClickListener {
      val destIntent = JoinfourActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_JOINFOUR_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "JOINTHREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, JointhreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
