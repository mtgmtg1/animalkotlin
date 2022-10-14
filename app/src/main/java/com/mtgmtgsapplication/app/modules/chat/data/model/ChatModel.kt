package com.mtgmtgsapplication.app.modules.chat.`data`.model

import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChatModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl53)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDetail: String? = MyApp.getInstance().resources.getString(R.string.lbl41)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.lbl55)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextOne: String? = MyApp.getInstance().resources.getString(R.string.msg20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl56)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etWritingColumsValue: String? = null
)
