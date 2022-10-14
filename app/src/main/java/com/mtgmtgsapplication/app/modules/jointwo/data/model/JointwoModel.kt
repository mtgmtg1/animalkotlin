package com.mtgmtgsapplication.app.modules.jointwo.`data`.model

import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class JointwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.msg3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.msg4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFour: String? = MyApp.getInstance().resources.getString(R.string.msg5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFive: String? = MyApp.getInstance().resources.getString(R.string.msg6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescrption: String? = MyApp.getInstance().resources.getString(R.string.lbl10)

)
