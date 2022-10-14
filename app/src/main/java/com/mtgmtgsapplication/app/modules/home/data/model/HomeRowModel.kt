package com.mtgmtgsapplication.app.modules.home.`data`.model

import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNameFour: String? = MyApp.getInstance().resources.getString(R.string.lbl37)

)
