package com.mtgmtgsapplication.app.modules.home.`data`.model

import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHamster: String? = MyApp.getInstance().resources.getString(R.string.lbl25)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDog: String? = MyApp.getInstance().resources.getString(R.string.lbl29)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabel: String? = MyApp.getInstance().resources.getString(R.string.lbl30)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViewAll: String? = MyApp.getInstance().resources.getString(R.string.lbl31)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSeventeen: String? = MyApp.getInstance().resources.getString(R.string.lbl32)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEleven: String? = MyApp.getInstance().resources.getString(R.string.msg10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwelve: String? = MyApp.getInstance().resources.getString(R.string.msg11)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl33)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNameOne: String? = MyApp.getInstance().resources.getString(R.string.lbl34)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNameTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl35)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNameThree: String? = MyApp.getInstance().resources.getString(R.string.lbl36)

)
