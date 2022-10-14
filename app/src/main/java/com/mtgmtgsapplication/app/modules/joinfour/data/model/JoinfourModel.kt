package com.mtgmtgsapplication.app.modules.joinfour.`data`.model

import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class JoinfourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl19)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFive: String? = MyApp.getInstance().resources.getString(R.string.msg_52)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentySixValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyEightValue: String? = null
)
