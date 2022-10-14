package com.mtgmtgsapplication.app.modules.chat.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.appcomponents.base.BaseActivity
import com.mtgmtgsapplication.app.databinding.ActivityChatBinding
import com.mtgmtgsapplication.app.modules.chat.`data`.viewmodel.ChatVM
import com.mtgmtgsapplication.app.modules.my.ui.MyActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ChatActivity : BaseActivity<ActivityChatBinding>(R.layout.activity_chat) {
  private val viewModel: ChatVM by viewModels<ChatVM>()

  private val REQUEST_CODE_MY_ACTIVITY: Int = 307


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.chatVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.floatingBtnFloatingactionbutton.setOnClickListener {
      val destIntent = MyActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_MY_ACTIVITY)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CHAT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChatActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
