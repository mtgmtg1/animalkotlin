package com.mtgmtgsapplication.app.modules.reservationtwo.`data`.model

import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Listf1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtF: String? = MyApp.getInstance().resources.getString(R.string.lbl_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_82)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFifteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_152)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_222)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyNineOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_292)

)
