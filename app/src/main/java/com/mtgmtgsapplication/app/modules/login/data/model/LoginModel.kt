package com.mtgmtgsapplication.app.modules.login.`data`.model

import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyFourValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyFiveValue: String? = null
)
