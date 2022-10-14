package com.mtgmtgsapplication.app.modules.hometwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mtgmtgsapplication.app.modules.hometwo.`data`.model.HometwoModel
import com.mtgmtgsapplication.app.modules.hometwo.`data`.model.ListnameRowModel
import com.mtgmtgsapplication.app.modules.hometwo.`data`.model.ListrectangletwentytwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HometwoVM : ViewModel(), KoinComponent {
  val hometwoModel: MutableLiveData<HometwoModel> = MutableLiveData(HometwoModel())

  var navArguments: Bundle? = null

  val listnameList: MutableLiveData<MutableList<ListnameRowModel>> =
      MutableLiveData(mutableListOf())

  val listrectangletwentytwoList: MutableLiveData<MutableList<ListrectangletwentytwoRowModel>> =
      MutableLiveData(mutableListOf())
}
