package com.mtgmtgsapplication.app.modules.jointwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.appcomponents.base.BaseActivity
import com.mtgmtgsapplication.app.databinding.ActivityJointwoBinding
import com.mtgmtgsapplication.app.modules.jointhree.ui.JointhreeActivity
import com.mtgmtgsapplication.app.modules.jointwo.`data`.viewmodel.JointwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class JointwoActivity : BaseActivity<ActivityJointwoBinding>(R.layout.activity_jointwo) {
  private val viewModel: JointwoVM by viewModels<JointwoVM>()

  private val REQUEST_CODE_JOINTHREE_ACTIVITY: Int = 712

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.jointwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btn.setOnClickListener {
      val destIntent = JointhreeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_JOINTHREE_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "JOINTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, JointwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
