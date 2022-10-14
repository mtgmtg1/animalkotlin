package com.mtgmtgsapplication.app.modules.jointhree.`data`.model

import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class JointhreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl12)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etSevenValue: String? = MyApp.getInstance().resources.getString(R.string.lbl13)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEightValue: String? = MyApp.getInstance().resources.getString(R.string.lbl15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etNineValue: String? = MyApp.getInstance().resources.getString(R.string.lbl16)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyNineValue: String? = null
)
