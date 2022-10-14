package com.mtgmtgsapplication.app.modules.hometwo.`data`.model

import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListnameRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_6m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNameOne: String? = MyApp.getInstance().resources.getString(R.string.lbl41)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirteen: String? = MyApp.getInstance().resources.getString(R.string.msg13)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFifty: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_0)

)
