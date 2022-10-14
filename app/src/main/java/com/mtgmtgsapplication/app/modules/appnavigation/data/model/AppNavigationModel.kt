package com.mtgmtgsapplication.app.modules.appnavigation.`data`.model

import com.mtgmtgsapplication.app.R
import com.mtgmtgsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJoin: String? = MyApp.getInstance().resources.getString(R.string.lbl_join)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJoinTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_jointwo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJoinThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_jointhree)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJoinFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_joinfour)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_hometwo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReservation: String? = MyApp.getInstance().resources.getString(R.string.lbl_reservation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReservationTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_reservationtwo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChat: String? = MyApp.getInstance().resources.getString(R.string.lbl_chat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMy: String? = MyApp.getInstance().resources.getString(R.string.lbl_my)

)
